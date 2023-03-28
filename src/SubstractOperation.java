public class SubstractOperation extends BinaryOperation {
    SubstractOperation() {
        generateBinaryOperation('-');
    }

    @Override
    boolean checkingCalculation(int anInteger) {
        return anInteger <= UPPER && anInteger >= LOWER;
    }

    @Override
    int calculate(int left, int right) {
        return left - right;
    }
}
