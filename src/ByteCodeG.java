import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ByteCodeG extends MiParserBaseVisitor {

    ArrayList<ArrayList> myCodeGen = new ArrayList<>();
    ArrayList<ArrayList> methodData = new ArrayList<>();
    ArrayList<String> globals = new ArrayList<>();
    boolean inMethod= false;
    int index= -1;

    public ByteCodeG() {
    }

    public ArrayList<String> joinLists(ArrayList<String> a, ArrayList<String> b){

        for (int i = 0; i<b.size(); i++){
            a.add(b.get(i));
        }
        return a;
    }

    @Override public Object visitProgramAST(MiParser.ProgramASTContext ctx) {
        /** INICIO DE VISITAS */
        for(int i = 0; i<=ctx.varDecl().size()-1; i++){
            visit(ctx.varDecl(i));
        }
        for(int i = 0; i<=ctx.constDecl().size()-1; i++){
            visit(ctx.constDecl(i));
        }
        for(int i = 0; i<=ctx.methodDecl().size()-1; i++){
            visit(ctx.methodDecl(i));
        }

        printList();
        return null;
    }


    public void printList(){//------- PARA IMPRIMIR LA LISTA DE GEN CODIGO----------
        for(int i=0; i<=myCodeGen.size(); i++){
            System.out.println(myCodeGen.get(i));}
    }

    @Override public Object visitVarDAST(MiParser.VarDASTContext ctx) {
        ArrayList<String>code= new ArrayList<>();
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type());
        Token tipo = typeTokens.get(0);

        if (inMethod == true){
            if (tipo.getText().equals("int") ){
                for(int i = 0; i< ctx.IDENT().size(); i++){
                    index ++;
                    code.add(index+ " PUSH_LOCAL_I "+ctx.IDENT(i).getText());
                }
            }else{
                for(int i = 0; i< ctx.IDENT().size(); i++) {
                    index ++;
                    code.add(index +" PUSH_LOCAL_C "+ctx.IDENT(i).getText());
                }
            }
        }else{
            if (tipo.getText().equals("int") ){
                for(int i = 0; i< ctx.IDENT().size(); i++){
                    index ++;
                    code.add(index+ " PUSH_GLOBAL_I "+ctx.IDENT(i).getText());
                    globals.add(ctx.IDENT(i).getText());
                }
                myCodeGen.add(code);
            }else{
                for(int i = 0; i< ctx.IDENT().size(); i++) {
                    index ++;
                    code.add(index+ " PUSH_GLOBAL_C "+ctx.IDENT(i).getText());
                    globals.add(ctx.IDENT(i).getText());
                }
                myCodeGen.add(code);
            }
        }
        return code;
    }

    @Override public Object visitMethodDAST(MiParser.MethodDASTContext ctx) {
        ArrayList<String>methodMetadata= new ArrayList<>();
        ArrayList<String>code= new ArrayList<>();
        ArrayList<String>params= new ArrayList<>(); //formPars
        ArrayList<String>vars= new ArrayList<>(); //vardecl
        ArrayList<String>blocks= new ArrayList<>(); //vardecl
        inMethod = true;
        index++;
        code.add(index + " DEF "+ ctx.IDENT().getText());
        globals.add(ctx.IDENT().getText()); // método es considerado como parte de las globales

        if(ctx.formPars()!=null){
            /********************************************************/
            /**DATOS DE MÉTODOS: NOMBRE, REFERENCIA, CANT/PARÁMETROS*/
            methodMetadata.add(ctx.IDENT().getText());
            methodMetadata.add(String.valueOf(index));
            params = (ArrayList<String>)visit(ctx.formPars());
            methodMetadata.add(String.valueOf(params.size()));
            methodData.add(methodMetadata);
            /*****************************************************/

            code = joinLists(code, params); // pegando listas

        }
        else{
            /********************************************************/
            /**DATOS DE MÉTODOS: NOMBRE, REFERENCIA, CANT/PARÁMETROS*/
            methodMetadata.add(ctx.IDENT().getText());
            methodMetadata.add(String.valueOf(index));
            methodMetadata.add("0");
            methodData.add(methodMetadata);
            /*****************************************************/

        }

        for(int i = 0; i<ctx.varDecl().size(); i++){
            vars = (ArrayList<String>)visit(ctx.varDecl(i));
            code = joinLists(code, vars);
        }
        /*blocks = (ArrayList<String>)visit(ctx.block()); // block
        code = joinLists(code, blocks);*/


        return code;

    }

    @Override public Object visitFormPAST(MiParser.FormPASTContext ctx) {
        ArrayList<String>code= new ArrayList<>();
        ArrayList<Token> typeTokens = (ArrayList<Token>) visit(ctx.type(0));
        Token tipo = typeTokens.get(0);


        if(tipo.getText().equals("int")){
            index++;
            code.add(index + " PUSH_LOCAL_I "+ ctx.IDENT(0));
        }
        else{
            index++;
            code.add(index + " PUSH_LOCAL_C "+ ctx.IDENT(0));
        }
        for(int i = 1; i<ctx.IDENT().size(); i++){
            typeTokens = (ArrayList<Token>) visit(ctx.type(i));
            tipo = typeTokens.get(i);

            if(tipo.getText().equals("int")){
                index++;
                code.add(index + " PUSH_LOCAL_I "+ ctx.IDENT(i).getText());
            }
            else{
                index++;
                code.add(index + " PUSH_LOCAL_C "+ ctx.IDENT(i).getText());
            }

        }
        return code;
    }

    @Override public Object visitTypeAST(MiParser.TypeASTContext ctx) {
        ArrayList<Token> tokens = new ArrayList<>();
        Token tid = ctx.getStart();
        tokens.add(tid);
        Token pseudo= ctx.getStop(); // aquí va el posible paréntesis cuadrado
        tokens.add(pseudo);
        return tokens;
    }
