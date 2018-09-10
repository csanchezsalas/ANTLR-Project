import javax.swing.*;
import org.antlr.v4.runtime.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IDE {
    private JButton compileButton;
    private JButton showASTButton;
    private JScrollPane scroller;
    private JPanel panel1;
    private JTextArea textArea1;
    private JTextArea OUTTextArea;

    MiScanner inst = null;
    MiParser parser = null;
    CharStream input=null; //"string" de caracateres
    CommonTokenStream tokens = null; //"string" de tokens


    public IDE() {
        JFrame frame = new JFrame("PARSER PROJECT");



        frame.setSize(500, 500);
        frame.setBounds(400, 150, 500, 500);
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        LineNumberingTextArea lineNumberingTextArea = new LineNumberingTextArea(textArea1);
        scroller.setRowHeaderView(lineNumberingTextArea);
        // scroller.setColumnHeader();

        compileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // JOptionPane.showMessageDialog(null, "HOLA MUNDO");
                try{
                    PrintWriter writer = new PrintWriter("My_Code.txt", "UTF-8");
                    writer.println(textArea1.getText());
                    writer.close();
                    try {
                        input = CharStreams.fromFileName("My_Code.txt"); // all lo que tenga el archivo se carga en CharStreams
                        inst = new MiScanner(input);
                        tokens = new CommonTokenStream(inst);
                        parser = new MiParser(tokens);

                        parser.program();
                    } catch(Exception err){
                        // aquí debo hacer el dialog para que imprima el error...
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
    }
}


