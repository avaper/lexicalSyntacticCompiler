package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones

%%
 
%public
%class Scanner
%char
%line
%column
%cup

%implements ScannerIF
%scanerror LexicalError

// incluir aqui, si es necesario otras directivas

%full											// Directiva que utiliza el codigo ASCII extendido
%unicode										// Directiva que utiliza el codigo UNICODE
%ignorecase										// Directiva que inhabilita distincion entre mayusculas/minusculas

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;
%}  

DIGITO=[0-9] 									// Definicion digitos
LETRA=[a-zA-Z]    								// Definicion letras
NUMERO=[1-9]*{DIGITO}  							// Definicion de numero
IDENTIFICADOR=(_|{LETRA})({LETRA}|{DIGITO})* 	// Definicion de identificador
ESPACIOS=([\ \t\b\r\n\f])+  					// Espacio en blanco
COMENTARIO=("#".*"\r\n")						// Comentarios
CADENA=\"[^\"]*\"								// Cadena

%%

// ----------------
//  Estado Inicial
// ----------------

<YYINITIAL> 
{

	// -----------------------
	//   Palabras reservadas
	// -----------------------

	"booleano"		{
						Token token =   new Token (sym.BOOLEANO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"cierto"		{
						Token token =   new Token (sym.CIERTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"comienzo"		{
						Token token =   new Token (sym.COMIENZO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"constantes"	{
						Token token =   new Token (sym.CONSTANTES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"de"			{
						Token token =   new Token (sym.DE);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"en"			{
						Token token =   new Token (sym.EN);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"devolver"		{
						Token token =   new Token (sym.DEVOLVER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}


	"entero"		{
						Token token =   new Token (sym.ENTERO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"entonces"		{
						Token token =   new Token (sym.ENTONCES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"escribir"		{
						Token token =   new Token (sym.ESCRIBIR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"falso"			{
						Token token =   new Token (sym.FALSO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"fin"			{
						Token token =   new Token (sym.FIN);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					} 

	"funcion"		{
						Token token =   new Token (sym.FUNCION);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"no"			{
						Token token =   new Token (sym.NO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"para"			{
						Token token =   new Token (sym.PARA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"procedimiento"	{
						Token token =   new Token (sym.PROCEDIMIENTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"programa"		{
						Token token =   new Token (sym.PROGRAMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"si"			{
						Token token =   new Token (sym.SI);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"sino"			{
						Token token =   new Token (sym.SINO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"subprogramas"	{
						Token token =   new Token (sym.SUBPROGRAMAS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"tipos"			{
						Token token =   new Token (sym.TIPOS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"var"			{
						Token token =   new Token (sym.VAR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"variables"		{
						Token token =   new Token (sym.VARIABLES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"vector"		{
						Token token =   new Token (sym.VECTOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"y"				{
						Token token =   new Token (sym.Y);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	// -----------------------
	//   Delimitadores
	// -----------------------

	"("				{
						Token token =   new Token (sym.PARIZQ);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	")"				{
						Token token =   new Token (sym.PARDER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"["				{
						Token token =   new Token (sym.CORIZQ);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"]"				{
						Token token =   new Token (sym.CORDER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"."				{
						Token token =   new Token (sym.PUNTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	","				{
						Token token =   new Token (sym.COMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	";"				{
						Token token =   new Token (sym.PUNTOYCOMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	":"				{
						Token token =   new Token (sym.DOSPUNTOS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	".."			{
						Token token =   new Token (sym.RANGO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	// --------------------------
	//   Operadores aritméticos
	// --------------------------

	"+"				{
						Token token =   new Token (sym.SUMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"*"				{
						Token token =   new Token (sym.PRODUCTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	// ---------------------------
	//   Operadores relacionales
	// ---------------------------

	"<"				{
						Token token =   new Token (sym.MENOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	"=="			{
						Token token =   new Token (sym.IGUAL);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	// ----------------------------
	//   Operadores de asignación
	// ----------------------------

	"="				{
						Token token =   new Token (sym.ASIGNACION);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	// ----------------------------
	//   Patrones
	// ----------------------------

	{ESPACIOS} 		{}

	{COMENTARIO} 	{}

	{CADENA} 		{
						Token token =   new Token (sym.CADENA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}
					
	{NUMERO} 		{
						Token token =   new Token (sym.NUMERO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					}

	{IDENTIFICADOR} {
						Token token =   new Token (sym.IDENTIFICADOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
					} 

	// error en caso de coincidir con ningún patrón
	[^]				{
						LexicalError error = new LexicalError ();
						error.setLine (yyline + 1);
						error.setColumn (yycolumn + 1);
						error.setLexema (yytext ());
						lexicalErrorManager.lexicalError (error);
					}
		
} // Fin del estado YYINITIAL