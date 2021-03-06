/* The following code was generated by JFlex 1.4.1 on 19/12/19 22:46 */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 19/12/19 22:46 from the specification file
 * <tt>C:/Users/PC/Desktop/PECs/PL1/ArquitecturaPLI-2019-2020/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\2\5\1\7\1\0\1\5\1\10\22\0\1\5\1\0\1\11"+
    "\1\6\4\0\1\36\1\37\1\47\1\46\1\43\1\0\1\42\1\0"+
    "\1\1\11\3\1\45\1\44\1\50\1\51\3\0\1\16\1\12\1\20"+
    "\1\27\1\15\1\31\1\34\1\2\1\21\2\2\1\14\1\24\1\17"+
    "\1\13\1\33\1\2\1\22\1\26\1\23\1\32\1\30\2\2\1\35"+
    "\1\25\1\40\1\0\1\41\1\0\1\4\1\0\1\16\1\12\1\20"+
    "\1\27\1\15\1\31\1\34\1\2\1\21\2\2\1\14\1\24\1\17"+
    "\1\13\1\33\1\2\1\22\1\26\1\23\1\32\1\30\2\2\1\35"+
    "\1\25\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\2\1\4\2\1\12\3"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\3\0\1\22\1\3"+
    "\1\23\1\3\1\24\3\3\1\25\1\3\1\26\7\3"+
    "\1\27\1\30\1\4\13\3\1\31\1\3\1\32\13\3"+
    "\1\33\6\3\1\34\11\3\1\35\4\3\1\36\5\3"+
    "\1\37\3\3\1\40\2\3\1\41\14\3\1\42\2\3"+
    "\1\43\1\44\1\45\1\3\1\46\1\3\1\47\2\3"+
    "\1\50\2\3\1\51\1\3\1\52\4\3\1\53\1\3"+
    "\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[153];
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
    "\0\0\0\52\0\52\0\124\0\176\0\250\0\322\0\374"+
    "\0\u0126\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c"+
    "\0\u0276\0\u02a0\0\124\0\52\0\52\0\52\0\52\0\u02ca"+
    "\0\52\0\52\0\52\0\52\0\52\0\52\0\u02f4\0\322"+
    "\0\u031e\0\374\0\52\0\u0348\0\u0372\0\u039c\0\124\0\u03c6"+
    "\0\u03f0\0\u041a\0\u0444\0\u046e\0\u0498\0\u04c2\0\u04ec\0\u0516"+
    "\0\u0540\0\u056a\0\u0594\0\u05be\0\52\0\52\0\52\0\u05e8"+
    "\0\u0612\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\u0738"+
    "\0\u0762\0\u078c\0\u07b6\0\u07e0\0\124\0\u080a\0\u0834\0\u085e"+
    "\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\u095a\0\u0984\0\u09ae"+
    "\0\124\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa\0\124"+
    "\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0\0\u0bfa"+
    "\0\u0c24\0\124\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc\0\124\0\u0cf6"+
    "\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\124\0\u0dc8\0\u0df2\0\u0e1c"+
    "\0\124\0\u0e46\0\u0e70\0\124\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18"+
    "\0\u0f42\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\u1068"+
    "\0\124\0\u1092\0\u10bc\0\124\0\124\0\124\0\u10e6\0\124"+
    "\0\u1110\0\124\0\u113a\0\u1164\0\124\0\u118e\0\u11b8\0\124"+
    "\0\u11e2\0\124\0\u120c\0\u1236\0\u1260\0\u128a\0\124\0\u12b4"+
    "\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[153];
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
    "\1\2\1\3\1\4\1\5\1\4\1\6\1\7\2\6"+
    "\1\10\1\11\2\4\1\12\1\4\1\13\1\14\2\4"+
    "\1\15\2\4\1\16\1\17\1\20\1\21\1\4\1\22"+
    "\1\4\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\53\0\3\4"+
    "\6\0\24\4\15\0\1\3\1\0\1\5\53\0\1\6"+
    "\1\0\2\6\41\0\7\40\1\0\1\41\41\40\11\42"+
    "\1\43\40\42\1\0\3\4\6\0\1\4\1\44\22\4"+
    "\15\0\3\4\6\0\5\4\1\45\6\4\1\46\7\4"+
    "\15\0\3\4\6\0\1\4\1\47\22\4\15\0\3\4"+
    "\6\0\1\4\1\50\5\4\1\51\14\4\15\0\3\4"+
    "\6\0\7\4\1\52\14\4\15\0\3\4\6\0\7\4"+
    "\1\53\10\4\1\54\3\4\15\0\3\4\6\0\3\4"+
    "\1\55\20\4\15\0\3\4\6\0\3\4\1\56\1\57"+
    "\17\4\15\0\3\4\6\0\4\4\1\60\2\4\1\61"+
    "\10\4\1\62\3\4\15\0\3\4\6\0\4\4\1\63"+
    "\3\4\1\64\13\4\56\0\1\65\60\0\1\66\7\40"+
    "\1\67\1\41\41\40\1\0\3\4\6\0\1\4\1\70"+
    "\22\4\15\0\3\4\6\0\11\4\1\71\12\4\15\0"+
    "\3\4\6\0\6\4\1\72\15\4\15\0\3\4\6\0"+
    "\5\4\1\73\4\4\1\74\11\4\15\0\3\4\6\0"+
    "\3\4\1\75\20\4\15\0\3\4\6\0\21\4\1\76"+
    "\2\4\15\0\3\4\6\0\5\4\1\77\16\4\15\0"+
    "\3\4\6\0\1\100\23\4\15\0\3\4\6\0\16\4"+
    "\1\101\5\4\15\0\3\4\6\0\6\4\1\102\15\4"+
    "\15\0\3\4\6\0\10\4\1\103\13\4\15\0\3\4"+
    "\6\0\2\4\1\104\21\4\15\0\3\4\6\0\5\4"+
    "\1\105\16\4\15\0\3\4\6\0\5\4\1\106\16\4"+
    "\15\0\3\4\6\0\10\4\1\107\13\4\15\0\3\4"+
    "\6\0\1\4\1\110\22\4\15\0\3\4\6\0\2\4"+
    "\1\111\21\4\15\0\3\4\6\0\1\4\1\112\1\4"+
    "\1\113\20\4\15\0\3\4\6\0\10\4\1\114\13\4"+
    "\15\0\3\4\6\0\14\4\1\115\7\4\15\0\3\4"+
    "\6\0\7\4\1\116\14\4\15\0\3\4\6\0\10\4"+
    "\1\117\13\4\15\0\3\4\6\0\1\4\1\120\22\4"+
    "\15\0\3\4\6\0\1\4\1\121\22\4\15\0\3\4"+
    "\6\0\21\4\1\122\2\4\15\0\3\4\6\0\1\4"+
    "\1\123\22\4\15\0\3\4\6\0\11\4\1\124\12\4"+
    "\15\0\3\4\6\0\7\4\1\125\14\4\15\0\3\4"+
    "\6\0\14\4\1\126\7\4\15\0\3\4\6\0\6\4"+
    "\1\127\15\4\15\0\3\4\6\0\4\4\1\130\17\4"+
    "\15\0\3\4\6\0\6\4\1\131\13\4\1\132\1\4"+
    "\15\0\3\4\6\0\3\4\1\133\20\4\15\0\3\4"+
    "\6\0\5\4\1\134\16\4\15\0\3\4\6\0\10\4"+
    "\1\135\13\4\15\0\3\4\6\0\7\4\1\136\14\4"+
    "\15\0\3\4\6\0\11\4\1\137\12\4\15\0\3\4"+
    "\6\0\3\4\1\140\20\4\15\0\3\4\6\0\11\4"+
    "\1\141\12\4\15\0\3\4\6\0\14\4\1\142\7\4"+
    "\15\0\3\4\6\0\10\4\1\143\13\4\15\0\3\4"+
    "\6\0\2\4\1\144\21\4\15\0\3\4\6\0\1\4"+
    "\1\145\22\4\15\0\3\4\6\0\4\4\1\146\17\4"+
    "\15\0\3\4\6\0\1\4\1\147\22\4\15\0\3\4"+
    "\6\0\7\4\1\150\14\4\15\0\3\4\6\0\3\4"+
    "\1\151\20\4\15\0\3\4\6\0\10\4\1\152\13\4"+
    "\15\0\3\4\6\0\4\4\1\153\17\4\15\0\3\4"+
    "\6\0\6\4\1\154\15\4\15\0\3\4\6\0\1\4"+
    "\1\155\22\4\15\0\3\4\6\0\1\156\23\4\15\0"+
    "\3\4\6\0\4\4\1\157\17\4\15\0\3\4\6\0"+
    "\5\4\1\160\16\4\15\0\3\4\6\0\1\4\1\161"+
    "\22\4\15\0\3\4\6\0\1\4\1\162\22\4\15\0"+
    "\3\4\6\0\16\4\1\163\5\4\15\0\3\4\6\0"+
    "\10\4\1\164\13\4\15\0\3\4\6\0\1\165\23\4"+
    "\15\0\3\4\6\0\1\4\1\166\22\4\15\0\3\4"+
    "\6\0\15\4\1\167\6\4\15\0\3\4\6\0\4\4"+
    "\1\170\17\4\15\0\3\4\6\0\5\4\1\171\16\4"+
    "\15\0\3\4\6\0\3\4\1\172\20\4\15\0\3\4"+
    "\6\0\7\4\1\173\14\4\15\0\3\4\6\0\5\4"+
    "\1\174\16\4\15\0\3\4\6\0\13\4\1\175\10\4"+
    "\15\0\3\4\6\0\22\4\1\176\1\4\15\0\3\4"+
    "\6\0\3\4\1\177\20\4\15\0\3\4\6\0\2\4"+
    "\1\200\21\4\15\0\3\4\6\0\5\4\1\201\16\4"+
    "\15\0\3\4\6\0\7\4\1\202\14\4\15\0\3\4"+
    "\6\0\12\4\1\203\11\4\15\0\3\4\6\0\1\4"+
    "\1\204\22\4\15\0\3\4\6\0\14\4\1\205\7\4"+
    "\15\0\3\4\6\0\10\4\1\206\13\4\15\0\3\4"+
    "\6\0\11\4\1\207\12\4\15\0\3\4\6\0\1\4"+
    "\1\210\22\4\15\0\3\4\6\0\10\4\1\211\13\4"+
    "\15\0\3\4\6\0\10\4\1\212\13\4\15\0\3\4"+
    "\6\0\3\4\1\213\20\4\15\0\3\4\6\0\12\4"+
    "\1\214\11\4\15\0\3\4\6\0\4\4\1\215\17\4"+
    "\15\0\3\4\6\0\3\4\1\216\20\4\15\0\3\4"+
    "\6\0\4\4\1\217\17\4\15\0\3\4\6\0\14\4"+
    "\1\220\7\4\15\0\3\4\6\0\7\4\1\221\14\4"+
    "\15\0\3\4\6\0\14\4\1\222\7\4\15\0\3\4"+
    "\6\0\12\4\1\223\11\4\15\0\3\4\6\0\3\4"+
    "\1\224\20\4\15\0\3\4\6\0\4\4\1\225\17\4"+
    "\15\0\3\4\6\0\5\4\1\226\16\4\15\0\3\4"+
    "\6\0\14\4\1\227\7\4\15\0\3\4\6\0\11\4"+
    "\1\230\12\4\15\0\3\4\6\0\1\4\1\231\22\4"+
    "\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4830];
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
    "\1\0\2\11\20\1\4\11\1\1\6\11\1\1\3\0"+
    "\1\11\21\1\3\11\142\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[153];
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

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int commentCount = 0;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
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
    while (i < 164) {
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
      zzPushbackPos-= zzStartRead;
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

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
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
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
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
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
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
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
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
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
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
  
      zzState = zzLexicalState;


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
        case 35: 
          { Token token =   new Token (sym.BOOLEANO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 45: break;
        case 10: 
          { Token token =   new Token (sym.PUNTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 46: break;
        case 22: 
          { Token token =   new Token (sym.DE);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 47: break;
        case 8: 
          { Token token =   new Token (sym.CORIZQ);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 48: break;
        case 26: 
          { Token token =   new Token (sym.FIN);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 49: break;
        case 43: 
          { Token token =   new Token (sym.SUBPROGRAMAS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 50: break;
        case 36: 
          { Token token =   new Token (sym.ENTONCES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 51: break;
        case 28: 
          { Token token =   new Token (sym.PARA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 52: break;
        case 9: 
          { Token token =   new Token (sym.CORDER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 53: break;
        case 38: 
          { Token token =   new Token (sym.COMIENZO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 54: break;
        case 11: 
          { Token token =   new Token (sym.COMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 55: break;
        case 3: 
          { Token token =   new Token (sym.IDENTIFICADOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 56: break;
        case 16: 
          { Token token =   new Token (sym.MENOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 57: break;
        case 20: 
          { Token token =   new Token (sym.NO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 58: break;
        case 12: 
          { Token token =   new Token (sym.PUNTOYCOMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 59: break;
        case 19: 
          { Token token =   new Token (sym.EN);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 60: break;
        case 17: 
          { Token token =   new Token (sym.ASIGNACION);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 61: break;
        case 42: 
          { Token token =   new Token (sym.CONSTANTES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 62: break;
        case 29: 
          { Token token =   new Token (sym.TIPOS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 63: break;
        case 23: 
          { Token token =   new Token (sym.RANGO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 64: break;
        case 5: 
          { Token token =   new Token (sym.Y);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 65: break;
        case 31: 
          { Token token =   new Token (sym.ENTERO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 66: break;
        case 13: 
          { Token token =   new Token (sym.DOSPUNTOS);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 67: break;
        case 30: 
          { Token token =   new Token (sym.FALSO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 68: break;
        case 6: 
          { Token token =   new Token (sym.PARIZQ);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 69: break;
        case 1: 
          { LexicalError error = new LexicalError ();
						error.setLine (yyline + 1);
						error.setColumn (yycolumn + 1);
						error.setLexema (yytext ());
						lexicalErrorManager.lexicalError (error);
          }
        case 70: break;
        case 15: 
          { Token token =   new Token (sym.PRODUCTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 71: break;
        case 25: 
          { Token token =   new Token (sym.VAR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 72: break;
        case 7: 
          { Token token =   new Token (sym.PARDER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 73: break;
        case 33: 
          { Token token =   new Token (sym.VECTOR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 74: break;
        case 41: 
          { Token token =   new Token (sym.VARIABLES);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 75: break;
        case 39: 
          { Token token =   new Token (sym.DEVOLVER);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 76: break;
        case 27: 
          { Token token =   new Token (sym.SINO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 77: break;
        case 37: 
          { Token token =   new Token (sym.ESCRIBIR);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 78: break;
        case 14: 
          { Token token =   new Token (sym.SUMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 79: break;
        case 21: 
          { Token token =   new Token (sym.SI);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 80: break;
        case 44: 
          { Token token =   new Token (sym.PROCEDIMIENTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 81: break;
        case 32: 
          { Token token =   new Token (sym.CIERTO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 82: break;
        case 40: 
          { Token token =   new Token (sym.PROGRAMA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 83: break;
        case 24: 
          { Token token =   new Token (sym.IGUAL);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 84: break;
        case 2: 
          { Token token =   new Token (sym.NUMERO);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 85: break;
        case 34: 
          { Token token =   new Token (sym.FUNCION);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 86: break;
        case 18: 
          { Token token =   new Token (sym.CADENA);
						token.setLine   (yyline + 1);
						token.setColumn (yycolumn + 1);
						token.setLexema (yytext ());
						return token;
          }
        case 87: break;
        case 4: 
          { 
          }
        case 88: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
