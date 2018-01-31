package enumtest;

public enum EnumMethod {
    PLUS("+") {
        @Override
        int bind(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        int bind(int a, int b) {
            return a - b;
        }
    };

    final String operation;

    EnumMethod(String operation) {
        this.operation = operation;
    }

    abstract int bind(int a, int b);
}
