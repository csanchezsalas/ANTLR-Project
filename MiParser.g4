parser grammar MiParser;

options {
    tokenVocab = MiScanner;

}

program: singleCommand                                      #programAST;

singleCommand: ID ASSIGN expression                         #assignSCAST
| ID PARENTHESIS_OPEN expression PARENTHESIS_CLOSED         #funCallSCAST
| IF expression THEN singleCommand ELSE singleCommand       #ifSCAST
| WHILE  expression DO  singleCommand                       #whileSCAST
| LET declaration IN singleCommand #declarationSCAST| BEGIN command END  #blockSCAST;

command: singleCommand ( PYC singleCommand)*                 #commandAST;

expression: primaryExpression ( (PLUS|MINUS|MULT|DIV) NUMBER| ID)*  #expressionAST;

primaryExpression: NUMBER #numPEAST| ID #idPEAST| PARENTHESIS_OPEN expression PARENTHESIS_CLOSED #groupPEAST;

//typeDenoter: ID EOF;
singleDeclaration: (CONST ID SYMBOL1 expression) #constDeclAST| (VAR ID COLON ID) #varDeclAST;

declaration: singleDeclaration (PYC singleDeclaration)*;

//start :
//(CADENA PYC)* EOF;
