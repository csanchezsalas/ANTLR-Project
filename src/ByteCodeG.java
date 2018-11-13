import generated.MiParser;
import generated.MiParserBaseVisitor;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ByteCodeG extends MiParserBaseVisitor {
   ArrayList<ArrayList> myCodeGen = new ArrayList<>();
   ArrayList<String> globals = new ArrayList<>();
   boolean inMethod= false;
   int index= -1;

    public ByteCodeG() {
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

/*    @Override public Object visitMethodDAST(MiParser.MethodDASTContext ctx) {

    }

    @Override public Object visitFormPAST(MiParser.FormPASTContext ctx) {

    }*/

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
