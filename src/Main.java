// CHRISTIAN SÁNCHEZ SALAS
// 201204082
// TAREA #2 COMPILADORES E INTÉRPRETES
// PROF ÓSCAR VÍQUEZ A.

import org.antlr.v4.runtime.*;


import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
/*        MiScanner inst = null;
        MiParser parser = null;
        CharStream input=null; //"string" de caracateres
        CommonTokenStream tokens = null; //"string" de tokens
        try {
            input = CharStreams.fromFileName("test.txt"); // all lo que tenga el archivo se carga en CharStreams
            inst = new MiScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new MiParser(tokens);

            parser.program();
        } catch(Exception e){
            System.out.println("No hay archivo");
            e.printStackTrace(); // me dice donde está el error
        }

        inst.reset();
        List<Token> lista = (List<Token>) inst.getAllTokens();

        for (Token t : lista)

            System.out.println(MiScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");*/

        new IDE();




    }
}
