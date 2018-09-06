// TECNOLÓGICO DE COSTA RICA
// I PROYECTO
// CHRISTIAN SÁNCHEZ SALAS
// KATHERINE TUZ CARRILLO
//-------------------------------------------------------------------------------------------------
lexer grammar MiScanner;
//--------------------------------------------COMENTARIOS-------------------------------------------
INICIO_COMEN: '/*';
FIN_COMEN:'*/';
SIMPLE_COMEN:'//';
COMENTARIO: INICIO_COMEN (LETTER | DIGIT | COMENTARIO)* FIN_COMEN //HAY QUE HACER CAMBIOS
            | SIMPLE_COMEN (LETTER | DIGIT | COMENTARIO)*; // SE LLAMA A COMENTARIO PARA QUE PUEDA SER UN COMENTARIO ANIDADO
//------------------------------------------------AJUSTES--------------------------------------------
WS:[ \t\n\r]+ -> skip; // cambio linea, return carry, tab, espacio blanco, bbbb
COMILLAS: ' " ';
//------------------------------------------- CARACTERES/ CLASES LÉXICAS--------------------------------------------
LETTER: [A-Za-z_][A-Za-z0-9_]*;
DIGIT: [0-9]+;
ID: LETTER (LETTER | DIGIT)*;
//falta printableChar=
//falta num= es un número que no debe comenzar con 0 a menos de que sea el número 0.
//falta:  permitir además el uso de punto flotante para aquellas constantes float (el separador de decimales de float debe ser el mismo que en C#.
//-------------------------------------- CONSTANTES----------------------------------------------------
COMSIMPLE: '\''; //comilla simple
CHAR: COMSIMPLE LETTER COMSIMPLE;
//falta int
//falta float
//falta bool

//STRING
fragment COMILLA: ' " ';
STRING: COMILLA . COMILLA;
//------------------------------------------OPERADORES--------------------------------------------------
ASSIGN: '=';
SUMA: '+';
SUMAS: '++';
RESTA: '-';
RESTAS:'--';
MULT: '*';
SLASH: '/';
PORC:'%';
IGUALES:'==';
IGUAL:'=';
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
//------------------------------------------PALABRAS RESERVADAS----------------------------------------
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
//------------------------------------------PATRONES-------------------------------------------------
GUIONB: '_';
IDENT: LETTER (LETTER | DIGIT | GUIONB)*;
NUMBER: DIGIT (DIGIT)*;
//CharConst:







