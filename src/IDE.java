/*          TECNOLÓGICO DE COSTA RICA
              UNIDAD DE COMPUTACIÓN
             COMPILADORES PROYECTO
             ----------------------
             CHRISTIAN SÁNCHEZ SALAS
             KATHERINE TUZ CARRILLO
*/

import javax.swing.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;

public class IDE {
    private JButton compileButton;
    private JButton showASTButton;
    private JScrollPane scroller;
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextArea OUTTextArea;

    private ParseTree tree = null;

    MiScanner inst = null;
    MiParser parser = null;
    CharStream input=null; //"string" de caracateres
    CommonTokenStream tokens = null; //"string" de tokens
    MyErrorListener errorListener = null;

    public IDE() {
        JFrame frame = new JFrame("PARSER PROJECT");

        frame.setSize(500, 500);
        frame.setBounds(400, 150, 500, 500);
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        errorListener = new MyErrorListener();


        LineNumberingTextArea lineNumberingTextArea = new LineNumberingTextArea(textArea1);
        scroller.setRowHeaderView(lineNumberingTextArea);
        // scroller.setColumnHeader();
        try {
            FileReader fr = new FileReader("My_Code.txt");
            BufferedReader reader = new BufferedReader(fr);
            textArea1.read(reader, "textArea1");
            String line;
            while ((line = reader.readLine()) != null)
            {
                textArea1.append(line + "\n");
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("no such file exists");
        }
        catch (IOException ex) {
            System.out.println("unkownerror");
        }

        compileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OUTTextArea.setText(null);
                try{
                    PrintWriter writer = new PrintWriter("My_Code.txt", "UTF-8");
                    writer.println(textArea1.getText());
                    writer.close();
                    try {
                        input = CharStreams.fromFileName("My_Code.txt"); // all lo que tenga el archivo se carga en CharStreams
                        inst = new MiScanner(input);
                        tokens = new CommonTokenStream(inst);
                        parser = new MiParser(tokens);

                        inst.removeErrorListeners();
                        inst.addErrorListener( errorListener );

                        parser.removeErrorListeners();
                        parser.addErrorListener ( errorListener );

                        //-----------ARBOL
                        try {

                            tree = parser.program();
                        }
                        catch(RecognitionException er){
                            System.out.println("Error");
                            er.printStackTrace();
                        }
                        if (errorListener.hasErrors() == false) {
                            // System.out.println("Compilación Exitosa!\n");
                            OUTTextArea.setText(null);
                            OUTTextArea.setForeground(Color.BLUE);
                            OUTTextArea.setText("SUCCESFULLY COMPILATION! FOR SURE 100 GRADE ^.^ ");
                            errorListener.errorMsgs.clear();
                        }
                        else {
                            // System.out.println("Compilación Fallida!\n");
                            OUTTextArea.setText(null);
                            OUTTextArea.setForeground(Color.RED);
                            OUTTextArea.setText("COMPILATION FAILED!\n");
                            OUTTextArea.append(errorListener.toString());
                            errorListener.errorMsgs.clear();
                        }


                    } catch(Exception err){
                        System.out.println("No hay archivo");
                        err.printStackTrace(); // me dice donde está el error

                    }
                    inst.reset();
                    List<Token> lista = (List<Token>) inst.getAllTokens();
                    for (Token t : lista)
                        System.out.println(MiScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");

                }catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        });




        textArea1.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent documentEvent)
            {
                lineNumberingTextArea.updateLineNumbers();
            }

            @Override
            public void removeUpdate(DocumentEvent documentEvent)
            {
                lineNumberingTextArea.updateLineNumbers();
            }

            @Override
            public void changedUpdate(DocumentEvent documentEvent)
            {
                lineNumberingTextArea.updateLineNumbers();
            }
        });
        //--------------------------------------ÁRBOL------------------------------
        showASTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                }
                catch(Exception ex){

                }
            }
        });

    }
}


