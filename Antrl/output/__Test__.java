import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        tetsLexer lex = new tetsLexer(new ANTLRFileStream("C:\\Users\\fschaffer\\Antrl\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        tetsParser g = new tetsParser(tokens, 49100, null);
        try {
            g.rule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}