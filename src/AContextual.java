import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class AContextual extends MiParserBaseVisitor {

    private SymbolTable tableS;
    // private MethodTable tableM;
    private ClassTable tableC;

    public int getNumErrors() {
        return numErrors;
    }

    private int numErrors;

    public AContextual(){
        this.tableS = new SymbolTable();
        this.tableC = new ClassTable();
        this.numErrors=0;
    }

    public boolean hasErrors(){
        if (this.numErrors==0)
            return false;
        else
            return true;
    }

    // PREVISITAS:
    public Object previsitClassDAST(MiParser.ClassDASTContext ctx) {
        int res = tableC.enter(ctx.IDENT().getText());
        if(res == 1){
            this.numErrors++;
            System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                    + "): +++ The class is already declared +++");

        }

        return null;
    }
    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        this.numErrors=0;
        // se realiza una previsita:
        /*for(int i = 0; i<=ctx.classDecl().size()-1; i++){
            previsitClassDAST((MiParser.ClassDASTContext) ctx.classDecl(i));
        }
        System.out.println(tableC.toString());*/
        for(int i = 0; i<=ctx.varDecl().size()-1; i++){
            System.out.println("CICLO");
            visit(ctx.varDecl(i));
        }
        /*for(int i = 0; i<=ctx.constDecl().size()-1; i++){
            visit(ctx.constDecl(i));
        }*/
        tableS.closeScope();
        return null;
    }

    @Override public Object visitConstDAST(MiParser.ConstDASTContext ctx) {
        System.out.println("ctx.getText() = " + ctx.getText()+ '\n');
        Token tipo = (Token) visit(ctx.type());

        if((tipo.getText().equals("int")) && (ctx.CHARCONST()== null) ){
            int res = tableS.enter(ctx.IDENT().getText(), tipo.getText());
            if(res == 1){
                System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                        + "): +++ The identifier is already declared +++");

            }

        }
        else if((tipo.getText().equals("char")) && (ctx.NUMBER()== null) ){
            int res = tableS.enter(ctx.IDENT().getText(), tipo.getText());
            if(res == 1){

                System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                        + "): +++ The identifier is already declared +++");

            }
        }
        else{
            this.numErrors++;
            System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                    + "): +++ Incompatible Types +++");

        }
        return null;
    }

    @Override public Object visitVarDAST(MiParser.VarDASTContext ctx) {
        // Token tipo = (Token) visit(ctx.type());
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type());
        System.out.println("NOMBRE DE VARIABLE: " + typeTokens.get(0).getText() + "\n" + "VALOR EN TOKEN 'PARENTENSIS_ABIERTO': "+ typeTokens.get(1).getText() + "\n");
        /*if (
                (tipo.getText().equals("int"))
                || (tipo.getText().equals("char"))
                || (tipo.getText().equals("bool"))) {
                for(int i=0; i<=ctx.IDENT().size()-1; i++){
                    int res = tableS.enter(ctx.IDENT(i).getText(), tipo.getText());
                    if (res == 1) {
                        this.numErrors++;
                        System.out.println("Semantic Error (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1)
                                + "): +++ The identifier is already declared +++");
                    }
                }


        }
        else {
            this.numErrors++;
            System.out.println("Semantic Error ("
                    + tipo.getLine() + ":" + (tipo.getCharPositionInLine() + 1)
                    + "): +++ Type Unknown +++");
        }*/

        return null;





        // return visitChildren(ctx);
    }


    @Override public Object visitClassDAST(MiParser.ClassDASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMethodDAST(MiParser.MethodDASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitFormPAST(MiParser.FormPASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {
        System.out.println("TYPE VISIT");
        ArrayList<Token> tokens = new ArrayList<>();

        Token tid = ctx.IDENT().getSymbol();
        tokens.add(tid);
        System.out.println(tid.getText());

        Token corchete = ctx.LLAVE_ABIERTA().getSymbol();
        tokens.add(corchete);
        System.out.println(corchete.getText());

        System.out.println(tokens.get(0).getText());
        if(corchete!=null){
            tokens.add(corchete);
        }
        /*else{
            tokens.add(ctx.IDENT().getSymbol());
            // tokens.add(null);
        }*/
        // System.out.println("FIRST TOKEN: " + tokens.get(0).getText());


        // System.out.println("SECOND TOKEN: " + tokens.get(1).getText());
        return tokens;
        // return ctx.IDENT().getSymbol();
    }

    @Override public Object visitDesignatorStatAST(MiParser.DesignatorStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIfStatAST(MiParser.IfStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitForStatAST(MiParser.ForStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitWhileStatAST(MiParser.WhileStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBreakStatAST(MiParser.BreakStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReturnStatAST(MiParser.ReturnStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReadStatAST(MiParser.ReadStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitWriteStatAST(MiParser.WriteStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockStatAST(MiParser.BlockStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPycStatAST(MiParser.PycStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockAST(MiParser.BlockASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExprAST(MiParser.ExprASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTermAST(MiParser.TermASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNumberFactorAST(MiParser.NumberFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCharconsFactorAST(MiParser.CharconsFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBoolFactorAST(MiParser.BoolFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNewFactorAST(MiParser.NewFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParentFactorAST(MiParser.ParentFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIgualesRelopAST(MiParser.IgualesRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDiferenteRelopAST(MiParser.DiferenteRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMayorRelopAST(MiParser.MayorRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMayigualRelopAST(MiParser.MayigualRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMenorRelopAST(MiParser.MenorRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMenigualRelopAST(MiParser.MenigualRelopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSumaAddopAST(MiParser.SumaAddopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRestaAddopAST(MiParser.RestaAddopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMultMulopAST(MiParser.MultMulopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSlashMulopAST(MiParser.SlashMulopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPorcMulopAST(MiParser.PorcMulopASTContext ctx) { return visitChildren(ctx); }
}
