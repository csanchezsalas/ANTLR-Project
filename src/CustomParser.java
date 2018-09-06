import org.antlr.v4.runtime.*;

public class CustomParser {

    private MiScanner e;
    private Token actualToken;
    public CustomParser( MiScanner e){
        this.e = e;
        actualToken = this.e.nextToken();
    }

    private void accept(int expected){

        if (expected != actualToken.getType()){
            System.out.println("Error sintáctico");
        }
        actualToken = this.e.nextToken();

    }

    // program: singleCommand;
    public void program(){
        singleCommand();
    }

    // command: singleCommand ( PYC singleCommand)*;
    public void command(){
        singleCommand();
        while(actualToken.getType()==MiScanner.PYC){
            accept(MiScanner.PYC);
            singleCommand();
        }

    }

    /*
    singleCommand: ( ID ((ASSIGN expression)
    | (PARENTHESIS_OPEN expression PARENTHESIS_CLOSED)))
    | (IF expression THEN singleCommand ELSE singleCommand)
    | (WHILE  expression DO  singleCommand)
    | (LET declaration IN singleCommand) | (BEGIN command END);
    */
    public void singleCommand(){

        if(actualToken.getType() == MiScanner.ID){

            accept(MiScanner.ID);
            if(actualToken.getType() == MiScanner.ASSIGN){
                accept(MiScanner.ASSIGN);
                expression();
            }
            else if (actualToken.getType() == MiScanner.PARENTHESIS_OPEN){
                accept(MiScanner.PARENTHESIS_OPEN);
                expression();
                accept(MiScanner.PARENTHESIS_CLOSED);
            }
        }
        else if(actualToken.getType() == MiScanner.IF){
            accept(MiScanner.IF);
            expression();
            accept(MiScanner.THEN);
            singleCommand();
            accept(MiScanner.ELSE);
            singleCommand();

        }
        else if(actualToken.getType() == MiScanner.WHILE){
            accept(MiScanner.WHILE);
            expression();
            accept(MiScanner.DO);
            singleCommand();

        }
        else if(actualToken.getType() == MiScanner.LET){
            accept(MiScanner.LET);
            declaration();
            accept(MiScanner.IN);
            singleCommand();

        }
        else if(actualToken.getType() == MiScanner.BEGIN){
            accept(MiScanner.BEGIN);
            command();
            accept(MiScanner.END);

        }else{
            System.out.println("\nError\n");

        }

    }

    // declaration: singleDeclaration (PYC singleDeclaration)*;
    public void declaration(){
        singleDeclaration();
        while(actualToken.getType()==MiScanner.PYC){
            accept(MiScanner.PYC);
            singleDeclaration();
        }
    }

    // singleDeclaration: (CONST ID SYMBOL1 expression) | (VAR ID COLON ID);
    public void singleDeclaration(){
        if(actualToken.getType()==MiScanner.CONST){
            accept(MiScanner.CONST);
            accept(MiScanner.ID);
            accept(MiScanner.SYMBOL1);
            expression();
        }
        else if(actualToken.getType()==MiScanner.VAR){
            accept(MiScanner.VAR);
            accept(MiScanner.COLON);
            accept(MiScanner.ID);
        }
        else{
            System.out.println("\nError\n");
        }
    }

    // primaryExpression: NUMBER | ID | (PARENTHESIS_OPEN expression PARENTHESIS_CLOSED);
    public void primaryExpression(){
        if (actualToken.getType()==MiScanner.NUMBER){
            accept(MiScanner.NUMBER);
        }
        else if(actualToken.getType()==MiScanner.ID){
            accept(MiScanner.ID);
        }
        else if(actualToken.getType()==MiScanner.PARENTHESIS_OPEN){
            accept(MiScanner.PARENTHESIS_OPEN);
            expression();
            accept(MiScanner.PARENTHESIS_CLOSED);
        }
        else{
            System.out.println("\nError\n");
        }
    }

    // expression: primaryExpression ( (PLUS|MINUS|MULT|DIV) NUMBER| ID)*;
    public void expression(){
        primaryExpression();
        while((actualToken.getType()==MiScanner.PLUS)
                || (actualToken.getType() == MiScanner.PLUS)
                || (actualToken.getType() == MiScanner.MINUS)
                || (actualToken.getType() == MiScanner.MULT)
                || (actualToken.getType() == MiScanner.DIV)){
            if(actualToken.getType()==MiScanner.PLUS){
                accept(MiScanner.PLUS);
                if(actualToken.getType()==MiScanner.NUMBER){
                    accept(MiScanner.NUMBER);
                }
                else if(actualToken.getType()==MiScanner.ID){
                    accept(MiScanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }

            }
            else if(actualToken.getType() == MiScanner.MINUS){
                accept(MiScanner.MINUS);
                if(actualToken.getType()==MiScanner.NUMBER){
                    accept(MiScanner.NUMBER);
                }
                else if(actualToken.getType()==MiScanner.ID){
                    accept(MiScanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }

            }
            else if(actualToken.getType() == MiScanner.MULT){
                accept(MiScanner.MULT);
                if(actualToken.getType()==MiScanner.NUMBER){
                    accept(MiScanner.NUMBER);
                }
                else if(actualToken.getType()==MiScanner.ID){
                    accept(MiScanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }

            }
            else if(actualToken.getType() == MiScanner.DIV){
                accept(MiScanner.DIV);
                if(actualToken.getType()==MiScanner.NUMBER){
                    accept(MiScanner.NUMBER);
                }
                else if(actualToken.getType()==MiScanner.ID){
                    accept(MiScanner.ID);
                }
                else{
                    System.out.println("\nError\n");
                }

            }
            else{
                System.out.println("\nError\n");
            }


        }


    }

}
