import java.util.LinkedHashMap;

public class SymbolTable {

    public class Scope {

        public String scopeName;
        private LinkedHashMap<String, Symbol> symbols = new LinkedHashMap<>();

        public Scope(String scopeName) {
            this.scopeName = scopeName;
        }

        public void addSymbol(Symbol symbol) {
            symbols.put(symbol.name, symbol);
        }

        public Symbol lookup(String name) {
            return symbols.get(name);
        }

        public void printCurrentScope() {
            System.out.println("<<Scope " + scopeName + ">>");

            for (Symbol symbol : symbols.values()) {
                if (symbol.value != null) {
                    System.out.println("name " + symbol.name +
                            " type " + symbol.type +
                            " value " + symbol.value);
                } else {
                    System.out.println("name " + symbol.name +
                            " type " + symbol.type);
                }
            }
        }
    }

    public LinkedHashMap<String, Scope> scopes = new LinkedHashMap<>();
    private Scope currentScope;

    public void enterScope(String scopeName) {
        currentScope = new Scope(scopeName);
        scopes.put(scopeName, currentScope);
    }

    public void exitScope() {
        currentScope = null;
    }

    public void addSymbol(String name, String type) {
        currentScope.addSymbol(new Symbol(name, type));
    }

    public void addSymbol(String name, String type, String value) {
        currentScope.addSymbol(new Symbol(name, type, value));
    }

    /**
     * Looks up the type of a symbol by searching all scopes in reverse
     * insertion order (most recently entered scope first).
     * Returns null if the symbol is not found in any scope.
     */
    public String getType(String name) {
        // Search scopes from most recent to oldest
        Scope[] scopeArray = scopes.values().toArray(new Scope[0]);
        for (int i = scopeArray.length - 1; i >= 0; i--) {
            Symbol sym = scopeArray[i].lookup(name);
            if (sym != null) {
                return sym.type;
            }
        }
        return null;
    }

    public void printAllScopes() {
        boolean first = true;

        for (Scope scope : scopes.values()) {
            if (!first) {
                System.out.println(); // blank line between scopes
            }
            scope.printCurrentScope();
            first = false;
        }
    }
}
