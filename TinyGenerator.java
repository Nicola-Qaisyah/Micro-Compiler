import java.util.*;

public class TinyGenerator {

    private final List<String> tinyCode = new ArrayList<>();
    private int regCount = 0;

    private String newRegister() {
        return "r" + (++regCount);
    }

    public List<String> generateTiny(List<String> ir, SymbolTable symbolTable) {


        Set<String> seen      = new LinkedHashSet<>();
        List<String> varDecls = new ArrayList<>();
        List<String> strDecls = new ArrayList<>();
        Map<String, String> varTypes = new HashMap<>();


        Set<String> irNames = new LinkedHashSet<>();
        for (String instr : ir) {
            String[] parts = instr.trim().split("\\s+");
            for (int i = 1; i < parts.length; i++) {
                String tok = parts[i];
                if (!tok.matches("L\\d+") && !tok.startsWith("$T")
                        && !tok.matches("-?\\d+(\\.\\d+)?")) {
                    irNames.add(tok);
                }
            }
        }

        // Walk all scopes, look up each name to get its Symbol
        for (SymbolTable.Scope scope : symbolTable.scopes.values()) {
            for (String name : irNames) {
                Symbol sym = scope.lookup(name);
                if (sym != null && !seen.contains(sym.name)) {
                    seen.add(sym.name);
                    if ("STRING".equals(sym.type)) {
                        strDecls.add("str " + sym.name + " " + sym.value);
                    } else if ("INT".equals(sym.type) || "FLOAT".equals(sym.type)) {
                        varDecls.add("var " + sym.name);
                        varTypes.put(sym.name, sym.type);
                    }
                }
            }
        }


        Collections.sort(varDecls);
        Collections.sort(strDecls);
        tinyCode.addAll(strDecls);
        tinyCode.addAll(varDecls);

        Map<String, String> tempToReg = new HashMap<>();

        for (String instr : ir) {
            String[] parts = instr.trim().split("\\s+");
            if (parts.length == 0) continue;
            String op = parts[0];

            switch (op) {

                case "LABEL":
                    tinyCode.add("label " + parts[1]);
                    break;

                case "JUMP":
                    tinyCode.add("jmp " + parts[1]);
                    break;

                case "READI":
                    tinyCode.add("sys readi " + parts[1]);
                    break;

                case "READF":
                    tinyCode.add("sys readr " + parts[1]);
                    break;

                case "WRITEI":
                    tinyCode.add("sys writei " + resolve(parts[1], tempToReg));
                    break;

                case "WRITEF":
                    tinyCode.add("sys writer " + resolve(parts[1], tempToReg));
                    break;

                case "WRITES":
                    tinyCode.add("sys writes " + parts[1]);
                    break;

                case "STOREI":
                case "STOREF": {
                    String src = resolve(parts[1], tempToReg);
                    String dst = parts[2];
                    tinyCode.add("move " + src + " " + dst);
                    break;
                }

                case "RETURN": {
                    String val = resolve(parts[1], tempToReg);
                    tinyCode.add("move " + val + " r0");
                    break;
                }

                case "ADDI": case "ADDF":
                case "SUBI": case "SUBF":
                case "MULTI": case "MULTF":
                case "DIVI": case "DIVF": {
                    String left  = resolve(parts[1], tempToReg);
                    String right = resolve(parts[2], tempToReg);
                    String dest  = parts[3];
                    String r = newRegister();
                    tinyCode.add("move " + left + " " + r);
                    tinyCode.add(toTinyOp(op) + " " + right + " " + r);
                    tempToReg.put(dest, r);
                    break;
                }

                case "GT": case "GE": case "LT": case "LE": case "EQ": case "NE": {
                    String left  = resolve(parts[1], tempToReg);
                    String right = resolve(parts[2], tempToReg);
                    String label = parts[3];
                    boolean useFloat = isFloatOperand(parts[1], varTypes)
                                    || isFloatOperand(parts[2], varTypes);
                    String cmpOp = useFloat ? "cmpr" : "cmpi";
                    String rRight = newRegister();
                    tinyCode.add("move " + right + " " + rRight);
                    tinyCode.add(cmpOp + " " + left + " " + rRight);
                    tinyCode.add(toBranch(op) + " " + label);
                    break;
                }

                default:
                    break;
            }
        }

        return tinyCode;
    }

    private String resolve(String operand, Map<String, String> tempToReg) {
        return tempToReg.getOrDefault(operand, operand);
    }

    private boolean isFloatOperand(String operand, Map<String, String> varTypes) {
        if (operand.matches("-?\\d+\\.\\d+")) return true;
        return "FLOAT".equals(varTypes.get(operand));
    }

    private String toTinyOp(String op) {
        return switch (op) {
            case "ADDI"  -> "addi";
            case "ADDF"  -> "addr";
            case "SUBI"  -> "subi";
            case "SUBF"  -> "subr";
            case "MULTI" -> "muli";
            case "MULTF" -> "mulr";
            case "DIVI"  -> "divi";
            case "DIVF"  -> "divr";
            default      -> op.toLowerCase();
        };
    }

    private String toBranch(String op) {
        return switch (op) {
            case "GT" -> "jgt";
            case "GE" -> "jge";
            case "LT" -> "jlt";
            case "LE" -> "jle";
            case "EQ" -> "jeq";
            case "NE" -> "jne";
            default   -> "jmp";
        };
    }
}