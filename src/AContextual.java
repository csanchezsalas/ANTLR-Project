import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class AContextual extends MiParserBaseVisitor {

    private SymbolTable tableS;
    private MethodTable tableM;
    private ClassTable tableC;

    public int getNumErrors() {
        return numErrors;
    }

    private int numErrors;

    public AContextual(){
        this.tableS = new SymbolTable();
        this.tableC = new ClassTable();
        this.tableM = new MethodTable();
        this.numErrors=0;
    }

    public boolean hasErrors(){
        if (this.numErrors==0)
            return false;
        else
            return true;
    }

    // PREVISITAS:
    // methodDecl: (type | VOID) IDENT PARENT_ABIERTO (formPars)? PARENT_CERRADO (varDecl)* block
    public Object previsitMethodDAST(MiParser.MethodDASTContext ctx) {
        // meter un void o un tipo
        // verificar si vienen parámetros
        ArrayList<ArrayList<String>> params = new ArrayList<>(); // lista con tios de parámetros e identificadores
        ArrayList<Token> typeTokens = new ArrayList<>(); // obtiene el tipo de retorno

        ArrayList<String> typesParams = new ArrayList<>();
        ArrayList<String> identifiersParams = new ArrayList<>();
        ArrayList<String> isArray = new ArrayList<>();
        /*** seteando encabezado de método: */
        params = (ArrayList<ArrayList<String>>) visit(ctx.formPars());
        typesParams = params.get(0);
        identifiersParams = params.get(1);
        isArray = params.get(2);
        int lenghtParams = typesParams.size();
        /*** si retorna algo: */
        if(ctx.VOID()== null){
            typeTokens = (ArrayList<Token>)visit(ctx.type());


            int res = tableM.enter(ctx.IDENT().getText(), typeTokens.get(0).getText(), lenghtParams, typesParams, identifiersParams, isArray);
            if(res == 1){
                this.numErrors++;
                System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                        + "): +++ The method is already declared +++");

            }
        }
        /*** si es void: */
        else{
            int res = tableM.enter(ctx.IDENT().getText(),"void", lenghtParams, typesParams, identifiersParams, isArray);
            if(res == 1){
                this.numErrors++;
                System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                        + "): +++ The method is already declared +++");

            }

        }

        return null;
    }
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
        // PREVISITAS:

        for(int i = 0; i<=ctx.classDecl().size()-1; i++){
            previsitClassDAST((MiParser.ClassDASTContext) ctx.classDecl(i));
        }
        for(int i = 0; i<=ctx.methodDecl().size()-1; i++){
            previsitMethodDAST((MiParser.MethodDASTContext) ctx.methodDecl(i));
        }
        System.out.println("TABLA DE MÉTODOS: \n" +tableM.toString());
        /** INICIO DE VISITAS */
        for(int i = 0; i<=ctx.varDecl().size()-1; i++){
            visit(ctx.varDecl(i));
        }
        for(int i = 0; i<=ctx.constDecl().size()-1; i++){
            visit(ctx.constDecl(i));
        }
        for(int i = 0; i<=ctx.classDecl().size()-1; i++){
            visit(ctx.classDecl(i));
        }
        for(int i = 0; i<=ctx.methodDecl().size()-1; i++){
            visit(ctx.methodDecl(i));
        }

        tableS.closeScope();
        return null;
    }

    @Override public Object visitConstDAST(MiParser.ConstDASTContext ctx) {
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type());

        Token tipo = typeTokens.get(0);

        if((tipo.getText().equals("int")) && (ctx.CHARCONST()== null) ){
            int res = tableS.enter(ctx.IDENT().getText(), tipo.getText(), false); // no es arreglo
            if(res == 1){
                System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                        + "): +++ The identifier is already declared +++");

            }



        }
        else if((tipo.getText().equals("char")) && (ctx.NUMBER()== null) ){
            int res = tableS.enter(ctx.IDENT().getText(), tipo.getText(), false); // no es arreglo
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
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type());

        Token tipo = typeTokens.get(0);
        if ((tipo.getText().equals("int"))
                || (tipo.getText().equals("char"))
                || (tipo.getText().equals("bool"))
                || ((tableC.exists(tipo.getText())))) {

            if(typeTokens.get(0).getText().equals(typeTokens.get(1).getText())){ // no es arreglo
                for(int i=0; i<=ctx.IDENT().size()-1; i++){
                    int res = tableS.enter(ctx.IDENT(i).getText(), tipo.getText(), false); //asignar false a la columna isArray de la tableS
                    if (res == 1) {
                        this.numErrors++;
                        System.out.println("Semantic Error (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1)
                                + "): +++ The identifier is already declared +++");
                    }
                }

            }
            else{
                if((tipo.getText().equals("bool")) || (tableC.exists(tipo.getText()))){
                    this.numErrors++;
                    System.out.println("Semantic Error ("
                            + tipo.getLine() + ":" + (tipo.getCharPositionInLine() + 1)
                            + "): +++ Ooops!! Array type not allowed +++");

                }
                else{
                    for(int i=0; i<=ctx.IDENT().size()-1; i++){
                        int res = tableS.enter(ctx.IDENT(i).getText(), tipo.getText(), true); //asignar true a la columna isArray de la tableS
                        if (res == 1) {
                            this.numErrors++;
                            System.out.println("Semantic Error (" + ctx.IDENT(i).getSymbol().getLine() + ":" + (ctx.IDENT(i).getSymbol().getCharPositionInLine() + 1)
                                    + "): +++ The identifier-array is already declared +++");
                        }
                    }
                }


            }
        }
        else {
            this.numErrors++;
            System.out.println("Semantic Error ("
                    + tipo.getLine() + ":" + (tipo.getCharPositionInLine() + 1)
                    + "): +++ Type Unknown +++");
        }
        return null;

        // return visitChildren(ctx);
    }


    @Override public Object visitClassDAST(MiParser.ClassDASTContext ctx) {

        if(ctx.varDecl().size()>0){
            tableS.openScope();
            for(int i = 0; i<ctx.varDecl().size()-1; i++){
                visit(ctx.varDecl(i));
            }
            tableS.closeScope();
        }
        return null;
    }

    @Override public Object visitMethodDAST(MiParser.MethodDASTContext ctx) {

      //  (type | VOID) IDENT PARENT_ABIERTO (formPars)? PARENT_CERRADO (varDecl)* block
        visit(ctx.block());
        return null; }

    @Override public Object visitFormPAST(MiParser.FormPASTContext ctx) {

        // if paramatros == vacio:
        // haga esto:
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> typeParams = new ArrayList<>();
        ArrayList<String> identifierParams = new ArrayList<>();
        ArrayList<String> isArrayParams = new ArrayList<>();
        ArrayList<Token> typeTokens = new ArrayList<>();
        typeTokens = (ArrayList) visit(ctx.type(0)); // primer parámetro
        typeParams.add(typeTokens.get(0).getText()); // seteando tipo de primer parámetro obligatorio
        identifierParams.add(ctx.IDENT(0).getText());
        if(typeTokens.get(0).getText().equals(typeTokens.get(1).getText())){ // no es arreglo

            isArrayParams.add("false");
        }
        else{
            isArrayParams.add("true");
        }
        for(int i = 1; i<=ctx.type().size()-1; i++){
            typeTokens = (ArrayList) visit(ctx.type(i));
            typeParams.add(typeTokens.get(0).getText()); // seteando tipo de primer parámetro obligatorio
            identifierParams.add(ctx.IDENT(i).getText());
            if(typeTokens.get(0).getText().equals(typeTokens.get(1).getText())){ // no es arreglo

                isArrayParams.add("false");
            }
            else{
                isArrayParams.add("true");
            }

        }
        // typeTokens = (ArrayList<Token>) visit(ctx.type());
        // else: envíe listas vacías:
        result.add(typeParams); // primer parámetro
        result.add(identifierParams);
        result.add(isArrayParams);
        return result;
    }

    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {

        ArrayList<Token> tokens = new ArrayList<>();

        Token tid = ctx.getStart();
        tokens.add(tid);
        Token pseudo= ctx.getStop(); // aquí va el posible paréntesis cuadrado
        tokens.add(pseudo);

        return tokens;
    }

    @Override public Object visitDesignatorStatAST(MiParser.DesignatorStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIfStatAST(MiParser.IfStatASTContext ctx) {
        /* (IF PARENT_ABIERTO condition PARENT_CERRADO statement ( ELSE statement)? ) */
        visit(ctx.condition());
        visit(ctx.statement(0));
        for(int i = 1; i<ctx.statement().size()-1; i++){
            visit(ctx.statement(i));
        }
        return null; }

    @Override public Object visitForStatAST(MiParser.ForStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitWhileStatAST(MiParser.WhileStatASTContext ctx) {
        visit(ctx.condition());
        visit(ctx.statement());
        return visitChildren(ctx); }

    @Override public Object visitBreakStatAST(MiParser.BreakStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReturnStatAST(MiParser.ReturnStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitReadStatAST(MiParser.ReadStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitWriteStatAST(MiParser.WriteStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockStatAST(MiParser.BlockStatASTContext ctx) {
        visit(ctx.block());
        return null; }

    @Override public Object visitPycStatAST(MiParser.PycStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockAST(MiParser.BlockASTContext ctx) {
        // CURLY_ABIERTO (statement)* CURLY_CERRADO
        //tableM.openScope();
        for(int i = 0; i<ctx.statement().size()-1; i++){
            visit(ctx.statement(i));
        }
        //    tableM.closeScope();
        return null; }

    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) {
        //condTerm (OR condTerm)*
        visit(ctx.condTerm(0));
        for(int i = 1; i<ctx.condTerm().size()-1; i++){
            visit(ctx.condTerm(i));
        }
        return null; }

    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) {
       // condFact(AND condFact)*
        visit(ctx.condFact(0));
        for(int i = 1; i<ctx.condFact().size()-1; i++){
            visit(ctx.condFact(i));
        }
        return null; }

    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) {
        //expr relop expr
        //relop: IGUALES   | DIFERENTE   | MAYOR  | MAY_IGUAL  | MENOR  | MEN_IGUAL
        String expr1= (String) visit (ctx.expr(0)); //OCUPO SABER SI EXPR1 Y EXPR2 CUMPLEN TIPOS SEGUN EL RELOP QUE HAYA
        String expr2= (String) visit (ctx.expr(1));
     //   visit(ctx.relop());
        if(visit(ctx.relop()).equals("==")
            || (visit(ctx.relop()).equals("!=") )){ //EN CASO DE QUE RELOP SEA == o != acepta cualquier tipo
            if (expr1.equals(expr2)==false) {
                this.numErrors++;
                System.out.println("Semantic Error ("
                         + "): Incompatible types in expression between "
                        + expr1 + " and " + expr2);
            }
        } else if(visit(ctx.relop()).equals(">") //EN CASO DE QUE RELOP SEA >, >=, <, <=
                || visit(ctx.relop()).equals(">=")
                || visit(ctx.relop()).equals("<")
                || visit(ctx.relop()).equals("<=")) {
            if (expr1.equals("char") || expr1.equals("bool")
                || expr2.equals("char") || expr2.equals("bool") ) { //solo sirve para int
                this.numErrors++;
                System.out.println("Semantic Error ("
                        + "): Incompatible types, just ints pls! "
                        + expr1 + " and " + expr2);
            }
        }

        return null; }

    @Override public Object visitExprAST(MiParser.ExprASTContext ctx) {
        // (RESTA)? term (addop term)*
        visit(ctx.term(0));
        for(int i = 1; i<ctx.term().size()-1; i++){
            visit(ctx.term(i));
        }
        return null; }

    @Override public Object visitTermAST(MiParser.TermASTContext ctx) {
        visit(ctx.factor(0));
        for(int i = 1; i<ctx.factor().size()-1; i++){
            visit(ctx.factor(i));
        }
        return null; }

    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNumberFactorAST(MiParser.NumberFactorASTContext ctx) {
        return "int"; }

    @Override public Object visitCharconsFactorAST(MiParser.CharconsFactorASTContext ctx) {
        return "char"; }

    @Override public Object visitBoolFactorAST(MiParser.BoolFactorASTContext ctx) {

        return "bool"; }

    @Override public Object visitNewFactorAST(MiParser.NewFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitParentFactorAST(MiParser.ParentFactorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitIgualesRelopAST(MiParser.IgualesRelopASTContext ctx) {

        return "=="; }

    @Override public Object visitDiferenteRelopAST(MiParser.DiferenteRelopASTContext ctx) {
        return "!="; }

    @Override public Object visitMayorRelopAST(MiParser.MayorRelopASTContext ctx) {
        return ">"; }

    @Override public Object visitMayigualRelopAST(MiParser.MayigualRelopASTContext ctx) {
        return ">="; }

    @Override public Object visitMenorRelopAST(MiParser.MenorRelopASTContext ctx) {
        return "<"; }

    @Override public Object visitMenigualRelopAST(MiParser.MenigualRelopASTContext ctx) {
        return "<="; }

    @Override public Object visitSumaAddopAST(MiParser.SumaAddopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRestaAddopAST(MiParser.RestaAddopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitMultMulopAST(MiParser.MultMulopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSlashMulopAST(MiParser.SlashMulopASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitPorcMulopAST(MiParser.PorcMulopASTContext ctx) { return visitChildren(ctx); }
}
