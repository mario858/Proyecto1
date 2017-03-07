/* The following code was generated by JFlex 1.4.3 on 6/03/17 11:20 PM */

package proyecto1_200614833.Analisis;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/03/17 11:20 PM from the specification file
 * <tt>ScannerH.jflex</tt>
 */
public class LexicoH implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int A = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\57\1\2\1\0\2\57\22\0\1\57\1\47\1\1\1\0"+
    "\1\41\1\42\1\44\1\6\1\52\1\53\1\35\1\37\1\56\1\40"+
    "\1\4\1\36\12\3\2\0\1\46\1\34\1\45\2\0\1\14\1\5"+
    "\1\13\1\20\1\11\1\32\1\30\1\31\1\22\2\5\1\10\1\21"+
    "\1\23\1\26\1\25\1\33\1\16\1\17\1\12\1\15\1\27\1\5"+
    "\1\24\2\5\1\50\1\0\1\51\1\0\1\7\1\0\1\14\1\5"+
    "\1\13\1\20\1\11\1\32\1\30\1\31\1\22\2\5\1\10\1\21"+
    "\1\23\1\26\1\25\1\33\1\16\1\17\1\12\1\15\1\27\1\5"+
    "\1\24\2\5\1\54\1\43\1\55\63\0\1\5\21\0\1\5\u1f54\0"+
    "\1\5\udfe7\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\1\13\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\2\1\1\14"+
    "\1\15\1\1\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\2\0\1\4\1\0\16\4\1\25\3\4\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\3\1\0\1\37\1\40\2\4\1\41\3\4\1\42"+
    "\2\4\1\43\3\4\1\44\1\45\1\46\1\4\1\47"+
    "\1\4\1\50\1\4\1\51\1\52\1\4\1\53\1\4"+
    "\1\54\1\55\1\56\1\57\1\60\5\4\1\61\1\4"+
    "\1\62\2\4\1\63\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\u0150"+
    "\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0"+
    "\0\u0300\0\u0330\0\u0360\0\60\0\60\0\u0390\0\60\0\60"+
    "\0\60\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\u04b0\0\u04e0\0\u0510"+
    "\0\u0540\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690"+
    "\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\360"+
    "\0\u0810\0\u0840\0\u0870\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\u04e0\0\u08a0\0\60\0\360"+
    "\0\u08d0\0\u0900\0\360\0\u0930\0\u0960\0\u0990\0\360\0\u09c0"+
    "\0\u09f0\0\360\0\u0a20\0\u0a50\0\u0a80\0\360\0\360\0\360"+
    "\0\u0ab0\0\360\0\u0ae0\0\360\0\u0b10\0\360\0\360\0\u0b40"+
    "\0\360\0\u0b70\0\360\0\360\0\360\0\360\0\360\0\u0ba0"+
    "\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\360\0\u0c90\0\360\0\u0cc0"+
    "\0\u0cf0\0\360\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\2"+
    "\1\10\1\11\1\12\1\13\1\14\1\6\1\15\1\16"+
    "\1\17\1\20\1\21\2\6\1\22\6\6\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\4\60\0\1\46\2\0\55\46\2\0\1\4"+
    "\54\0\1\4\3\0\1\5\1\47\56\0\1\50\1\0"+
    "\1\6\1\0\25\6\31\0\1\51\2\0\24\51\27\0"+
    "\1\50\1\0\1\6\1\0\2\6\1\52\22\6\27\0"+
    "\1\50\1\0\1\6\1\0\1\6\1\53\12\6\1\54"+
    "\10\6\27\0\1\50\1\0\1\6\1\0\22\6\1\55"+
    "\2\6\27\0\1\50\1\0\1\6\1\0\5\6\1\56"+
    "\17\6\27\0\1\50\1\0\1\6\1\0\10\6\1\57"+
    "\14\6\27\0\1\50\1\0\1\6\1\0\2\6\1\60"+
    "\22\6\27\0\1\50\1\0\1\6\1\0\6\6\1\61"+
    "\15\6\1\62\27\0\1\50\1\0\1\6\1\0\2\6"+
    "\1\63\22\6\27\0\1\50\1\0\1\6\1\0\5\6"+
    "\1\64\5\6\1\65\3\6\1\66\5\6\27\0\1\50"+
    "\1\0\1\6\1\0\12\6\1\67\10\6\1\70\1\6"+
    "\27\0\1\50\1\0\1\6\1\0\5\6\1\71\1\6"+
    "\1\72\7\6\1\73\5\6\60\0\1\74\62\0\1\75"+
    "\63\0\1\76\60\0\1\77\47\0\1\100\57\0\1\101"+
    "\57\0\1\102\12\0\1\103\10\0\1\46\2\104\55\46"+
    "\3\0\1\105\57\0\1\50\1\106\1\6\1\0\25\6"+
    "\32\0\1\107\54\0\1\50\1\0\1\6\1\0\3\6"+
    "\1\110\10\6\1\111\10\6\27\0\1\50\1\0\1\6"+
    "\1\0\10\6\1\112\14\6\27\0\1\50\1\0\1\6"+
    "\1\0\11\6\1\113\13\6\27\0\1\50\1\0\1\6"+
    "\1\0\2\6\1\114\22\6\27\0\1\50\1\0\1\6"+
    "\1\0\1\6\1\115\6\6\1\116\14\6\27\0\1\50"+
    "\1\0\1\6\1\0\4\6\1\117\20\6\27\0\1\50"+
    "\1\0\1\6\1\0\20\6\1\120\4\6\27\0\1\50"+
    "\1\0\1\6\1\0\4\6\1\121\5\6\1\122\12\6"+
    "\27\0\1\50\1\0\1\6\1\0\3\6\1\123\21\6"+
    "\27\0\1\50\1\0\1\6\1\0\4\6\1\124\3\6"+
    "\1\125\14\6\27\0\1\50\1\0\1\6\1\0\15\6"+
    "\1\126\7\6\27\0\1\50\1\0\1\6\1\0\14\6"+
    "\1\127\10\6\27\0\1\50\1\0\1\6\1\0\11\6"+
    "\1\130\13\6\27\0\1\50\1\0\1\6\1\0\16\6"+
    "\1\131\6\6\27\0\1\50\1\0\1\6\1\0\7\6"+
    "\1\132\15\6\27\0\1\50\1\0\1\6\1\0\17\6"+
    "\1\133\5\6\27\0\1\50\1\0\1\6\1\0\3\6"+
    "\1\134\21\6\27\0\1\6\57\0\1\50\1\0\1\6"+
    "\1\0\21\6\1\135\3\6\27\0\1\50\1\0\1\6"+
    "\1\0\2\6\1\136\22\6\27\0\1\50\1\0\1\6"+
    "\1\0\14\6\1\137\10\6\27\0\1\50\1\0\1\6"+
    "\1\0\4\6\1\140\20\6\27\0\1\50\1\0\1\6"+
    "\1\0\2\6\1\141\22\6\27\0\1\50\1\0\1\6"+
    "\1\0\2\6\1\142\22\6\27\0\1\50\1\0\1\6"+
    "\1\0\4\6\1\143\20\6\27\0\1\50\1\0\1\6"+
    "\1\0\7\6\1\144\15\6\27\0\1\50\1\0\1\6"+
    "\1\0\4\6\1\145\20\6\27\0\1\50\1\0\1\6"+
    "\1\0\4\6\1\146\20\6\27\0\1\50\1\0\1\6"+
    "\1\0\7\6\1\147\15\6\27\0\1\50\1\0\1\6"+
    "\1\0\11\6\1\150\13\6\27\0\1\50\1\0\1\6"+
    "\1\0\3\6\1\151\21\6\27\0\1\50\1\0\1\6"+
    "\1\0\6\6\1\152\16\6\27\0\1\50\1\0\1\6"+
    "\1\0\7\6\1\153\15\6\27\0\1\50\1\0\1\6"+
    "\1\0\6\6\1\154\16\6\27\0\1\50\1\0\1\6"+
    "\1\0\22\6\1\155\2\6\27\0\1\50\1\0\1\6"+
    "\1\0\1\6\1\156\23\6\27\0\1\50\1\0\1\6"+
    "\1\0\10\6\1\157\14\6\27\0\1\50\1\0\1\6"+
    "\1\0\4\6\1\160\20\6\27\0\1\50\1\0\1\6"+
    "\1\0\5\6\1\161\17\6\27\0\1\50\1\0\1\6"+
    "\1\0\3\6\1\162\21\6\27\0\1\50\1\0\1\6"+
    "\1\0\7\6\1\163\15\6\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3360];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\21\1\2\11\1\1\3\11\5\1\7\11"+
    "\2\0\1\1\1\0\22\1\11\11\1\1\1\0\1\11"+
    "\54\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[115];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicoH(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LexicoH(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { return new Symbol(SimboloH.menor, yychar,yyline, yytext());
          }
        case 53: break;
        case 11: 
          { return new Symbol(SimboloH.ultimo, yychar,yyline, yytext());
          }
        case 54: break;
        case 34: 
          { return new Symbol(SimboloH.tasc, yychar,yyline, yytext());
          }
        case 55: break;
        case 14: 
          { return new Symbol(SimboloH.acorchete, yychar,yyline, yytext());
          }
        case 56: break;
        case 20: 
          { return new Symbol(SimboloH.coma, yychar,yyline, yytext());
          }
        case 57: break;
        case 3: 
          { return new Symbol(SimboloH.numero, yychar,yyline,new String(yytext()));
          }
        case 58: break;
        case 49: 
          { return new Symbol(SimboloH.tlength, yychar,yyline, yytext());
          }
        case 59: break;
        case 16: 
          { return new Symbol(SimboloH.aparentesis, yychar,yyline, yytext());
          }
        case 60: break;
        case 17: 
          { return new Symbol(SimboloH.cparentesis, yychar,yyline, yytext());
          }
        case 61: break;
        case 46: 
          { return new Symbol(SimboloH.tdecremento, yychar,yyline, yytext());
          }
        case 62: break;
        case 8: 
          { return new Symbol(SimboloH.mas, yychar,yyline, yytext());
          }
        case 63: break;
        case 37: 
          { return new Symbol(SimboloH.tmin, yychar,yyline, yytext());
          }
        case 64: break;
        case 35: 
          { return new Symbol(SimboloH.tsum, yychar,yyline, yytext());
          }
        case 65: break;
        case 12: 
          { return new Symbol(SimboloH.mayor, yychar,yyline, yytext());
          }
        case 66: break;
        case 41: 
          { return new Symbol(SimboloH.telse, yychar,yyline, yytext());
          }
        case 67: break;
        case 9: 
          { return new Symbol(SimboloH.menos, yychar,yyline, yytext());
          }
        case 68: break;
        case 23: 
          { return new Symbol(SimboloH.tconcat, yychar,yyline, yytext());
          }
        case 69: break;
        case 52: 
          { return new Symbol(SimboloH.tcalcular, yychar,yyline, yytext());
          }
        case 70: break;
        case 19: 
          { return new Symbol(SimboloH.cllave, yychar,yyline, yytext());
          }
        case 71: break;
        case 15: 
          { return new Symbol(SimboloH.ccorchete, yychar,yyline, yytext());
          }
        case 72: break;
        case 50: 
          { return new Symbol(SimboloH.trevers, yychar,yyline, yytext());
          }
        case 73: break;
        case 47: 
          { return new Symbol(SimboloH.tdesc, yychar,yyline, yytext());
          }
        case 74: break;
        case 43: 
          { return new Symbol(SimboloH.tcase, yychar,yyline, yytext());
          }
        case 75: break;
        case 42: 
          { return new Symbol(SimboloH.tthen, yychar,yyline, yytext());
          }
        case 76: break;
        case 33: 
          { return new Symbol(SimboloH.tend, yychar,yyline, yytext());
          }
        case 77: break;
        case 26: 
          { return new Symbol(SimboloH.mayorigual, yychar,yyline, yytext());
          }
        case 78: break;
        case 32: 
          { return new Symbol(SimboloH.tlet, yychar,yyline, yytext());
          }
        case 79: break;
        case 28: 
          { return new Symbol(SimboloH.noigual, yychar,yyline, yytext());
          }
        case 80: break;
        case 48: 
          { return new Symbol(SimboloH.timpr, yychar,yyline, yytext());
          }
        case 81: break;
        case 18: 
          { return new Symbol(SimboloH.allave, yychar,yyline, yytext());
          }
        case 82: break;
        case 1: 
          { System.out.println("Error lexico: " + yytext() +" Columna "+ yychar+" Fila"+ yyline);
          }
        case 83: break;
        case 7: 
          { return new Symbol(SimboloH.division, yychar,yyline, yytext());
          }
        case 84: break;
        case 21: 
          { return new Symbol(SimboloH.tif, yychar,yyline, yytext());
          }
        case 85: break;
        case 31: 
          { return new Symbol(SimboloH.caracter, yychar,yyline,new String(yytext()));
          }
        case 86: break;
        case 39: 
          { return new Symbol(SimboloH.tpar, yychar,yyline, yytext());
          }
        case 87: break;
        case 5: 
          { return new Symbol(SimboloH.asignacion, yychar,yyline, yytext());
          }
        case 88: break;
        case 30: 
          { return new Symbol(SimboloH.cadena, yychar,yyline,new String(yytext()));
          }
        case 89: break;
        case 10: 
          { return new Symbol(SimboloH.dolar, yychar,yyline, yytext());
          }
        case 90: break;
        case 45: 
          { return new Symbol(SimboloH.radicacion, yychar,yyline, yytext());
          }
        case 91: break;
        case 25: 
          { return new Symbol(SimboloH.and, yychar,yyline, yytext());
          }
        case 92: break;
        case 27: 
          { return new Symbol(SimboloH.menorigual, yychar,yyline, yytext());
          }
        case 93: break;
        case 51: 
          { return new Symbol(SimboloH.tproduct, yychar,yyline, yytext());
          }
        case 94: break;
        case 2: 
          { /* Se ignoran */
          }
        case 95: break;
        case 29: 
          { return new Symbol(SimboloH.tindice, yychar,yyline, yytext());
          }
        case 96: break;
        case 44: 
          { return new Symbol(SimboloH.taumento, yychar,yyline, yytext());
          }
        case 97: break;
        case 4: 
          { return new Symbol(SimboloH.iden, yychar,yyline,new String(yytext()));
          }
        case 98: break;
        case 6: 
          { return new Symbol(SimboloH.por, yychar,yyline, yytext());
          }
        case 99: break;
        case 40: 
          { return new Symbol(SimboloH.potencia, yychar,yyline, yytext());
          }
        case 100: break;
        case 22: 
          { return new Symbol(SimboloH.igualigual, yychar,yyline, yytext());
          }
        case 101: break;
        case 38: 
          { return new Symbol(SimboloH.mod, yychar,yyline, yytext());
          }
        case 102: break;
        case 36: 
          { return new Symbol(SimboloH.tmax, yychar,yyline, yytext());
          }
        case 103: break;
        case 24: 
          { return new Symbol(SimboloH.or, yychar,yyline, yytext());
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(SimboloH.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}