/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package dev.meanmail;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.util.ArrayDeque;
import java.util.Deque;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static dev.meanmail.psi.Types.*;


/**
 * This class is a scanner generated by
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Nginx.flex</tt>
 */
public class NginxLexer implements FlexLexer {

    /**
     * This character denotes the end of file
     */
    public static final int YYEOF = -1;
    /**
     * lexical states
     */
    public static final int YYINITIAL = 0;
    public static final int STRING_STATE = 2;
    public static final int DQSTRING_STATE = 4;
    public static final int INCLUDE_STATE = 6;
    public static final int LUA_BLOCK_STATE = 8;
    public static final int LUA_STATE = 10;
    /* The ZZ_CMAP_Z table has 68 entries */
    static final char ZZ_CMAP_Z[] = zzUnpackCMap(
            "\1\0\103\200");
    /* The ZZ_CMAP_Y table has 256 entries */
    static final char ZZ_CMAP_Y[] = zzUnpackCMap(
            "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");
    /* The ZZ_CMAP_A table has 640 entries */
    static final char ZZ_CMAP_A[] = zzUnpackCMap(
            "\11\0\1\4\1\6\2\13\1\6\22\0\1\4\1\0\1\11\1\10\3\0\1\14\10\0\12\2\1\0\1\7\5" +
                    "\0\32\1\1\0\1\12\2\0\1\3\1\0\1\32\1\30\1\21\1\24\1\25\3\1\1\17\1\1\1\33\1" +
                    "\22\1\1\1\20\1\26\2\1\1\34\1\36\1\27\1\23\1\1\1\35\1\1\1\31\1\1\1\15\1\5\1" +
                    "\16\7\0\1\13\32\0\1\4\337\0\1\4\177\0\13\4\35\0\2\13\5\0\1\4\57\0\1\4\40\0");
    /**
     * initial size of the lookahead buffer
     */
    private static final int ZZ_BUFFERSIZE = 16384;
    /**
     * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
     * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
     * at the beginning of a line
     * l is of the form l = 2*k, k a non negative integer
     */
    private static final int ZZ_LEXSTATE[] = {
            0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5
    };
    private static final String ZZ_ACTION_PACKED_0 =
            "\6\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6" +
                    "\1\7\1\10\4\2\1\11\1\12\1\13\1\14\1\15" +
                    "\1\12\1\16\1\17\1\20\1\21\1\22\1\23\1\0" +
                    "\2\24\4\2\2\0\1\24\20\2\1\25\45\2\1\26" +
                    "\1\2\1\27\1\30";
    /**
     * Translates DFA states to action switch labels.
     */
    private static final int[] ZZ_ACTION = zzUnpackAction();
    private static final String ZZ_ROWMAP_PACKED_0 =
            "\0\0\0\37\0\76\0\135\0\174\0\233\0\272\0\331" +
                    "\0\370\0\u0117\0\u0136\0\u0117\0\u0117\0\272\0\272\0\u0155" +
                    "\0\u0174\0\u0193\0\u01b2\0\u01d1\0\u01f0\0\u0117\0\u020f\0\u0117" +
                    "\0\u022e\0\u024d\0\u0117\0\u0117\0\u0117\0\u026c\0\u0117\0\u028b" +
                    "\0\u0136\0\u0117\0\u02aa\0\u02c9\0\u02e8\0\u0307\0\u01f0\0\u022e" +
                    "\0\u028b\0\u0326\0\u0345\0\u0364\0\u0383\0\u03a2\0\u03c1\0\u03e0" +
                    "\0\u03ff\0\u041e\0\u043d\0\u045c\0\u047b\0\u049a\0\u04b9\0\u04d8" +
                    "\0\u04f7\0\331\0\u0516\0\u0535\0\u0554\0\u0573\0\u0592\0\u05b1" +
                    "\0\u05d0\0\u05ef\0\u060e\0\u062d\0\u064c\0\u066b\0\u068a\0\u06a9" +
                    "\0\u06c8\0\u06e7\0\u0706\0\u0725\0\u0744\0\u0763\0\u0782\0\u07a1" +
                    "\0\u07c0\0\u07df\0\u07fe\0\u081d\0\u083c\0\u085b\0\u087a\0\u0899" +
                    "\0\u08b8\0\u08d7\0\u08f6\0\u0915\0\u0934\0\u0953\0\u0972\0\331" +
                    "\0\u0991\0\331\0\331";
    /**
     * Translates a state to a row index in the transition table
     */
    private static final int[] ZZ_ROWMAP = zzUnpackRowMap();
    private static final String ZZ_TRANS_PACKED_0 =
            "\1\7\1\10\1\7\1\10\1\11\1\7\1\11\1\12" +
                    "\1\13\1\14\1\7\1\11\1\15\1\16\1\17\1\20" +
                    "\1\10\1\21\10\10\1\22\1\10\1\23\2\10\12\24" +
                    "\1\25\1\24\1\26\22\24\11\27\1\30\1\31\24\27" +
                    "\4\32\1\11\1\32\1\11\1\33\3\32\1\11\23\32" +
                    "\4\34\1\11\1\34\1\11\4\34\1\11\1\34\1\35" +
                    "\21\34\16\36\1\37\20\36\4\7\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\23\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\20\10\4\0" +
                    "\1\11\1\0\1\11\4\0\1\11\62\0\4\13\1\40" +
                    "\1\41\1\42\1\40\1\13\1\40\1\13\1\0\1\40" +
                    "\22\13\1\7\3\10\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\1\10\1\43\16\10\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\7\10\1\44\10\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\2\10\1\45\15\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\6\10\1\46\11\10\12\24\1\47\1\24" +
                    "\1\0\30\24\1\0\4\24\1\0\23\24\11\27\1\0" +
                    "\1\50\32\27\1\0\4\27\1\0\23\27\4\32\1\0" +
                    "\1\32\2\0\3\32\1\0\23\32\16\36\1\0\20\36" +
                    "\5\40\1\51\1\42\4\40\1\0\23\40\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\2\10\1\52\15\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\1\10\1\53\16\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\2\10\1\54\15\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\16\10" +
                    "\1\55\1\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\3\10\1\56\14\10\1\7" +
                    "\3\10\1\0\1\7\2\0\1\7\1\0\1\7\2\0" +
                    "\2\7\10\10\1\57\7\10\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\6\10\1\60" +
                    "\11\10\1\7\3\10\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\15\10\1\61\2\10\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\4\10\1\62\13\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\6\10\1\63\11\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\17\10\1\64\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\1\65\17\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\5\10\1\66\12\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\1\10" +
                    "\1\67\16\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\17\10\1\70\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\10\10\1\71\7\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\6\10\1\72\11\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\10\10\1\73\7\10\1\7\2\10\1\74" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\20\10\1\7\3\10\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\6\10\1\75\11\10\1\7\2\10" +
                    "\1\76\1\0\1\7\2\0\1\7\1\0\1\7\2\0" +
                    "\2\7\20\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\11\10\1\77\6\10\1\7" +
                    "\2\10\1\100\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\20\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\11\10\1\101\6\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\12\10\1\102\5\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\11\10" +
                    "\1\103\6\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\12\10\1\104\5\10\1\7" +
                    "\2\10\1\105\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\20\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\12\10\1\106\5\10" +
                    "\1\7\2\10\1\107\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\20\10\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\3\10\1\110" +
                    "\14\10\1\7\2\10\1\111\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\20\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\3\10" +
                    "\1\112\14\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\4\10\1\113\13\10\1\7" +
                    "\3\10\1\0\1\7\2\0\1\7\1\0\1\7\2\0" +
                    "\2\7\3\10\1\114\14\10\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\4\10\1\115" +
                    "\13\10\1\7\3\10\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\13\10\1\116\4\10\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\4\10\1\117\13\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\13\10\1\120\4\10" +
                    "\1\7\2\10\1\121\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\20\10\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\13\10\1\122" +
                    "\4\10\1\7\2\10\1\123\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\20\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\11\10" +
                    "\1\124\6\10\1\7\2\10\1\125\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\20\10\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\11\10\1\126\6\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\3\10\1\127\14\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\11\10\1\130\6\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\3\10" +
                    "\1\131\14\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\7\10\1\132\10\10\1\7" +
                    "\3\10\1\0\1\7\2\0\1\7\1\0\1\7\2\0" +
                    "\2\7\3\10\1\133\14\10\1\7\3\10\1\0\1\7" +
                    "\2\0\1\7\1\0\1\7\2\0\2\7\7\10\1\134" +
                    "\10\10\1\7\3\10\1\0\1\7\2\0\1\7\1\0" +
                    "\1\7\2\0\2\7\2\10\1\135\15\10\1\7\3\10" +
                    "\1\0\1\7\2\0\1\7\1\0\1\7\2\0\2\7" +
                    "\7\10\1\136\10\10\1\7\3\10\1\0\1\7\2\0" +
                    "\1\7\1\0\1\7\2\0\2\7\2\10\1\137\15\10" +
                    "\1\7\3\10\1\0\1\7\2\0\1\7\1\0\1\7" +
                    "\2\0\2\7\14\10\1\140\3\10\1\7\3\10\1\0" +
                    "\1\7\2\0\1\7\1\0\1\7\2\0\2\7\2\10" +
                    "\1\141\15\10\1\7\3\10\1\0\1\7\2\0\1\7" +
                    "\1\0\1\7\2\0\2\7\14\10\1\142\3\10\1\7" +
                    "\3\10\1\0\1\7\2\0\1\7\1\0\1\7\2\0" +
                    "\2\7\14\10\1\143\3\10";
    /**
     * The transition table of the DFA
     */
    private static final int[] ZZ_TRANS = zzUnpackTrans();
    /* error codes */
    private static final int ZZ_UNKNOWN_ERROR = 0;
    private static final int ZZ_NO_MATCH = 1;
    private static final int ZZ_PUSHBACK_2BIG = 2;
    /* error messages for the codes above */
    private static final String[] ZZ_ERROR_MSG = {
            "Unknown internal scanner error",
            "Error: could not match input",
            "Error: pushback value was too large"
    };
    private static final String ZZ_ATTRIBUTE_PACKED_0 =
            "\6\0\3\1\1\11\1\1\2\11\10\1\1\11\1\1" +
                    "\1\11\2\1\3\11\1\1\1\11\1\0\1\1\1\11" +
                    "\4\1\2\0\73\1";
    /**
     * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
     */
    private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();
    Deque<Integer> stack = new ArrayDeque<Integer>();
    /**
     * the input device
     */
    private java.io.Reader zzReader;
    /**
     * the current state of the DFA
     */
    private int zzState;
    /**
     * the current lexical state
     */
    private int zzLexicalState = YYINITIAL;
    /**
     * this buffer contains the current text to be matched and is
     * the source of the yytext() string
     */
    private CharSequence zzBuffer = "";
    /**
     * the textposition at the last accepting state
     */
    private int zzMarkedPos;
    /**
     * the current text position in the buffer
     */
    private int zzCurrentPos;
    /**
     * startRead marks the beginning of the yytext() string in the buffer
     */
    private int zzStartRead;
    /**
     * endRead marks the last character in the buffer, that has been read
     * from input
     */
    private int zzEndRead;
    /**
     * zzAtBOL == true <=> the scanner is currently at the beginning of a line
     */
    private boolean zzAtBOL = true;
    /**
     * zzAtEOF == true <=> the scanner is at the EOF
     */
    private boolean zzAtEOF;
    /**
     * denotes if the user-EOF-code has already been executed
     */
    private boolean zzEOFDone;

