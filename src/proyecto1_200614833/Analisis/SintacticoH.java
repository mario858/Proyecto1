
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Mon Mar 06 23:23:03 CST 2017
//----------------------------------------------------

package proyecto1_200614833.Analisis;

import java_cup.runtime.*;
import java.util.LinkedList;
import proyecto1_200614833.Nodo;

/** CUP v0.10k generated parser.
  * @version Mon Mar 06 23:23:03 CST 2017
  */
public class SintacticoH extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public SintacticoH() {super();}

  /** Constructor which sets the default scanner. */
  public SintacticoH(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\046\000\002\002\004\000\002\003\003\000\002\004" +
    "\003\000\002\004\003\000\002\004\003\000\002\024\003" +
    "\000\002\024\003\000\002\024\003\000\002\024\003\000" +
    "\002\024\003\000\002\023\003\000\002\023\003\000\002" +
    "\005\010\000\002\005\010\000\002\007\005\000\002\007" +
    "\003\000\002\006\005\000\002\006\003\000\002\011\006" +
    "\000\002\012\006\000\002\013\006\000\002\014\006\000" +
    "\002\015\006\000\002\016\007\000\002\020\004\000\002" +
    "\020\004\000\002\021\004\000\002\021\003\000\002\022" +
    "\004\000\002\010\005\000\002\010\005\000\002\010\005" +
    "\000\002\010\005\000\002\010\005\000\002\010\003\000" +
    "\002\010\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\012\037\007\053\023\062\013\064\014\001" +
    "\002\000\004\002\uffff\001\002\000\026\002\ufffb\030\ufffb" +
    "\031\ufffb\032\ufffb\033\ufffb\034\ufffb\037\ufffb\054\ufffb\057" +
    "\ufffb\061\ufffb\001\002\000\004\002\ufffd\001\002\000\022" +
    "\004\100\005\054\006\052\007\056\010\055\011\053\053" +
    "\023\062\013\001\002\000\026\002\ufff9\030\ufff9\031\ufff9" +
    "\032\ufff9\033\ufff9\034\ufff9\037\ufff9\054\ufff9\057\ufff9\061" +
    "\ufff9\001\002\000\004\002\ufffe\001\002\000\004\061\073" +
    "\001\002\000\010\037\ufff2\060\ufff2\061\ufff2\001\002\000" +
    "\004\061\073\001\002\000\004\002\ufff6\001\002\000\004" +
    "\002\000\001\002\000\004\002\ufff7\001\002\000\026\002" +
    "\ufffc\030\ufffc\031\ufffc\032\ufffc\033\ufffc\034\ufffc\037\ufffc" +
    "\054\ufffc\057\ufffc\061\ufffc\001\002\000\026\002\ufff8\030" +
    "\ufff8\031\ufff8\032\ufff8\033\ufff8\034\ufff8\037\ufff8\054\ufff8" +
    "\057\ufff8\061\ufff8\001\002\000\026\002\ufffa\030\ufffa\031" +
    "\ufffa\032\ufffa\033\ufffa\034\ufffa\037\ufffa\054\ufffa\057\ufffa" +
    "\061\ufffa\001\002\000\012\037\026\062\030\063\033\065" +
    "\032\001\002\000\004\002\025\001\002\000\004\002\001" +
    "\001\002\000\014\005\054\006\052\007\056\010\055\011" +
    "\053\001\002\000\026\002\uffdc\030\uffdc\031\uffdc\032\uffdc" +
    "\033\uffdc\034\uffdc\037\uffdc\054\uffdc\057\uffdc\061\uffdc\001" +
    "\002\000\026\002\uffde\030\uffde\031\uffde\032\uffde\033\uffde" +
    "\034\uffde\037\uffde\054\uffde\057\uffde\061\uffde\001\002\000" +
    "\006\054\047\057\050\001\002\000\026\002\uffdd\030\uffdd" +
    "\031\uffdd\032\uffdd\033\uffdd\034\uffdd\037\uffdd\054\uffdd\057" +
    "\uffdd\061\uffdd\001\002\000\026\002\uffdf\030\uffdf\031\uffdf" +
    "\032\uffdf\033\uffdf\034\uffdf\037\uffdf\054\uffdf\057\uffdf\061" +
    "\uffdf\001\002\000\020\030\035\031\041\032\036\033\037" +
    "\034\040\054\ufff0\057\ufff0\001\002\000\012\037\026\062" +
    "\030\063\033\065\032\001\002\000\012\037\026\062\030" +
    "\063\033\065\032\001\002\000\012\037\026\062\030\063" +
    "\033\065\032\001\002\000\012\037\026\062\030\063\033" +
    "\065\032\001\002\000\012\037\026\062\030\063\033\065" +
    "\032\001\002\000\026\002\uffe1\030\uffe1\031\uffe1\032\036" +
    "\033\037\034\uffe1\037\uffe1\054\uffe1\057\uffe1\061\uffe1\001" +
    "\002\000\026\002\uffe0\030\035\031\041\032\036\033\037" +
    "\034\uffe0\037\uffe0\054\uffe0\057\uffe0\061\uffe0\001\002\000" +
    "\026\002\uffe3\030\uffe3\031\uffe3\032\uffe3\033\uffe3\034\uffe3" +
    "\037\uffe3\054\uffe3\057\uffe3\061\uffe3\001\002\000\026\002" +
    "\uffe4\030\uffe4\031\uffe4\032\uffe4\033\uffe4\034\uffe4\037\uffe4" +
    "\054\uffe4\057\uffe4\061\uffe4\001\002\000\026\002\uffe2\030" +
    "\uffe2\031\uffe2\032\036\033\037\034\uffe2\037\uffe2\054\uffe2" +
    "\057\uffe2\061\uffe2\001\002\000\010\037\ufff3\060\ufff3\061" +
    "\ufff3\001\002\000\012\037\026\062\030\063\033\065\032" +
    "\001\002\000\020\030\035\031\041\032\036\033\037\034" +
    "\040\054\ufff1\057\ufff1\001\002\000\004\037\057\001\002" +
    "\000\006\053\023\062\013\001\002\000\012\037\026\062" +
    "\030\063\033\065\032\001\002\000\006\053\023\062\013" +
    "\001\002\000\004\037\057\001\002\000\004\005\054\001" +
    "\002\000\004\037\061\001\002\000\026\002\uffed\030\uffed" +
    "\031\uffed\032\uffed\033\uffed\034\uffed\037\uffed\054\uffed\057" +
    "\uffed\061\uffed\001\002\000\004\037\063\001\002\000\026" +
    "\002\uffec\030\uffec\031\uffec\032\uffec\033\uffec\034\uffec\037" +
    "\uffec\054\uffec\057\uffec\061\uffec\001\002\000\016\030\035" +
    "\031\041\032\036\033\037\034\040\037\065\001\002\000" +
    "\026\002\uffef\030\uffef\031\uffef\032\uffef\033\uffef\034\uffef" +
    "\037\uffef\054\uffef\057\uffef\061\uffef\001\002\000\004\037" +
    "\067\001\002\000\026\002\uffeb\030\uffeb\031\uffeb\032\uffeb" +
    "\033\uffeb\034\uffeb\037\uffeb\054\uffeb\057\uffeb\061\uffeb\001" +
    "\002\000\004\037\071\001\002\000\026\002\uffee\030\uffee" +
    "\031\uffee\032\uffee\033\uffee\034\uffee\037\uffee\054\uffee\057" +
    "\uffee\061\uffee\001\002\000\006\002\uffe9\061\073\001\002" +
    "\000\012\037\026\062\030\063\033\065\032\001\002\000" +
    "\006\002\uffe6\061\uffe6\001\002\000\020\002\uffe5\030\035" +
    "\031\041\032\036\033\037\034\040\061\uffe5\001\002\000" +
    "\006\002\uffe7\061\uffe7\001\002\000\006\002\uffe8\061\073" +
    "\001\002\000\004\064\105\001\002\000\004\060\102\001" +
    "\002\000\006\053\023\062\013\001\002\000\004\037\104" +
    "\001\002\000\006\002\uffea\037\uffea\001\002\000\004\027" +
    "\106\001\002\000\010\037\107\053\023\062\013\001\002" +
    "\000\006\053\023\062\013\001\002\000\004\037\113\001" +
    "\002\000\004\037\112\001\002\000\004\002\ufff5\001\002" +
    "\000\004\002\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\034\003\023\004\015\005\003\007\011\011" +
    "\020\012\017\013\004\014\021\015\007\016\014\020\016" +
    "\023\005\024\010\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\007\100\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\021\076\022\073\001" +
    "\001\000\002\001\001\000\006\021\071\022\073\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\022" +
    "\006\030\010\033\011\020\012\017\013\004\014\021\015" +
    "\007\024\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\020\010\045\011\020\012\017\013\004\014" +
    "\021\015\007\024\026\001\001\000\020\010\044\011\020" +
    "\012\017\013\004\014\021\015\007\024\026\001\001\000" +
    "\020\010\043\011\020\012\017\013\004\014\021\015\007" +
    "\024\026\001\001\000\020\010\042\011\020\012\017\013" +
    "\004\014\021\015\007\024\026\001\001\000\020\010\041" +
    "\011\020\012\017\013\004\014\021\015\007\024\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\020\010\050\011\020\012\017\013\004\014\021\015\007" +
    "\024\026\001\001\000\002\001\001\000\004\011\067\001" +
    "\001\000\004\007\065\001\001\000\020\010\063\011\020" +
    "\012\017\013\004\014\021\015\007\024\026\001\001\000" +
    "\004\007\061\001\001\000\004\011\057\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\022\075\001\001\000\020\010\074" +
    "\011\020\012\017\013\004\014\021\015\007\024\026\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\022\075\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\102\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\007\110\016\107\001" +
    "\001\000\004\007\100\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SintacticoH$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SintacticoH$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SintacticoH$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




/**Metodo al que se llama automáticamente ante algún error sintactico.*/
public void syntax_error(Symbol s){
System.out.println("Error en la Línea " + (s.right+1) +" Columna "+s.left+ ". Identificador "
+s.value + " no reconocido." );
}

/**Metodo al que se llama en el momento en que ya no es posible una recuperación de
errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
System.out.println("Error Sintactico en la Línea " + (s.right+1)+ "Columna "+s.left+". Identificador " +
s.value + " no reconocido.");
}

public Nodo arbol;


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$SintacticoH$actions {




  private final SintacticoH parser;

  /** Constructor */
  CUP$SintacticoH$actions(SintacticoH parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$SintacticoH$do_action(
    int                        CUP$SintacticoH$act_num,
    java_cup.runtime.lr_parser CUP$SintacticoH$parser,
    java.util.Stack            CUP$SintacticoH$stack,
    int                        CUP$SintacticoH$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SintacticoH$result;

      /* select the action based on the action number */
      switch (CUP$SintacticoH$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // E ::= FUNCIONES 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // E ::= caracter 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // E ::= cadena 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // E ::= numero 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // E ::= E potencia E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // E ::= E division E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // E ::= E por E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // E ::= E menos E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // E ::= E mas E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(6/*E*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // INDICE ::= tindice E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(16/*INDICE*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // LINDICE ::= INDICE 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(15/*LINDICE*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // LINDICE ::= LINDICE INDICE 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(15/*LINDICE*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // INDICES ::= LISTA LINDICE 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(14/*INDICES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // INDICES ::= iden LINDICE 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(14/*INDICES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CONCAT ::= dolar LISTA tconcat LISTA dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(12/*CONCAT*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-4)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // MAX ::= dolar tmax LISTA dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(11/*MAX*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-3)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // MIN ::= dolar tmin LISTA dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(10/*MIN*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-3)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECC ::= dolar tdecremento CALCULAR dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(9/*DECC*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-3)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // SUCC ::= dolar taumento CALCULAR dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(8/*SUCC*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-3)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CALCULAR ::= dolar tcalcular E dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(7/*CALCULAR*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-3)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // LISTAS ::= E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(4/*LISTAS*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // LISTAS ::= LISTAS coma E 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(4/*LISTAS*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LISTA ::= cadena 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(5/*LISTA*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LISTA ::= acorchete LISTAS ccorchete 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(5/*LISTA*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-2)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // DECLISTA ::= dolar tlet iden asignacion CONCAT dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(3/*DECLISTA*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-5)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECLISTA ::= dolar tlet iden asignacion LISTA dolar 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(3/*DECLISTA*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-5)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FUNCIONES2 ::= CONCAT 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(17/*FUNCIONES2*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FUNCIONES2 ::= INDICES 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(17/*FUNCIONES2*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FUNCIONES ::= CALCULAR 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(18/*FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FUNCIONES ::= MAX 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(18/*FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // FUNCIONES ::= MIN 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(18/*FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // FUNCIONES ::= DECC 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(18/*FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // FUNCIONES ::= SUCC 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(18/*FUNCIONES*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= FUNCIONES2 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(2/*CUERPO*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= FUNCIONES 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(2/*CUERPO*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CUERPO ::= DECLISTA 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(2/*CUERPO*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIA ::= CUERPO 
            {
              Nodo RESULT = null;

              CUP$SintacticoH$result = new java_cup.runtime.Symbol(1/*INICIA*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          return CUP$SintacticoH$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIA EOF 
            {
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).right;
		Nodo start_val = (Nodo)((java_cup.runtime.Symbol) CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).value;
		RESULT = start_val;
              CUP$SintacticoH$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-1)).left, ((java_cup.runtime.Symbol)CUP$SintacticoH$stack.elementAt(CUP$SintacticoH$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$SintacticoH$parser.done_parsing();
          return CUP$SintacticoH$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

