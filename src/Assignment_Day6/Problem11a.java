public class CalculatorTest {
    // Interface for both enum versions
    interface Operation {
        double eval(double a, double b);
    }

    // Version 1: Using switch statement
    enum OperationSwitch implements Operation {
        PLUS, MINUS, TIMES, DIVIDE;
        
        @Override
        public double eval(double a, double b) {
            switch(this) {
                case PLUS: return a + b;
                case MINUS: return a - b;
                case TIMES: return a * b;
                case DIVIDE: 
                    if (b == 0) throw new ArithmeticException("Division by zero");
                    return a / b;
                default: throw new UnsupportedOperationException();
            }
        }
    }

    // Version 2: Using constant-specific method overrides
    enum OperationOverride implements Operation {
        PLUS {
            @Override public double eval(double a, double b) { return a + b; }
        },
        MINUS {
            @Override public double eval(double a, double b) { return a - b; }
        },
        TIMES {
            @Override public double eval(double a, double b) { return a * b; }
        },
        DIVIDE {
            @Override public double eval(double a, double b) {
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            }
        };
    }

    public static void main(String[] args) {
        // Test switch version
        System.out.println("=== Switch Version ===");
        testOperations(OperationSwitch.values());
        
        // Test override version
        System.out.println("\n=== Override Version ===");
        testOperations(OperationOverride.values());
        
        // Test division by zero
        System.out.println("\n=== Division by Zero Test ===");
        try {
            OperationSwitch.DIVIDE.eval(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
    
    static void testOperations(Operation[] ops) {
        double a = 10, b = 5;
        for (Operation op : ops) {
            try {
                System.out.printf("%-6s %.1f and %.1f = %.1f%n",
                    op, a, b, op.eval(a, b));
            } catch (ArithmeticException e) {
                System.out.println(op + " error: " + e.getMessage());
            }
        }
    }
}