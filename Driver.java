import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.*;

public class Driver {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.err.println("Usage: java Driver <input_file.micro>");
            System.exit(1);
        }

        InputStream is;
        try {
            is = new FileInputStream(args[0]);
        } catch (Exception e) {
            System.err.println("Error: Cannot open file " + args[0]);
            return;
        }

        CharStream input = CharStreams.fromStream(is);
        MicroLexer lexer = new MicroLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MicroParser parser = new MicroParser(tokens);
        ParseTree tree = parser.program();

        // ── Step 4: generate IR ───────────────────────────────────────────────
        SymbolTable st4 = new SymbolTable();
        Step4Visitor irVisitor = new Step4Visitor(st4);
        irVisitor.visit(tree);

        // ── Step 5: generate Tiny ─────────────────────────────────────────────
        TinyGenerator tg = new TinyGenerator();
        for (String line : tg.generateTiny(irVisitor.getIRList(), st4)) {
            System.out.println(line);
        }
    }
}