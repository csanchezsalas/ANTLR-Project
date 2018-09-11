/*          TECNOLÓGICO DE COSTA RICA
              UNIDAD DE COMPUTACIÓN
             COMPILADORES PROYECTO
             ----------------------
             CHRISTIAN SÁNCHEZ SALAS
             KATHERINE TUZ CARRILLO
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
//--------------------------------------------------------------------------------------------------
NUMBER: [0-9]+;

IDENT: LETTER (LETTER | NUMBER)*;

LETTER: [A-Za-z_];

FLOAT: (NUMBER) PUNTO (NUMBER);

PRINTABLECHAR: LETTER '+' NUMBER '+' (EXCLAMA COMILLA GATO DOLAR PORC ANDUNO COMSIMPLE
                PARENT_ABIERTO PARENT_CERRADO MULT SUMA COMA RESTA
                PUNTO SLASH DOSPTO PYC MENOR IGUAL MAYOR PREGUNTA ARROBA);

CHARCONST: COMSIMPLE(PRINTABLECHAR | '\n' | '\r') COMSIMPLE;

STRING: COMILLA . COMILLA;

fragment TRUE: 'true';
fragment FALSE: 'false';
BOOL: TRUE | FALSE;
//--------------------------------------------------------------------------------------------------
fragment COMSIMPLE: '\'';
fragment COMILLA: ' " ';
fragment EXCLAMA: '!';
fragment GATO: '#';
fragment DOLAR: '$';
fragment ANDUNO: '&';
fragment DOSPTO: ':';
fragment PREGUNTA:'?';
fragment ARROBA:'@';
//--------------------------------------------------------------------------------------------------
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





