// CHRISTIAN SÁNCHEZ SALAS
// 201204082
// TAREA #2 COMPILADORES E INTÉRPRETES
// PROF ÓSCAR VÍQUEZ A.

import org.antlr.v4.runtime.*;

import java.util.List;

import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
/*        MiScanner inst = null;
        // CustomParser parser = null;
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
            e.printStackTrace();
        }

        inst.reset();
        List<Token> lista = (List<Token>) inst.getAllTokens();

        for (Token t : lista)
            System.out.println(MiScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");
        */
        // File file = new File("/test2.txt");
        new Editor();

        System.out.println("OK");



    }
}
