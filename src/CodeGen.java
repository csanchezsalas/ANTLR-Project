import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.awt.*;
import java.util.ArrayList;

public class CodeGen extends MiParserBaseVisitor{

   // public ArrayList<String> myCodeGen = new ArrayList<>();
   //------------LISTA QUE GUARDA LA GENERACIÓN DE CÓDIGO--------------
    public  ArrayList<ArrayList<String>>  myCodeGen = new ArrayList<>();
    //------------- PARA VARDECLARATION----------
    public boolean inMethod= false; //VARIABLE PARA EL MANEJO DE VAR GLOBALES Y LOCALES
    public int methodPos= 0; // PARA SABER LA POSICIÓN EN LISTA DEL MÉTODO
 //   public boolean isExpr= true; //PARA DESIGNATORFACTOR
    //----------------PARA MANEJO DEL WHILE--------
    public boolean stateWhile= false; //EN CASO DE HACER JUMP IF FALSE PARA WHILE
    int cw=0;
    //------------PARA MANEJO DEL IF-----------------
    int countToJump= 0;
    public boolean stateIf= false;


    private SymbolTable tableS;
    private MethodTable tableM;
    private ClassTable tableC;
    private boolean isNew = false;
    private boolean forStat=false; //Variable usada en la visita del for
    private String isVoid="void"; //variable usada para la visita del return
    public int getNumErrors() {
        return numErrors;
    }
    private int numErrors;

