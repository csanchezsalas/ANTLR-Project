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
COMMENT2 : '/*' (COMMENT2|.)*? '*/' -> skip ;
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

IDENT: LETTER (LETTER | NUMBER)*;

LETTER: [A-Za-z_];

FLOAT: (NUMBER) PUNTO (NUMBER);

STRING: COMILLA . COMILLA;

CHARCONST: COMSIMPLE(PRINTABLECHAR | ESPECIAL1 | ESPECIAL2) COMSIMPLE;

fragment ESPECIAL1: '\\'+'n';
fragment ESPECIAL2: '\\'+'r';
fragment TRUE: 'true';
fragment FALSE: 'false';
BOOL: TRUE | FALSE;

fragment COMSIMPLE: '\'';
fragment EXCLAMA: '!';
fragment COMILLA: ' " ';
fragment GATO: '#';
fragment DOLAR: '$';
fragment ANDUNO: '&';
fragment PREGUNTA:'?';
fragment ARROBA:'@';
fragment DOSPTO: ':';
SUMAS: '++';
RESTAS:'--';
IGUALES:'==';
DIFERENTE: '!=';
MAY_IGUAL: '>=';
MEN_IGUAL: '<=';
AND: '&&';
OR: '||';
COMA:',';
LLAVE_ABIERTA: '[';
LLAVE_CERRADA: ']';
CURLY_ABIERTO: '{';
CURLY_CERRADO: '}';
PORC:'%';
MULT: '*';
PARENT_ABIERTO: '(';
PARENT_CERRADO: ')';
SUMA: '+';
RESTA: '-';
SLASH: '/';
PUNTO:'.';
PYC:';';
MENOR:'<';
IGUAL: '=';
MAYOR: '>';

fragment PRINTABLECHAR: LETTER | NUMBER | P1;
fragment P1: EXCLAMA | COMILLA | GATO | DOLAR | PORC | ANDUNO | COMSIMPLE | PARENT_ABIERTO | PARENT_CERRADO | MULT | SUMA | COMA | RESTA |
                             PUNTO | SLASH | DOSPTO | PYC | MENOR | IGUAL | MAYOR | PREGUNTA | ARROBA ;