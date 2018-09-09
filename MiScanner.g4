// TECNOLÓGICO DE COSTA RICA
// I PROYECTO
// CHRISTIAN SÁNCHEZ SALAS
// KATHERINE TUZ CARRILLO
//-------------------------------------------------------------------------------------------------
/* TECNOLÓGICO DE COSTA RICA
        1 PROYECTO
    CHRISTIAN SÁNCHEZ SALAS
    KATHERINE TUZ CARRILLO
----------------------------------------------------------------------------------------------------
*/
lexer grammar MiScanner;

//------------------------------------------------AJUSTES--------------------------------------------
WS:[ \t\n\r]+ -> skip;
//--------------------------------------------COMENTARIOS-------------------------------------------
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
//--------------------------------------------------------------------------------------------------
IF: 'if';
ELSE: 'else';
BREAK: 'break';
CLASS: 'class';
CONST: 'const';
NEW: 'new';
READ: 'read';
RETURN: 'return';
VOID: 'void';
WHILE: 'while';
WRITE: 'write';
FOR: 'for';


NUMBER: [0-9]+;

LETTER: [A-Za-z_];

IDENT: LETTER (LETTER | NUMBER)*;

//fragment CERO:[0];

//NUM: CERO | NUMVALIDO (NUMBER)* ; //num= es un número que no debe comenzar con 0 a menos de que sea el número 0.

FLOAT: (NUMBER) PUNTO (NUMBER); //permitir además el uso de punto flotante para aquellas constantes float (el separador de decimales de float debe ser el mismo que en C#.



PRINTABLECHAR: LETTER '+' NUMBER '+' (EXCLAMA COMILLA GATO DOLAR PORC ANDUNO COMSIMPLE
                PARENT_ABIERTO PARENT_CERRADO MULT SUMA COMA RESTA
                PUNTO SLASH DOSPTO PYC MENOR IGUAL MAYOR PREGUNTA ARROBA); //printableChar = letter ∪ digit ∪   ! " # $ % & ' ( ) * + , - . / : ; < = > ? @

CHARCONST: COMSIMPLE(PRINTABLECHAR | '\n' | '\r') COMSIMPLE; //CharConst: "'" ( printableChar | "\n" | "\r" ) "'"

STRING: COMILLA . COMILLA;

BOOL: TRUE | FALSE;


fragment COMSIMPLE: '\'';
fragment TRUE: 'true';
fragment FALSE: 'false';
fragment COMILLA: ' " ';

fragment NUMVALIDO: [1-9]+;
fragment EXCLAMA: '!';
fragment GATO: '#';
fragment DOLAR: '$';
fragment ANDUNO: '&';
fragment DOSPTO: ':';
fragment PREGUNTA:'?';
fragment ARROBA:'@';

SUMA: '+';
SUMAS: '++';
RESTA: '-';
RESTAS:'--';
MULT: '*';
SLASH: '/';
PORC:'%';
IGUAL: '=';
IGUALES:'==';
DIFERENTE: '!=';
MAYOR: '>';
MAY_IGUAL: '>=';
MENOR:'<';
MEN_IGUAL: '<=';
AND: '&&';
OR: '||';
PYC:';';
COMA:',';
PUNTO:'.';
PARENT_ABIERTO: '(';
PARENT_CERRADO: ')';
LLAVE_ABIERTA: '[';
LLAVE_CERRADA: ']';
CURLY_ABIERTO: '{';
CURLY_CERRADO: '}';





