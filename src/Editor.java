import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Editor {
    private JPanel panel1;
    private JButton showASTButton;
    private JTextArea textArea1;
    private JButton compileButton;
    File ide = null;
    int fontSize = 14;



    public Editor() {
        JFrame frame = new JFrame("PARSER PROJECT");
        frame.setSize(500, 500);
        frame.setBounds(400, 250, 500, 500);
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        compileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "HOLA MUNDO");
                try{
                    PrintWriter writer = new PrintWriter("My_Code.txt", "UTF-8");
                    writer.println(textArea1.getText());
                    writer.close();
                }catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public void saveChanges() {
        try {
            PrintWriter printWriter = new PrintWriter(ide);
            printWriter.write(textArea1.getText());
            printWriter.close();
//            JOptionPane.showMessageDialog(rootPane, "Saved", "Done", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void readTheParamFile(File file) {
        try {
            Scanner scn = new Scanner(file);
            String buffer = "";
            while (scn.hasNext()) {
                buffer += scn.nextLine() + "\n";
            }
            textArea1.setText(buffer); // de más.
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