    public CodeGen(){
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
        // tableS.openScope();
        ArrayList<ArrayList<String>> params = new ArrayList<>(); // lista con tios de parámetros e identificadores
        ArrayList<Token> typeTokens = new ArrayList<>(); // obtiene el tipo de retorno

        ArrayList<String> typesParams = new ArrayList<>();
        ArrayList<String> identifiersParams = new ArrayList<>();
        ArrayList<String> isArray = new ArrayList<>();

        /** seteando funciones por defecto*/
        typesParams.add("char");
        tableM.enter("ord", "int", 1, typesParams, null, null);
        typesParams.clear();
        typesParams.add("int");
        tableM.enter("chr", "char", 1, typesParams, null, null);
        typesParams.clear();
        typesParams.add("int");
        typesParams.add("char");
        isArray.add("true");
        tableM.enter("len", "int", 1, typesParams, null, isArray);
        /*** seteando encabezado de método: */
        typesParams.clear();
        identifiersParams.clear();
        isArray.clear();

        if(ctx.formPars()!= null) { //método con parámetros
            params = (ArrayList<ArrayList<String>>) visit(ctx.formPars());
            typesParams = params.get(0);
            identifiersParams = params.get(1);
            isArray = params.get(2);
            int lenghtParams = typesParams.size();
            /*** si retorna algo: */
            if(ctx.VOID()== null){
                typeTokens = (ArrayList<Token>)visit(ctx.type()); // esto no debe ser lista
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
        }
        else{
            /*** si retorna algo: */
            if(ctx.VOID()== null){
                /** debug*/
                typeTokens = (ArrayList<Token>)visit(ctx.type());
                int res = tableM.enter(ctx.IDENT().getText(), typeTokens.get(0).getText(), 0, null, null, null);
                System.out.println(tableM.toString());
                if(res == 1){
                    this.numErrors++;
                    System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                            + "): +++ The method is already declared +++");
                }
            }
            /*** si es void: */
            else{
                int res = tableM.enter(ctx.IDENT().getText(),"void", 0, null, null, null);
                if(res == 1){
                    this.numErrors++;
                    System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                            + "): +++ The method is already declared +++");
                }
            }
        }
        return null;
    }

    public Object previsitClassDAST(MiParser.ClassDASTContext ctx) {
      /*  int res = tableC.enter(ctx.IDENT().getText(), null, null, null);
        if(res == 1){
            this.numErrors++;
            System.out.println("Semantic Error (" + ctx.IDENT().getSymbol().getLine() + ":" + (ctx.IDENT().getSymbol().getCharPositionInLine() + 1)
                    + "): +++ The class is already declared +++");
        }*/
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
        // System.out.println("TABLA DE MÉTODOS: \n" +tableM.toString());
        /** INICIO DE VISITAS */
        for(int i = 0; i<=ctx.varDecl().size()-1; i++){
            visit(ctx.varDecl(i));
            // tableS.closeScope();
        }
        for(int i = 0; i<=ctx.constDecl().size()-1; i++){
            visit(ctx.constDecl(i));
            // tableS.closeScope();
        }
        for(int i = 0; i<=ctx.classDecl().size()-1; i++){
            visit(ctx.classDecl(i));
            tableS.closeScope();
        }
        for(int i = 0; i<=ctx.methodDecl().size()-1; i++){

            visit(ctx.methodDecl(i));
            tableS.closeScope();
        }
        return null;
    }



    @Override public Object visitVarDAST(MiParser.VarDASTContext ctx) {
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type());
    //    ArrayList<ArrayList<String>> allInfo = new ArrayList<>(); // lista contiene <nombreVariable, tipo, esArreglo?>
        Token tipo = typeTokens.get(0);
        if ((tipo.getText().equals("int")) ){
            if(inMethod == true){
                for(int i=0; i<=ctx.IDENT().size()-1; i++){ //  myCodeGen.add("PUSH_LOCAL_I " + ctx.IDENT(i).getText());
                    //myCodeGen.add( new ArrayList<String>());
                    myCodeGen.get(methodPos).add("PUSH_LOCAL_I " + ctx.IDENT(i).getText());
                }
            }else{
                for(int i=0; i<=ctx.IDENT().size()-1; i++){ // myCodeGen.add("PUSH_GLOBAL_I " + ctx.IDENT(i).getText());
                    myCodeGen.add( new ArrayList<String>());
                    myCodeGen.get(myCodeGen.size()-1).add("PUSH_GLOBAL_I " + ctx.IDENT(i).getText());
                }
            }
        }
        else if ((tipo.getText().equals("char")) ){
            if(inMethod == true){
                for(int i=0; i<=ctx.IDENT().size()-1; i++){ //myCodeGen.add("PUSH_LOCAL_C " + ctx.IDENT(i).getText());
                 //   myCodeGen.add( new ArrayList<String>());
                    myCodeGen.get(methodPos).add("PUSH_LOCAL_C " + ctx.IDENT(i).getText());
                }
            }else{
                for(int i=0; i<=ctx.IDENT().size()-1; i++){ //   myCodeGen.add("PUSH_GLOBAL_C " + ctx.IDENT(i).getText());
                    myCodeGen.add( new ArrayList<String>());
                    myCodeGen.get(myCodeGen.size()-1).add("PUSH_GLOBAL_C " + ctx.IDENT(i).getText());
                }
            }
        }
        else{
            System.out.println("Generation code error in varDecl");
        } // return visitChildren(ctx);
      // return allInfo;
        return null;
    }

    @Override public Object visitClassDAST(MiParser.ClassDASTContext ctx) {
     /*   ArrayList<ArrayList<String>> attributeInfo;
        ArrayList<String> typesAttr = new ArrayList<>();
        ArrayList<String> identifiersAttr = new ArrayList<>();
        ArrayList<String> isArray = new ArrayList<>();
        if(ctx.varDecl().size()>0){
            tableS.openScope();
            for(int i = 0; i<=ctx.varDecl().size()-1; i++){
                attributeInfo = (ArrayList<ArrayList<String>>)visit(ctx.varDecl(i)); // int x, y, z;
                for(int j =0; j<= attributeInfo.size()-1; j++){
                    typesAttr.add(attributeInfo.get(j).get(0));
                    identifiersAttr.add(attributeInfo.get(j).get(1));
                    isArray.add(attributeInfo.get(j).get(2));
                }
            }
        }

        tableC.setClassAttr(ctx.IDENT().getText(),typesAttr , identifiersAttr, isArray); // se setean los atributos a la tabla de clases
       */ return null;
    }

    @Override public Object visitMethodDAST(MiParser.MethodDASTContext ctx) {
        myCodeGen.add( new ArrayList<String>()); //AQUÍ ESTARÁ LO DEL MÉTODO
        methodPos = (myCodeGen.size()-1); //OCUPO SABER LA POSICIÓN DEL MÉTODO

       // AGREGANDO EL DEF
        myCodeGen.get(methodPos).add("DEF "+ ctx.IDENT().getText()); //  myCodeGen.add("DEF "+ ctx.IDENT().getText());
        if(ctx.VOID() == null){ myCodeGen.get(methodPos).add("DEF "+ ctx.IDENT().getText());}

        // CONSIDERANDO EL FORM PARS
        inMethod = true; //ENCIENDO BANDERA, ENTONCES EN VISIT DE VAR, PREGUNTA SI BANDERA ES TRUE O FALSE, ASI SABE SI ES GLOBAL O LOCAL
        if(ctx.formPars()!= null) { //método con parámetros
            visit(ctx.formPars());
        }

        // CONSIDERANDO LOS VAR DECLARATIONS
       if(ctx.varDecl().size()>0){
                   for (int i= 0; i<= ctx.varDecl().size()-1; i++){
                visit(ctx.varDecl(i));
            }
        }
       // if(ctx.VOID() == null){
         //   myCodeGen.add("DEF "+ ctx.IDENT().getText());
          /*  ArrayList<Token> typeToken = (ArrayList<Token>)visit(ctx.type());
            isVoid = typeToken.get(0).getText();
            System.out.println("MET TYPE" + typeToken.get(0).getText());
        }
        else{
            isVoid = "void";
        }*/

        //------- PARA IMPRIMIR LA LISTA DE GEN CODIGO----------
       // for(int i=0; i<=myCodeGen.size(); i++){
       //     System.out.println(myCodeGen.get(i));}

        visit(ctx.block());
        inMethod= false; // ACTUALIZAR LA BANDERA DESPUÉS DE ESTO
        return null;
    }



    @Override public Object visitFormPAST(MiParser.FormPASTContext ctx) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        ArrayList<String> typeParams = new ArrayList<>();
        ArrayList<String> identifierParams = new ArrayList<>();
        ArrayList<String> isArrayParams = new ArrayList<>();
        ArrayList<Token> typeTokens = new ArrayList<>();

        typeTokens = (ArrayList) visit(ctx.type(0)); // primer parámetro
        typeParams.add(typeTokens.get(0).getText()); // seteando tipo de primer parámetro obligatorio
        identifierParams.add(ctx.IDENT(0).getText());
       /* if(typeTokens.get(0).getText().equals(typeTokens.get(1).getText())){ // no es arreglo
            isArrayParams.add("false");
        }else{
            isArrayParams.add("true");
        }*/
        if ((typeTokens.get(0).getText().equals("int")) ){
           // myCodeGen.add("PUSH_LOCAL_I "+ ctx.IDENT(0).getText());
            myCodeGen.get(methodPos).add("PUSH_LOCAL_I "+ ctx.IDENT(0).getText());
        }else{
            //myCodeGen.add("PUSH_LOCAL_C "+ ctx.IDENT(0).getText());
            myCodeGen.get(methodPos).add("PUSH_LOCAL_C "+ ctx.IDENT(0).getText());
        }
        for(int i = 1; i<=ctx.type().size()-1; i++){
            typeTokens = (ArrayList) visit(ctx.type(i));
            typeParams.add(typeTokens.get(0).getText()); // seteando tipo de primer parámetro obligatorio
            identifierParams.add(ctx.IDENT(i).getText());
            if ((typeTokens.get(i).getText().equals("int")) ){
               // myCodeGen.add("PUSH_LOCAL_I "+ ctx.IDENT(i).getText());
                myCodeGen.get(methodPos).add("PUSH_LOCAL_I "+ ctx.IDENT(i).getText());
            }else{
                //myCodeGen.add("PUSH_LOCAL_C "+ ctx.IDENT(i).getText());
                myCodeGen.get(methodPos).add("PUSH_LOCAL_C "+ ctx.IDENT(i).getText());
            }

         /*   if(typeTokens.get(0).getText().equals(typeTokens.get(1).getText())){ // no es arreglo
                isArrayParams.add("false");
            }
            else{
                isArrayParams.add("true");
            }*/
        }

        // typeTokens = (ArrayList<Token>) visit(ctx.type());
        // else: envíe listas vacías:
      //  result.add(typeParams); // primer parámetro
       // result.add(identifierParams);
       // result.add(isArrayParams);
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



    @Override public Object visitDesignatorStatAST(MiParser.DesignatorStatASTContext ctx) {
        boolean isDesignatorGlobal = false;

        // String tipo2 = (String) visit(ctx.expr()); //SE CAMBIA ORDEN DE VISITA PORQUE SE NECESITA ESTO DE PRIMERO
       // String tipo1 = (String) visit(ctx.designator());
        // ANALISIS DE LA LISTA PARA VER SI ES GLOBAL O LOCAL, SE ESCRIBE DE ULTIMO PARA EL MANEJO DEL STORE
        //¿es designator local o global?
        for (int i=0; i<myCodeGen.get(methodPos).size(); i++ ){
            if( myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_I "+ ctx.designator().getText()) ||
                    myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_C "+ ctx.designator().getText()) ){
                isDesignatorGlobal= false;
            }else{ isDesignatorGlobal= true;}
            }

        // PRIMERO OCUPO SABER QUIEN VIENE DESPUES DEL DESIGNATOR =>
        if (ctx.SUMAS() != null) {
            if (stateWhile == true){ cw= cw +3; }
            myCodeGen.get(methodPos).add("LOAD_CONST 1");
            myCodeGen.get(methodPos).add("LOAD_FAST " + ctx.designator().getText());
            myCodeGen.get(methodPos).add("BINARY_ADD");
        } else if (ctx.RESTAS() != null) {
            if (stateWhile == true){ cw= cw +3; }
            myCodeGen.get(methodPos).add("LOAD_CONST 1");
            myCodeGen.get(methodPos).add("LOAD_FAST " + ctx.designator().getText());
            myCodeGen.get(methodPos).add("BINARY_SUBSTRACT");
        } else if (ctx.IGUAL() != null) { //Si es un: designator IGUAL expr

            //primero hace lo del expresion
            visit(ctx.expr());
            //   myCodeGen.add("LOAD_CONST "+ ctx.expr().getText());
              /*  for(int i=0; i<=myCodeGen.size(); i++){
                    System.out.println(myCodeGen.get(i));}*/
            if (stateWhile == true){ cw= cw +1; }
            //---------PARA SABER EL TIPO DE STORE QUE HAY QUE HACER
            if(isDesignatorGlobal == true){
                myCodeGen.get(methodPos).add("STORE_GLOBAL " + ctx.designator().getText());
            }else{
                myCodeGen.get(methodPos).add("STORE_FAST " + ctx.designator().getText());
            }
            isDesignatorGlobal = false; //SE ACTUALIZA BANDERA

        }else{ //SIGNIFICA QUE VIENE (ACTPARS?)
            //System.out.println((String) visit(ctx.designator()));
            visit(ctx.actPars());
            if (stateWhile == true){ cw= cw +2; }
            myCodeGen.get(methodPos).add("LOAD_GLOBAL " + ctx.designator().getText());
            myCodeGen.get(methodPos).add("CALL_FUNCTION 1");
        }
        return null;
    }


    @Override public Object visitIfStatAST(MiParser.IfStatASTContext ctx) {
        if (stateWhile == true){
            cw= cw +1;
        }

        visit(ctx.condition());

        int posActual= myCodeGen.size()-1 + myCodeGen.get(methodPos).size();
        myCodeGen.get(methodPos).add("JUMP_IF_FALSE " + countToJump);
        stateIf= true;
        visit(ctx.statement(0)); //PROBAR, CREO QUE ESTE ES EL QUE ESTÁ ANTES DEL ELSE
        int totalLines= posActual + countToJump; //CUENTA LAS LINEAS QUE ESTAN EN EL STATEMENT Y EL TOTAL EN LA LINEA DEL "JUMP"
        myCodeGen.get(methodPos).set(posActual, ("JUMP_IF_FALSE "+ totalLines));
        stateIf =false;
        myCodeGen.get(methodPos).add("JUMP_ABSOLUTE ");

        visit(ctx.statement(1));// en caso de un else
        for(int i = 1; i<ctx.statement().size()-1; i++){
            visit(ctx.statement(i));
        }
       /* for(int i=0; i<=myCodeGen.size(); i++){
            System.out.println(myCodeGen.get(i));
        }*/

        if(isNew == true){
            isNew = false;
        }
        else{
            visit(ctx.statement(0));
            for(int i = 1; i<ctx.statement().size()-1; i++){
                visit(ctx.statement(i));
            }
        }
        return null; }


    @Override public Object visitWhileStatAST(MiParser.WhileStatASTContext ctx) {
        //visit(ctx.condition());
     //   ArrayList<String> statCountWhile= new ArrayList<>();
        int aSaltar= 0;
        if (stateWhile == true){
             cw= cw +1;
        }
        else{
         //   String v1= (String)visit(ctx.condition());
            if (stateIf = true){
                countToJump= countToJump +1;
            }
            visit(ctx.condition());
            stateWhile = true; // SIGNIFICA QUE SI ESTAMOS EN UN VISIT DE WHILE

            int jumpPosition=  myCodeGen.get(methodPos).size(); //cantidad de lineas
           // statCountWhile.add((String)visit(ctx.statement()));
            visit(ctx.statement());
          //  int cw= statCountWhile.size();
            aSaltar = cw + myCodeGen.size()-1 + jumpPosition; //statCountWhile.size() + myCodeGen.size();

            myCodeGen.get(methodPos).add("JUMP_IF_FALSE "+ aSaltar);
          //  System.out.println("countWhile " +cw+ " codeCount "+ cc);
            stateWhile =false;
            // AHORA SÍ, VISITE STATEMENt
            visit(ctx.statement());
       /*     for(int i=0; i<=myCodeGen.size(); i++){
                System.out.println(myCodeGen.get(i));
            }*/
        }
        return null;
    }


    @Override public Object visitBreakStatAST(MiParser.BreakStatASTContext ctx) { return visitChildren(ctx); }


    @Override public Object visitReturnStatAST(MiParser.ReturnStatASTContext ctx) {

        if(isVoid.equals("void")) {
           // myCodeGen.add("RETURN");
            if (stateWhile == true){ cw= cw +1; }
            myCodeGen.get(methodPos).add("RETURN");
           /* for(int i=0; i<=myCodeGen.size(); i++){
                System.out.println(myCodeGen.get(i));}*/
          /*  System.out.println("Semantic Error ("
                    + "): Incompatible return in void function"
            );*/
        } else {
            //    myCodeGen.add("LOAD_FAST " + ctx.expr().getText());
             //   myCodeGen.add("RETURN_VALUE");
            if (stateWhile == true){ cw= cw +2; }
            myCodeGen.get(methodPos).add("LOAD_FAST " + ctx.expr().getText());
            myCodeGen.get(methodPos).add("RETURN_VALUE");
                if (stateIf = true){
                    countToJump= countToJump +1;
                }
      /*  for(int i=0; i<=myCodeGen.size(); i++){
            System.out.println(myCodeGen.get(i));}*/
       /* }
        if(ctx.expr()!= null){
            visit(ctx.expr());
            if(!((String) visit(ctx.expr())).equals(isVoid)){
                System.out.println("Semantic Error ("
                        + "): Incompatible types to return " + ctx.expr().getText()
                );
            }*/
        }
        return null;  }


    @Override public Object visitReadStatAST(MiParser.ReadStatASTContext ctx) {
        visit(ctx.designator());
        return null; }

    @Override public Object visitWriteStatAST(MiParser.WriteStatASTContext ctx) {
        if (stateWhile == true){ //VALIDACIONES PARA EL CONTROL DEL WHILE E IF EN VISITAS PREVIAS
            cw= cw +1;
        }
        if (stateIf = true){
            countToJump= countToJump +1;
        }
       // System.out.println("writeExpr");
      //  System.out.println("writeExpr" + (String)visit(ctx.expr()));
       // visit(ctx.expr());
        //valido el tipo de expresión
        myCodeGen.get(methodPos).add("LOAD_GLOBAL write");
        myCodeGen.get(methodPos).add("CALL_FUNCTION 1");
    /*    for(int i=0; i<=myCodeGen.size(); i++){
            System.out.println(myCodeGen.get(i));
        }*/

        return null; }

    @Override public Object visitBlockStatAST(MiParser.BlockStatASTContext ctx) {
        visit(ctx.block());
        return null; }

    @Override public Object visitPycStatAST(MiParser.PycStatASTContext ctx) { return visitChildren(ctx); }

    @Override public Object visitBlockAST(MiParser.BlockASTContext ctx) {
        if(ctx.statement().size()>0){
            for(int i = 0; i<=ctx.statement().size()-1; i++){
                visit(ctx.statement(i));
            }
        }
        return null; }

    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) {
        ArrayList<String> paramsList = new ArrayList<>(); //lista devuelve el tipo de cada expresión
        visit(ctx.expr(0));
        paramsList.add((String) visit(ctx.expr(0)));
        for(int i = 1; i<=ctx.expr().size()-1; i++){
            visit(ctx.expr(i));
            paramsList.add((String) visit(ctx.expr(i)));
        }
        return paramsList;
    }


    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) {
        visit(ctx.condTerm(0));
        for(int i = 1; i<=ctx.condTerm().size()-1; i++){
            visit(ctx.condTerm(i));
        }
        if (stateWhile == true){cw= cw +1;
        }else{
            if(ctx.OR(0)!= null){ // DEFINE SI HAY UN OR
              //  myCodeGen.add("BINARY_OR");
                myCodeGen.get(methodPos).add("BINARY_OR");
                if (stateIf = true){
                    countToJump= countToJump +1;
                }
            }
        }
        return null; }


    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) {
        visit(ctx.condFact(0));
        for(int i = 1; i<=ctx.condFact().size()-1; i++){
            visit(ctx.condFact(i));
        } if (stateWhile == true){cw= cw +1;
        }else{
        if(ctx.AND(0)!= null){ // DEFINE SI HAY UN AND
            //myCodeGen.add("BINARY_AND");
            myCodeGen.get(methodPos).add("BINARY_AND");
            if (stateIf = true){
                countToJump= countToJump +1;
            }
        }}
        return null; }

    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) {
        String expr1= (String) visit (ctx.expr(0)); //OCUPO SABER SI EXPR1 Y EXPR2 CUMPLEN TIPOS SEGUN EL RELOP QUE HAYA
        String expr2= (String) visit (ctx.expr(1));
        if (stateWhile == true){cw= cw +1;
        }else {
            //myCodeGen.add("COMPARE_OP " + ((String) visit(ctx.relop())));
            myCodeGen.get(methodPos).add("COMPARE_OP " + ((String) visit(ctx.relop())));
            if (stateIf = true){
                countToJump= countToJump +1;
            }
        }
       /* for(int i=0; i<=myCodeGen.size(); i++){
            System.out.println(myCodeGen.get(i));}*/

        // System.out.println("EXPR1: "+ expr1 + "EXPR2: " + expr2);
        //   visit(ctx.relop());
      /*  if(visit(ctx.relop()).equals("==")
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
        }*/
        return null; }


    @Override public Object visitExprAST(MiParser.ExprASTContext ctx) {
        ArrayList<String> typesList = new ArrayList<>();
        typesList.add((String) visit(ctx.term(0)));
        for(int i = 1; i<=ctx.term().size()-1; i++){
            // System.out.println("EXPR: "+ (String) visit(ctx.term(i)));
            typesList.add((String) visit(ctx.term(i)));
        }
        if (ctx.addop(0) != null) { // VISITA PARA DEFINIR SI ES UNA ADD O SUBSTRACT
                visit(ctx.addop(0));
            }

        // SE VERIFICA QUE LA LISTA SEA DEL MISMO TIPO
        String tipo1= typesList.get(0);
        return tipo1;
    }

    @Override public Object visitTermAST(MiParser.TermASTContext ctx) {
        ArrayList<String> typesList = new ArrayList<>();
        typesList.add((String) visit(ctx.factor(0))); //SON VARIOS
        for(int i = 1; i<=ctx.factor().size()-1; i++){
            typesList.add((String) visit(ctx.factor(i)));
        }
       // if (stateWhile == true){ cw= cw +1;
     //   }else{
        if(ctx.mulop(0)!= null){ // VISITA PARA DEFINIR SI ES UNA MULT, DIV O MOD
            visit(ctx.mulop(0));
        }//}
        String tipo1= typesList.get(0);
        return tipo1; }

    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) {
        if(ctx.PARENT_ABIERTO() == null){ //SIGNIFICA QUE SOLO HAY UN DESIGNATOR
            for (int i=0; i<myCodeGen.get(methodPos).size(); i++ ){
                if( myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_I "+ ctx.designator().getText()) ||
                        myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_C "+ ctx.designator().getText()) ){
                    myCodeGen.get(methodPos).add("LOAD_FAST " + ctx.designator().getText());
                }else{ myCodeGen.get(methodPos).add("LOAD_GLOBAL " + ctx.designator().getText());}
            }

        }else{ //SIGNIFICA QUE HAY UN MÉTODO
            //PRIMERO SE CARGAN PARAMS SI HAY, VISITAR ACTPARS
            visit(ctx.actPars());

            myCodeGen.get(methodPos).add("LOAD_GLOBAL " + ctx.designator().getText());
            myCodeGen.get(methodPos).add("CALL_FUNCTION 1");
        }

        String tipo = (String) visit(ctx.designator());
        return tipo;
    }

    @Override public Object visitNumberFactorAST(MiParser.NumberFactorASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else{
        myCodeGen.get(methodPos).add("LOAD_CONST "+ ctx.getText());
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return "int"; }

    @Override public Object visitCharconsFactorAST(MiParser.CharconsFactorASTContext ctx) {
        //myCodeGen.get(methodPos).add("LOAD_FAST "+ ctx.getText());
        for (int i=0; i<myCodeGen.get(methodPos).size(); i++ ){
            if( myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_I "+  ctx.getText()) ||
                    myCodeGen.get(methodPos).get(i) == ("PUSH_LOCAL_C "+  ctx.getText()) ){
                myCodeGen.get(methodPos).add("LOAD_FAST " +  ctx.getText());
            }else{ myCodeGen.get(methodPos).add("LOAD_GLOBAL " +  ctx.getText());}
        }

        if (stateIf = true){
            countToJump= countToJump +1;
        }
        if (stateWhile == true){ cw= cw +1; }
        return "char"; }


    @Override public Object visitBoolFactorAST(MiParser.BoolFactorASTContext ctx) {
        return "bool"; }

    @Override public Object visitNewFactorAST(MiParser.NewFactorASTContext ctx) {
        isNew = true;
        String tipo = "Error";
        if((tableC.exists(ctx.IDENT().getText()))){
            tipo = ctx.IDENT().getText();
            System.out.println(tipo);
            return tipo;
        }
        return tipo;
    }

    @Override public Object visitParentFactorAST(MiParser.ParentFactorASTContext ctx) {
        visit(ctx.expr());
        return null; }



    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) {

        forStat=true; //Variable para el visit del for
        String isArrayBool = "false";

        /** SE DEBE BUSCAR EN LA LISTA DE IDENT
         * DESPUÉS SE DEBE VERIFICAR SI ESE TIPO EXISTE DESDE EL SUBINDICE 0 YA SEA TIPO BÁSICO O CLASE
         * SE BUSCA EN LA LISTA DE EXPRESSIONS PARA DETERMINAR SI SON INTEGERS
         * AL FINAL ME DEBE DEVOLVER EL TIPO DE DESIGNATOR*/
        String tipo = ctx.IDENT(0).getText(); // se setea el iden inicial


        if((ctx.PUNTO(0)== null) && (ctx.LLAVE_ABIERTA(0) == null)){
         /*   if(isExpr == true){
                myCodeGen.add("LOAD_FAST "+ tipo);
                for(int i=0; i<=myCodeGen.size(); i++){
                    System.out.println(myCodeGen.get(i));}
            }*/


            SymbolTable.Symbol auxSymbol = tableS.retrieve(tipo);
            String tipoAuxSymbol;
            if(auxSymbol!= null){
                tipoAuxSymbol = auxSymbol.getType();
                if(tipoAuxSymbol != null){ // si es parámetro
                    return tipoAuxSymbol;
                }
            }

            if((tipo!= "int") || (tipo!= "char")){
                ClassTable.Symbol aux = tableC.retrieve(tipo);
                if(aux == null){
                    System.out.println("Semantic Error (" + ctx.IDENT(0).getSymbol().getLine() + ":" + (ctx.IDENT(0).getSymbol().getCharPositionInLine() + 1)
                            + "): +++ Wrong Data Type || Variable not declared +++");
                    return "Error";
                }
                else{
                    return tipo;
                }
            }

            else{
                return tipo;
            }


        }
        else{
            // CICLO PARA ID.ID O PARA [CORCHETE][CORCHETE]

            // tipoTemp = tipo;

            ArrayList<String> attributes;
            ArrayList<String> types;
            ArrayList<String> isArray;
            int index;
            SymbolTable.Symbol auxSymbol = tableS.retrieve(tipo); // primer dato que trae clase.algo
            // si auxsymbol != null
            tipo = auxSymbol.getType();
            for(int i= 1; i <= ctx.IDENT().size()-1; i++){ // verificar si ese tipo es un tipo válido

                ClassTable.Symbol auxSymbol2 = tableC.retrieve(tipo);
                if(auxSymbol2 == null){
                    System.out.println("Semantic Error (" + ctx.IDENT(0).getSymbol().getLine() + ":" + (ctx.IDENT(0).getSymbol().getCharPositionInLine() + 1)
                            + "): +++ Unknown Class  +++");
                    return "Error";
                }

                else{
                    // ClassTable.Symbol auxSymbol2 = tableC.retrieve(auxSymbol.getType());
                    attributes = auxSymbol2.getAttributes(); // atributos del symbol en cuestión
                    types = auxSymbol2.getTypesList();
                    isArray = auxSymbol2.getIsArray();

                    if( !attributes.contains( ctx.IDENT(i).getText())){ // si no está el tipo en la tabla de clases
                        System.out.println("Semantic Error (" + ctx.IDENT(0).getSymbol().getLine() + ":" + (ctx.IDENT(0).getSymbol().getCharPositionInLine() + 1)
                                + "): +++ Class has no " + ctx.IDENT(i).getText() + " member +++");
                        return "Error";

                    }
                    else{
                        index = attributes.indexOf(ctx.IDENT(i).getText());
                        tipo = types.get(index);
                        isArrayBool = isArray.get(index);

                        // auxSymbol = tableS.retrieve(tipo);


                    }


                }
            }
            if((isArrayBool == "true") && (ctx.expr().size()>0)){
                for(int i = 0; i<= ctx.expr().size()-1; i++){
                    String exprType = (String) visit(ctx.expr(i));
                    if(exprType != "int"){
                        System.out.println("Semantic Error (" + ctx.IDENT(0).getSymbol().getLine() + ":" + (ctx.IDENT(0).getSymbol().getCharPositionInLine() + 1)
                                + "): +++ Index Array Type should be a number instead got" + exprType);
                        return "Error";
                    }
                }

            }
            else if((isArrayBool == "false") && (ctx.expr().size()>0)){
                System.out.println("Semantic Error (" + ctx.IDENT(0).getSymbol().getLine() + ":" + (ctx.IDENT(0).getSymbol().getCharPositionInLine() + 1)
                        + "): +++ Class member is not type Array");
                return "Error";
            }


        }

        return tipo;
    }

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

    @Override public Object visitSumaAddopAST(MiParser.SumaAddopASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else{
            myCodeGen.get(methodPos).add("BINARY_ADD");
        //myCodeGen.add("BINARY_ADD");
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return visitChildren(ctx); }

    @Override public Object visitRestaAddopAST(MiParser.RestaAddopASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else{ myCodeGen.get(methodPos).add("BINARY_SUBSTRACT");
       // myCodeGen.add("BINARY_SUBSTRACT");
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return visitChildren(ctx);  }

    @Override public Object visitMultMulopAST(MiParser.MultMulopASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else{  myCodeGen.get(methodPos).add("BINARY_MULTIPLY");
       // myCodeGen.add("BINARY_MULTIPLY");
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return visitChildren(ctx); }

    @Override public Object visitSlashMulopAST(MiParser.SlashMulopASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else{  myCodeGen.get(methodPos).add("BINARY_DIVIDE"); // myCodeGen.add("BINARY_DIVIDE");
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return visitChildren(ctx); }

    @Override public Object visitPorcMulopAST(MiParser.PorcMulopASTContext ctx) {
        if (stateWhile == true){ cw= cw +1;
        }else {  myCodeGen.get(methodPos).add("BINARY_MODULO");
       // myCodeGen.add("BINARY_MODULO");
            if (stateIf = true){
                countToJump= countToJump +1;
            }}
        return visitChildren(ctx); }


}
