/*          TECNOLÓGICO DE COSTA RICA
              UNIDAD DE COMPUTACIÓN
             COMPILADORES PROYECTO
             ----------------------
             CHRISTIAN SÁNCHEZ SALAS
             KATHERINE TUZ CARRILLO
*/
parser grammar MiParser;

options {
    tokenVocab = MiScanner;
}

program: CLASS IDENT (constDecl | varDecl | classDecl)* CURLY_ABIERTO (methodDecl)* CURLY_CERRADO EOF                  #programAST;

constDecl: CONST type IDENT IGUAL (NUMBER | CHARCONST) PYC                                                          #constDAST;

varDecl: type IDENT (COMA IDENT)* PYC                                                                               #varDAST;

classDecl: CLASS IDENT CURLY_ABIERTO (varDecl)* CURLY_CERRADO                                                       #classDAST;

methodDecl: (type | VOID) IDENT PARENT_ABIERTO (formPars)? PARENT_CERRADO (varDecl)* block                          #methodDAST;

formPars: type IDENT (COMA type IDENT)*                                                                             #formPAST;

type: IDENT (LLAVE_ABIERTA LLAVE_CERRADA)?                                                                          #typeAST;

statement: designator (IGUAL expr | PARENT_ABIERTO (actPars)? PARENT_CERRADO | SUMAS | RESTAS) PYC                  #designatorStatAST
            | (IF PARENT_ABIERTO condition PARENT_CERRADO statement ( ELSE statement)? )                            #ifStatAST
            | (FOR PARENT_ABIERTO expr PYC (condition)? PYC (statement)? statement)                                 #forStatAST
            | (WHILE PARENT_ABIERTO condition PARENT_CERRADO statement)                                             #whileStatAST
            | (BREAK PYC)                                                                                           #breakStatAST
            | (RETURN (expr)? PYC)                                                                                  #returnStatAST
            | (READ PARENT_ABIERTO designator PARENT_CERRADO PYC)                                                   #readStatAST
            | (WRITE PARENT_ABIERTO expr (COMA NUMBER)? PARENT_CERRADO PYC)                                         #writeStatAST
            | block                                                                                                 #blockStatAST
            | PYC                                                                                                   #pycStatAST;

block: CURLY_ABIERTO (statement)* CURLY_CERRADO                                                                     #blockAST;

actPars: expr(COMA expr)*                                                                                           #actParsAST;

condition: condTerm (OR condTerm)*                                                                                  #conditionAST;

condTerm: condFact(AND condFact)*                                                                                   #condTermAST;

condFact: expr relop expr                                                                                           #condFactAST;

expr: (RESTA)? term (addop term)*                                                                                   #exprAST;

term: factor (mulop factor)*                                                                                        #termAST;

factor: designator (PARENT_ABIERTO (actPars)? PARENT_CERRADO)?                                                      #designatorFactorAST
        | NUMBER                                                                                                    #numberFactorAST
        | CHARCONST                                                                                                 #charconsFactorAST
        | BOOL                                                                                                      #boolFactorAST
        | NEW IDENT                                                                                                 #newFactorAST
        | (PARENT_ABIERTO expr PARENT_CERRADO PUNTO)                                                                #parentFactorAST;

designator: IDENT (PUNTO IDENT | LLAVE_ABIERTA expr LLAVE_CERRADA)*                                                #designatorAST;

relop: IGUALES                                                                                                     #igualesRelopAST
        | DIFERENTE                                                                                                #diferenteRelopAST
        | MAYOR                                                                                                    #mayorRelopAST
        | MAY_IGUAL                                                                                                #mayigualRelopAST
        | MENOR                                                                                                    #menorRelopAST
        | MEN_IGUAL                                                                                                #menigualRelopAST;

addop: SUMA                                                                                                        #sumaAddopAST
       | RESTA                                                                                                     #restaAddopAST;

mulop: MULT                                                                                                        #multMulopAST
       | SLASH                                                                                                     #slashMulopAST
       | PORC                                                                                                      #porcMulopAST;
