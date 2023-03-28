public class AdditionOperation extends BinaryOperation {
    AdditionOperation() {
        generateBinaryOperation('+');
    }

    @Override
    boolean checkingCalculation(int anInteger) {
        return anInteger <= UPPER;
    }

    @Override
    int calculate(int left, int right) {
        return left + right;
    }
/*
    public static void main(String[] args) {
        AdditionOperation add=new AdditionOperation();
        AdditionOperation add2 = null;
        System.out.print(add.equals(add2));
    }*/
}
