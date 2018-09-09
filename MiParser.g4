/* TECNOLÓGICO DE COSTA RICA
        1 PROYECTO
    CHRISTIAN SÁNCHEZ SALAS
    KATHERINE TUZ CARRILLO
----------------------------------------------------------------------------------------------------
*/
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

program: CLASS IDENT (constDecl | varDecl | classDecl)* CURLY_ABIERTO (methodDecl)* CURLY_CERRADO;

constDecl: CONST type IDENT IGUAL (NUMBER | CHARCONST) PYC ;

varDecl: type IDENT (COMA IDENT)* PYC;

classDecl: CLASS IDENT CURLY_ABIERTO (varDecl)* CURLY_CERRADO;

methodDecl: (type | VOID) IDENT PARENT_ABIERTO (formPars)? PARENT_CERRADO (varDecl)* block;

formPars: type IDENT (COMA type IDENT)*;

type: IDENT (LLAVE_ABIERTA LLAVE_CERRADA)?;

statement: designator (IGUAL expr | PARENT_ABIERTO (actPars)? PARENT_CERRADO | SUMAS | RESTAS) PYC
            | IF PARENT_ABIERTO condition PARENT_CERRADO statement ( ELSE statement)?
            | FOR PARENT_ABIERTO expr PYC (condition)? PYC (statement)? statement
            | WHILE PARENT_ABIERTO condition PARENT_CERRADO statement
            | BREAK PYC
            | RETURN (expr)? PYC
            | READ PARENT_ABIERTO designator PARENT_CERRADO PYC
            | WRITE PARENT_ABIERTO expr (COMA NUMBER)? PARENT_CERRADO PYC
            | block
            | PYC;

block: CURLY_ABIERTO (statement)* CURLY_CERRADO;

actPars: expr(COMA expr)*;

condition: condTerm (OR condTerm)*;

condTerm: condFact(AND condFact)*;

condFact: expr relop expr;

expr: (RESTA)? term (addop term)*;

term: factor (mulop factor)*;

factor: designator (PARENT_ABIERTO (actPars)? PARENT_CERRADO)?
        | NUMBER
        | CHARCONST
        | BOOL
        | NEW IDENT
        | PARENT_ABIERTO expr PARENT_CERRADO PUNTO;

designator: IDENT (PUNTO IDENT | LLAVE_ABIERTA expr LLAVE_CERRADA)* ;

relop: IGUALES | DIFERENTE | MAYOR | MAY_IGUAL | MENOR | MEN_IGUAL;

addop: SUMA | RESTA;

mulop: MULT | SLASH | PORC;
