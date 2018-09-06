lexer grammar MiScanner;

PYC : ';';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
COLON: ':';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
LET: 'let';
BEGIN: 'begin';
END: 'end';
IN: 'in';
DO: 'do';
CONST: 'const';
VAR: 'var';
SYMBOL1: '~';
PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSED:  ')';
ASSIGN: ':=';
ID: [A-Za-z_][A-Za-z0-9_]*; //DEFINE UNA SECUENCIA, UN ID ES: DE A-Z ó de a-z ó _ + A-Z o a-z ó _
NUMBER: [0-9]+; // DEFINE SECUENCIA
// CHAR '\''(LETTER | DIGIT)*;
WS:[ \t\n\r]+ -> skip;


// algo . algo (el punto representa cualquier cosa)


//CADENA : (ZERO | ONE)* ZERO ONE; //REGLA O ó 1 muchas veces, termina en 01


/*fragment ZERO : '0'; //TOKEN QUE EN EL LENGUAJE RECONOCERÁ COMO ZERO, CADA VEZ QUE INTERPRETE UN 0 ENTENDERÁ "ZERO"
fragment ONE : '1';*/