/*
    @Override public Object visitDesignatorStatAST(MiParser.DesignatorStatASTContext ctx) {

    }


    @Override public Object visitIfStatAST(MiParser.IfStatASTContext ctx) {
       }


    @Override public Object visitWhileStatAST(MiParser.WhileStatASTContext ctx) {

    }

    @Override public Object visitReturnStatAST(MiParser.ReturnStatASTContext ctx) {
        }

    @Override public Object visitWriteStatAST(MiParser.WriteStatASTContext ctx) {
       }

    @Override public Object visitBlockStatAST(MiParser.BlockStatASTContext ctx) {  }

    @Override public Object visitBlockAST(MiParser.BlockASTContext ctx) {
        }

    @Override public Object visitActParsAST(MiParser.ActParsASTContext ctx) {

    }

    @Override public Object visitConditionAST(MiParser.ConditionASTContext ctx) {
      }


    @Override public Object visitCondTermAST(MiParser.CondTermASTContext ctx) {
       }

    @Override public Object visitCondFactAST(MiParser.CondFactASTContext ctx) {
        }

    @Override public Object visitExprAST(MiParser.ExprASTContext ctx) {

    }

    @Override public Object visitTermAST(MiParser.TermASTContext ctx) {
       }

    @Override public Object visitDesignatorFactorAST(MiParser.DesignatorFactorASTContext ctx) {

    }

    @Override public Object visitNumberFactorAST(MiParser.NumberFactorASTContext ctx) {
        }

    @Override public Object visitCharconsFactorAST(MiParser.CharconsFactorASTContext ctx) {
       }


    @Override public Object visitBoolFactorAST(MiParser.BoolFactorASTContext ctx) {  }

    @Override public Object visitParentFactorAST(MiParser.ParentFactorASTContext ctx) {  }

    @Override public Object visitDesignatorAST(MiParser.DesignatorASTContext ctx) {
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
         }

    @Override public Object visitRestaAddopAST(MiParser.RestaAddopASTContext ctx) {
         }

    @Override public Object visitMultMulopAST(MiParser.MultMulopASTContext ctx) {
         }

    @Override public Object visitSlashMulopAST(MiParser.SlashMulopASTContext ctx) {
        }

    @Override public Object visitPorcMulopAST(MiParser.PorcMulopASTContext ctx) {
        }*/
}
