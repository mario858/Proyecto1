package proyecto1_200614833.Analisis;
import java_cup.runtime.Symbol;
%%

tdstring =[\"] [^\"\n]+ [\"\n]

digito = [0-9]
numero = {digito}+ | ({digito}+"."{digito}+)
letra =[a-zA-ZÑñ]+

caracter = "'" [a-zA-ZÑñ] "'"
iden ={letra}({letra}|{numero}|"_")*

%state A
%cupsym SimboloH
%class LexicoH
%cup
%public
%unicode
%public
%line
%char
%ignorecase
%%


//PALABRAS RESERVADAS
"let"     	{return new Symbol(SimboloH.tlet, yychar,yyline, yytext()); }
"Calcular" 	{return new Symbol(SimboloH.tcalcular, yychar,yyline, yytext()); }
"Succ"    	{return new Symbol(SimboloH.taumento, yychar,yyline, yytext()); }
"Decc"    	{return new Symbol(SimboloH.tdecremento, yychar,yyline, yytext()); }
"Min"    	{return new Symbol(SimboloH.tmin, yychar,yyline, yytext());}
"Max"    	{return new Symbol(SimboloH.tmax, yychar,yyline, yytext());}


/* OPERACIONES DE LIESTAS */
"sum"    		{return new Symbol(SimboloH.tsum, yychar,yyline, yytext());}
"product"    	{return new Symbol(SimboloH.tproduct, yychar,yyline, yytext());}
"revers"    	{return new Symbol(SimboloH.trevers, yychar,yyline, yytext());}
"impr" 		   	{return new Symbol(SimboloH.timpr, yychar,yyline, yytext());}
"par" 		   	{return new Symbol(SimboloH.tpar, yychar,yyline, yytext());}
"asc" 		   	{return new Symbol(SimboloH.tasc, yychar,yyline, yytext());}
"desc" 		   	{return new Symbol(SimboloH.tdesc, yychar,yyline, yytext());}
"length" 	   	{return new Symbol(SimboloH.tlength, yychar,yyline, yytext());}



/* PALABRAS RESERVADAS */
"end" 	   		{return new Symbol(SimboloH.tend, yychar,yyline, yytext());}
"if" 	   		{return new Symbol(SimboloH.tif, yychar,yyline, yytext());}
"then" 	   		{return new Symbol(SimboloH.tthen, yychar,yyline, yytext());}
"else" 	   		{return new Symbol(SimboloH.telse, yychar,yyline, yytext());}
"case" 	   		{return new Symbol(SimboloH.tcase, yychar,yyline, yytext());}

/* OPERADOR */
"pot" {return new Symbol(SimboloH.potencia, yychar,yyline, yytext()); }
"mod" {return new Symbol(SimboloH.mod, yychar,yyline, yytext()); }
"sqtr" {return new Symbol(SimboloH.radicacion, yychar,yyline, yytext()); }

"=" {return new Symbol(SimboloH.asignacion, yychar,yyline, yytext()); }
"*" {return new Symbol(SimboloH.por, yychar,yyline, yytext()); }
"/" {return new Symbol(SimboloH.division, yychar,yyline, yytext()); }
"+" {return new Symbol(SimboloH.mas, yychar,yyline, yytext()); }
"-" {return new Symbol(SimboloH.menos, yychar,yyline, yytext()); }

"$"	{return new Symbol(SimboloH.dolar, yychar,yyline, yytext()); }
"%" {return new Symbol(SimboloH.ultimo, yychar,yyline, yytext()); } // Valido solo en consola

"||"    {return new Symbol(SimboloH.or, yychar,yyline, yytext()); }
"&&"    {return new Symbol(SimboloH.and, yychar,yyline, yytext()); }

">"     {return new Symbol(SimboloH.mayor, yychar,yyline, yytext()); }
"<"     {return new Symbol(SimboloH.menor, yychar,yyline, yytext()); }
">="    {return new Symbol(SimboloH.mayorigual, yychar,yyline, yytext()); }
"<="    {return new Symbol(SimboloH.menorigual, yychar,yyline, yytext()); }
"=="    {return new Symbol(SimboloH.igualigual, yychar,yyline, yytext()); }
"!="    {return new Symbol(SimboloH.noigual, yychar,yyline, yytext()); }

/* AGRUPACION */
"["     {return new Symbol(SimboloH.acorchete, yychar,yyline, yytext()); }
"]"     {return new Symbol(SimboloH.ccorchete, yychar,yyline, yytext()); }
"("     {return new Symbol(SimboloH.aparentesis, yychar,yyline, yytext()); }
")"     {return new Symbol(SimboloH.cparentesis, yychar,yyline, yytext()); }
"{"     {return new Symbol(SimboloH.allave, yychar,yyline, yytext()); }
"}"     {return new Symbol(SimboloH.cllave, yychar,yyline, yytext()); }

"," 	{return new Symbol(SimboloH.coma, yychar,yyline, yytext()); }

/* OTRO TIPO DE OPERACION */

"++" 	{return new Symbol(SimboloH.tconcat, yychar,yyline, yytext()); }
"!!" 	{return new Symbol(SimboloH.tindice, yychar,yyline, yytext()); }




/* String */
{tdstring} 	{return new Symbol(SimboloH.cadena, yychar,yyline,new String(yytext()));}
{numero} 	{return new Symbol(SimboloH.numero, yychar,yyline,new String(yytext()));}
{iden} 		{return new Symbol(SimboloH.iden, yychar,yyline,new String(yytext()));}
{caracter} 	{return new Symbol(SimboloH.caracter, yychar,yyline,new String(yytext()));}


/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}

/* Cualquier Otro */
. { System.out.println("Error lexico: " + yytext() +" Columna "+ yychar+" Fila"+ yyline); }