    /* user code: */
    public NginxLexer() {
        this((java.io.Reader) null);
    }

    /**
     * Creates a new scanner
     *
     * @param in the java.io.Reader to read input from.
     */
    public NginxLexer(java.io.Reader in) {
        this.zzReader = in;
    }

    /**
     * Translates characters to character classes
     * Chosen bits are [7, 7, 7]
     * Total runtime size is 1928 bytes
     */
    public static int ZZ_CMAP(int ch) {
        return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch >> 14] | ((ch >> 7) & 0x7f)] << 7) | (ch & 0x7f)];
    }

    private static int[] zzUnpackAction() {
        int[] result = new int[99];
        int offset = 0;
        offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAction(String packed, int offset, int[] result) {
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

    private static int[] zzUnpackRowMap() {
        int[] result = new int[99];
        int offset = 0;
        offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackRowMap(String packed, int offset, int[] result) {
        int i = 0;  /* index in packed string  */
        int j = offset;  /* index in unpacked array */
        int l = packed.length();
        while (i < l) {
            int high = packed.charAt(i++) << 16;
            result[j++] = high | packed.charAt(i++);
        }
        return j;
    }

    private static int[] zzUnpackTrans() {
        int[] result = new int[2480];
        int offset = 0;
        offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackTrans(String packed, int offset, int[] result) {
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

    private static int[] zzUnpackAttribute() {
        int[] result = new int[99];
        int offset = 0;
        offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
        return result;
    }

    private static int zzUnpackAttribute(String packed, int offset, int[] result) {
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
     * Unpacks the compressed character translation table.
     *
     * @param packed the packed character translation table
     * @return the unpacked character translation table
     */
    private static char[] zzUnpackCMap(String packed) {
        int size = 0;
        for (int i = 0, length = packed.length(); i < length; i += 2) {
            size += packed.charAt(i);
        }
        char[] map = new char[size];
        int i = 0;  /* index in packed string  */
        int j = 0;  /* index in unpacked array */
        while (i < packed.length()) {
            int count = packed.charAt(i++);
            char value = packed.charAt(i++);
            do map[j++] = value; while (--count > 0);
        }
        return map;
    }

    public final void yypush(int newState) {
        yybegin(newState);
        stack.push(newState);
    }

    public final int yypop() {
        if (stack.size() == 0) {
            yyinitial();
            return YYINITIAL;
        }

        int state = stack.pop();

        if (stack.peek() == null) {
            yyinitial();
        } else {
            yybegin(stack.peek());
        }

        return state;
    }

    public final void yyinitial() {
        stack.clear();
        yypush(YYINITIAL);
    }

    public final int getTokenStart() {
        return zzStartRead;
    }

    public final int getTokenEnd() {
        return getTokenStart() + yylength();
    }

    public void reset(CharSequence buffer, int start, int end, int initialState) {
        zzBuffer = buffer;
        zzCurrentPos = zzMarkedPos = zzStartRead = start;
        zzAtEOF = false;
        zzAtBOL = true;
        zzEndRead = end;
        yybegin(initialState);
    }

    /**
     * Refills the input buffer.
     *
     * @return {@code false}, iff there was new input.
     * @throws java.io.IOException if any I/O-Error occurs
     */
    private boolean zzRefill() throws java.io.IOException {
        return true;
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
    public final CharSequence yytext() {
        return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
    }


    /**
     * Returns the character at position {@code pos} from the
     * matched text.
     * <p>
     * It is equivalent to yytext().charAt(pos), but faster
     *
     * @param pos the position of the character to fetch.
     *            A value from 0 to yylength()-1.
     * @return the character at position pos
     */
    public final char yycharat(int pos) {
        return zzBuffer.charAt(zzStartRead + pos);
    }


    /**
     * Returns the length of the matched text region.
     */
    public final int yylength() {
        return zzMarkedPos - zzStartRead;
    }


    /**
     * Reports an error that occurred while scanning.
     * <p>
     * In a wellformed scanner (no or only correct usage of
     * yypushback(int) and a match-all fallback rule) this method
     * will only be called with things that "Can't Possibly Happen".
     * If this method is called, something is seriously wrong
     * (e.g. a JFlex bug producing a faulty scanner etc.).
     * <p>
     * Usual syntax/scanner level error handling should be done
     * in error fallback rules.
     *
     * @param errorCode the code of the errormessage to display
     */
    private void zzScanError(int errorCode) {
        String message;
        try {
            message = ZZ_ERROR_MSG[errorCode];
        } catch (ArrayIndexOutOfBoundsException e) {
            message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
        }

        throw new Error(message);
    }


    /**
     * Pushes the specified amount of characters back into the input stream.
     * <p>
     * They will be read again by then next call of the scanning method
     *
     * @param number the number of characters to be read again.
     *               This number must not be greater than yylength()!
     */
    public void yypushback(int number) {
        if (number > yylength())
            zzScanError(ZZ_PUSHBACK_2BIG);

        zzMarkedPos -= number;
    }


    /**
     * Contains user EOF-code, which will be executed exactly once,
     * when the end of file is reached
     */
    private void zzDoEOF() {
        if (!zzEOFDone) {
            zzEOFDone = true;

        }
    }


    /**
     * Resumes scanning until the next regular expression is matched,
     * the end of input is encountered or an I/O-Error occurs.
     *
     * @return the next token
     * @throws java.io.IOException if any I/O-Error occurs
     */
    public IElementType advance() throws java.io.IOException {
        int zzInput;
        int zzAction;

        // cached fields:
        int zzCurrentPosL;
        int zzMarkedPosL;
        int zzEndReadL = zzEndRead;
        CharSequence zzBufferL = zzBuffer;

        int[] zzTransL = ZZ_TRANS;
        int[] zzRowMapL = ZZ_ROWMAP;
        int[] zzAttrL = ZZ_ATTRIBUTE;

        while (true) {
            zzMarkedPosL = zzMarkedPos;

            zzAction = -1;

            zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

            zzState = ZZ_LEXSTATE[zzLexicalState];

            // set up zzAction for empty match case:
            int zzAttributes = zzAttrL[zzState];
            if ((zzAttributes & 1) == 1) {
                zzAction = zzState;
            }


            zzForAction:
            {
                while (true) {

                    if (zzCurrentPosL < zzEndReadL) {
                        zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
                        zzCurrentPosL += Character.charCount(zzInput);
                    } else if (zzAtEOF) {
                        zzInput = YYEOF;
                        break zzForAction;
                    } else {
                        // store back cached positions
                        zzCurrentPos = zzCurrentPosL;
                        zzMarkedPos = zzMarkedPosL;
                        boolean eof = zzRefill();
                        // get translated positions and possibly new buffer
                        zzCurrentPosL = zzCurrentPos;
                        zzMarkedPosL = zzMarkedPos;
                        zzBufferL = zzBuffer;
                        zzEndReadL = zzEndRead;
                        if (eof) {
                            zzInput = YYEOF;
                            break zzForAction;
                        } else {
                            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
                            zzCurrentPosL += Character.charCount(zzInput);
                        }
                    }
                    int zzNext = zzTransL[zzRowMapL[zzState] + ZZ_CMAP(zzInput)];
                    if (zzNext == -1) break zzForAction;
                    zzState = zzNext;

                    zzAttributes = zzAttrL[zzState];
                    if ((zzAttributes & 1) == 1) {
                        zzAction = zzState;
                        zzMarkedPosL = zzCurrentPosL;
                        if ((zzAttributes & 8) == 8) break zzForAction;
                    }

                }
            }

            // store back cached position
            zzMarkedPos = zzMarkedPosL;

            if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
                zzAtEOF = true;
                zzDoEOF();
                return null;
            } else {
                switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
                    case 1: {
                        return VALUE;
                    }
                    // fall through
                    case 25:
                        break;
                    case 2: {
                        return IDENTIFIER;
                    }
                    // fall through
                    case 26:
                        break;
                    case 3: {
                        return WHITE_SPACE;
                    }
                    // fall through
                    case 27:
                        break;
                    case 4: {
                        return SEMICOLON;
                    }
                    // fall through
                    case 28:
                        break;
                    case 5: {
                        yypush(DQSTRING_STATE);
                        return DQUOTE;
                    }
                    // fall through
                    case 29:
                        break;
                    case 6: {
                        yypush(STRING_STATE);
                        return QUOTE;
                    }
                    // fall through
                    case 30:
                        break;
                    case 7: {
                        return LBRACE;
                    }
                    // fall through
                    case 31:
                        break;
                    case 8: {
                        return RBRACE;
                    }
                    // fall through
                    case 32:
                        break;
                    case 9: {
                        return STRING;
                    }
                    // fall through
                    case 33:
                        break;
                    case 10: {
                        yyinitial();
                        return BAD_CHARACTER;
                    }
                    // fall through
                    case 34:
                        break;
                    case 11: {
                        yypop();
                        return QUOTE;
                    }
                    // fall through
                    case 35:
                        break;
                    case 12: {
                        return DQSTRING;
                    }
                    // fall through
                    case 36:
                        break;
                    case 13: {
                        yypop();
                        return DQUOTE;
                    }
                    // fall through
                    case 37:
                        break;
                    case 14: {
                        return INCLUDE_TARGET;
                    }
                    // fall through
                    case 38:
                        break;
                    case 15: {
                        yypop();
                        return SEMICOLON;
                    }
                    // fall through
                    case 39:
                        break;
                    case 16: {
                        yypop();
                        return BAD_CHARACTER;
                    }
                    // fall through
                    case 40:
                        break;
                    case 17: {
                        yypush(LUA_STATE);
                        return LBRACE;
                    }
                    // fall through
                    case 41:
                        break;
                    case 18: {
                        return LUA;
                    }
                    // fall through
                    case 42:
                        break;
                    case 19: {
                        yypop();
                        yypop();
                        return RBRACE;
                    }
                    // fall through
                    case 43:
                        break;
                    case 20: {
                        return COMMENT;
                    }
                    // fall through
                    case 44:
                        break;
                    case 21: {
                        yypush(INCLUDE_STATE);
                        return INCLUDE;
                    }
                    // fall through
                    case 45:
                        break;
                    case 22: {
                        yypush(LUA_BLOCK_STATE);
                        return ACCESS_BY_LUA_BLOCK;
                    }
                    // fall through
                    case 46:
                        break;
                    case 23: {
                        yypush(LUA_BLOCK_STATE);
                        return CONTENT_BY_LUA_BLOCK;
                    }
                    // fall through
                    case 47:
                        break;
                    case 24: {
                        yypush(LUA_BLOCK_STATE);
                        return REWRITE_BY_LUA_BLOCK;
                    }
                    // fall through
                    case 48:
                        break;
                    default:
                        zzScanError(ZZ_NO_MATCH);
                }
            }
        }
    }


}
