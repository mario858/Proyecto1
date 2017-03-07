package proyecto1_200614833.Analisis;
import java_cup.runtime.Symbol;
%%

Comentario ="/"[*] [^*]+ [*]"/" | "/"[*] [*]+ "/"
Comentario2 =[/][/] ([^\r\n])* \r|\n
tdstring =[\"] [^\"\n]+ [\"\n]

digito = [0-9]
numero = {digito}+ | ({digito}+"."{digito}+)
letra =[a-zA-ZÑñ]+
caracter = "'" [a-zA-ZÑñ] "'"

iden ={letra}({letra}|{numero}|"_")*

%state A
%cupsym SimboloG
%class LexicoG
%cup
%public
%unicode
%public
%line
%char
%ignorecase
%%


//PALABRAS RESERVADAS

/* OPERADORES*/




//PALABRAS RESERVADAS


"break"     {return new Symbol(SimboloG.tbreak, yychar,yyline, yytext()); }
"default"   {return new Symbol(Simbolo.tdefault, yychar,yyline, yytext()); }
"continue"   {return new Symbol(Simbolo.tcontinue, yychar,yyline, yytext()); }

"class"     {return new Symbol(Simbolo.tclass, yychar,yyline, yytext()); }
"import"    {return new Symbol(Simbolo.timport, yychar,yyline, yytext()); }
"return"    {return new Symbol(Simbolo.treturn, yychar,yyline, yytext()); }

"if"        {return new Symbol(Simbolo.tif, yychar,yyline, yytext()); }
"else"      {return new Symbol(Simbolo.telse, yychar,yyline, yytext()); }
"elseif"    {return new Symbol(Simbolo.telseif, yychar,yyline, yytext()); }
"for"       {return new Symbol(Simbolo.tfor, yychar,yyline, yytext()); }
"switch"    {return new Symbol(Simbolo.tswitch, yychar,yyline, yytext()); }
"case"      {return new Symbol(Simbolo.tcase, yychar,yyline, yytext()); }
"while"     {return new Symbol(Simbolo.twhile, yychar,yyline, yytext()); }
"do"        {return new Symbol(Simbolo.tdo, yychar,yyline, yytext()); }
"repeat"     {return new Symbol(Simbolo.trepeat, yychar,yyline, yytext()); }
"until"     {return new Symbol(Simbolo.tuntil, yychar,yyline, yytext()); }
"loop"      {return new Symbol(Simbolo.tloop, yychar,yyline, yytext()); }

"extends"   {return new Symbol(Simbolo.textends, yychar,yyline, yytext()); }

"public"    {return new Symbol(Simbolo.tpublic, yychar,yyline, yytext()); }
"private"   {return new Symbol(Simbolo.tprivate, yychar,yyline, yytext()); }
"protected" {return new Symbol(Simbolo.tprotected, yychar,yyline, yytext()); }

"void"      {return new Symbol(Simbolo.tvoid, yychar,yyline, yytext()); }
"super"     {return new Symbol(Simbolo.tsuper, yychar,yyline, yytext()); }
"null"      {return new Symbol(Simbolo.tnull, yychar,yyline, yytext()); }

"int"       {return new Symbol(Simbolo.tint, yychar,yyline, yytext()); }
"double"    {return new Symbol(Simbolo.tdouble, yychar,yyline, yytext()); }
"char"      {return new Symbol(Simbolo.tchar, yychar,yyline, yytext()); }
"bool"      {return new Symbol(Simbolo.tbool, yychar,yyline, yytext()); }
"string"    {return new Symbol(Simbolo.tstring, yychar,yyline, yytext()); }

"true"    	{return new Symbol(Simbolo.verdadero, yychar,yyline, yytext()); }
"false"    	{return new Symbol(Simbolo.falso, yychar,yyline, yytext()); }
"new"		{return new Symbol(Simbolo.tnew, yychar,yyline, yytext()); }

"<!Override!>"  {return new Symbol(Simbolo.tsobreescribir, yychar,yyline, yytext()); }
"THIS"      {return new Symbol(Simbolo.tthis, yychar,yyline, yytext()); }

/*FUNCIONES ESPECIALES*/

"print("        {return new Symbol(Simbolo.tprint, yychar,yyline, yytext()); }
"ParseInt("     {return new Symbol(Simbolo.tparseint, yychar,yyline, yytext()); }
"ParseDouble("  {return new Symbol(Simbolo.tparsedouble, yychar,yyline, yytext()); }
"intToSTR("     {return new Symbol(Simbolo.tinttostr, yychar,yyline, yytext()); }
"doubleToSTR("  {return new Symbol(Simbolo.tdobuletostr, yychar,yyline, yytext()); }
"doubleToInt("  {return new Symbol(Simbolo.tdoubletoint, yychar,yyline, yytext()); }


/* ESTRUCTURA GENERAL*/

"<Dec>"		{return new Symbol(Simbolo.idec, yychar,yyline, yytext()); }
"</Dec>"	{return new Symbol(Simbolo.fdec, yychar,yyline, yytext()); }
"<Gram>"	{return new Symbol(Simbolo.igram, yychar,yyline, yytext()); }
"</Gram>"	{return new Symbol(Simbolo.fgram, yychar,yyline, yytext()); }
"<Cod>"		{return new Symbol(Simbolo.icod, yychar,yyline, yytext()); }
"</Cod>"	{return new Symbol(Simbolo.fcod, yychar,yyline, yytext()); }
"<Terminal>"	{return new Symbol(Simbolo.iterminal, yychar,yyline, yytext()); }
"</Terminal>"	{return new Symbol(Simbolo.fterminal, yychar,yyline, yytext()); }

"<nonTerminal>"		{return new Symbol(Simbolo.inonterminal, yychar,yyline, yytext()); }
"</nonTerminal>"	{return new Symbol(Simbolo.fnonterminal, yychar,yyline, yytext()); }
"<tipo>"			{return new Symbol(Simbolo.itipo, yychar,yyline, yytext()); }
"</tipo>"			{return new Symbol(Simbolo.ftipo, yychar,yyline, yytext()); }
"<Lista>"			{return new Symbol(Simbolo.ilista, yychar,yyline, yytext()); }
"</Lista>"			{return new Symbol(Simbolo.flista, yychar,yyline, yytext()); }
"<nombre>"			{return new Symbol(Simbolo.inombre, yychar,yyline, yytext()); }
"</nombre>"			{return new Symbol(Simbolo.fnombre, yychar,yyline, yytext()); }

"<precedencia>"		{return new Symbol(Simbolo.iprecedencia, yychar,yyline, yytext()); }
"</precedencia>"	{return new Symbol(Simbolo.fprecedencia, yychar,yyline, yytext()); }
"<asociatividad>"	{return new Symbol(Simbolo.iasocia, yychar,yyline, yytext()); }
"</asociatividad>"	{return new Symbol(Simbolo.fasocia, yychar,yyline, yytext()); }
"<asociacion>"		{return new Symbol(Simbolo.iasociacion, yychar,yyline, yytext()); }
"</asociacion>"		{return new Symbol(Simbolo.fasociacion, yychar,yyline, yytext()); }

"<inicio>"			{return new Symbol(Simbolo.iinicio, yychar,yyline, yytext()); }
"<sim>"				{return new Symbol(Simbolo.isim, yychar,yyline, yytext()); }
"</sim>"			{return new Symbol(Simbolo.fsim, yychar,yyline, yytext()); }
"</inicio>"			{return new Symbol(Simbolo.finicio, yychar,yyline, yytext()); }

"::="	{return new Symbol(Simbolo.produce, yychar,yyline, yytext()); }
"|"		{return new Symbol(Simbolo.oproduce, yychar,yyline, yytext()); }
"<:"	{return new Symbol(Simbolo.iaccion, yychar,yyline, yytext()); }
":>"	{return new Symbol(Simbolo.faccion, yychar,yyline, yytext()); }

"$"		{return new Symbol(Simbolo.dolar, yychar,yyline, yytext()); }
"$$"	{return new Symbol(Simbolo.dobledolar, yychar,yyline, yytext()); }


/* EXTENSIONES*/

".ulx"		{return new Symbol(Simbolo.tulx, yychar,yyline, yytext()); }
".upg"		{return new Symbol(Simbolo.tupg, yychar,yyline, yytext()); }


/* OPERADOR */
"=" {return new Symbol(Simbolo.asignacion, yychar,yyline, yytext()); }
"*" {return new Symbol(Simbolo.por, yychar,yyline, yytext()); }
"/" {return new Symbol(Simbolo.division, yychar,yyline, yytext()); }
"+" {return new Symbol(Simbolo.mas, yychar,yyline, yytext()); }
"-" {return new Symbol(Simbolo.menos, yychar,yyline, yytext()); }
"^" {return new Symbol(Simbolo.potencia, yychar,yyline, yytext()); }

">"     {return new Symbol(Simbolo.mayor, yychar,yyline, yytext()); }
"<"     {return new Symbol(Simbolo.menor, yychar,yyline, yytext()); }
">="    {return new Symbol(Simbolo.mayorigual, yychar,yyline, yytext()); }
"<="    {return new Symbol(Simbolo.menorigual, yychar,yyline, yytext()); }
"=="    {return new Symbol(Simbolo.igualigual, yychar,yyline, yytext()); }
"!="    {return new Symbol(Simbolo.noigual, yychar,yyline, yytext()); }

"||"    {return new Symbol(Simbolo.or, yychar,yyline, yytext()); }
"??"    {return new Symbol(Simbolo.xor, yychar,yyline, yytext()); }
"&&"    {return new Symbol(Simbolo.and, yychar,yyline, yytext()); }
"¡"     {return new Symbol(Simbolo.not, yychar,yyline, yytext()); }

"++"    {return new Symbol(Simbolo.aumento, yychar,yyline, yytext()); }
"--"    {return new Symbol(Simbolo.decremento, yychar,yyline, yytext()); }




/* AGRUPACION */

"{"     {return new Symbol(Simbolo.allave, yychar,yyline, yytext()); }
"}"     {return new Symbol(Simbolo.cllave, yychar,yyline, yytext()); }
"["     {return new Symbol(Simbolo.acorchete, yychar,yyline, yytext()); }
"]"     {return new Symbol(Simbolo.ccorchete, yychar,yyline, yytext()); }
"("     {return new Symbol(Simbolo.aparentesis, yychar,yyline, yytext()); }
")"     {return new Symbol(Simbolo.cparentesis, yychar,yyline, yytext()); }

"{:"    {return new Symbol(Simbolo.iambito, yychar,yyline, yytext()); }
":}"    {return new Symbol(Simbolo.fambito, yychar,yyline, yytext()); }

";" {return new Symbol(Simbolo.puntoycoma, yychar,yyline, yytext()); }
"," {return new Symbol(Simbolo.coma, yychar,yyline, yytext()); }
"." {return new Symbol(Simbolo.punto, yychar,yyline, yytext()); }
":" {return new Symbol(Simbolo.dospuntos, yychar,yyline, yytext()); }



/* String */
{tdstring} 	{return new Symbol(Simbolo.cadena, yychar,yyline,new String(yytext()));}
{numero} 	{return new Symbol(Simbolo.numero, yychar,yyline,new String(yytext()));}
{iden} 		{return new Symbol(Simbolo.iden, yychar,yyline,new String(yytext()));}
{caracter} 	{return new Symbol(Simbolo.caracter, yychar,yyline,new String(yytext()));}

/* COMENTARIOS */
{Comentario} { /* Se ignoran */}
{Comentario2} { /* Se ignoran */}

/*Expresion regular para ruta de acceso pag 27*/

/* BLANCOS */
[ \t\r\f\n]+ { /* Se ignoran */}

/* Cualquier Otro */
. { System.out.println("Error lexico: "+yytext()); }