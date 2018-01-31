package enumtest;

public enum  EnumInterface implements Operator{
    PLUS("+"){
        @Override
        public int bind(int a, int b) {
            return 0;
        }
    },
    SUB("-"){
        @Override
        public int bind(int a, int b) {
            return 0;
        }
    };
    final String operation;

    EnumInterface(String operation) {
        this.operation = operation;
    }

    public static void main(String[] args) {

        EnumInterface.PLUS.bind(1,2);
    }
}
