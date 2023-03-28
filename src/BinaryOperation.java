import java.util.Random;

public abstract class BinaryOperation {

    static final int UPPER = 100; //上界
    static final int LOWER = 0;   //下界
    private int left_operand = 0;  // 左操作数
    private int right_operand = 0;  // 右操作数
    private char operator;          // 操作符
    private int value;             // 算式的结果

    abstract int calculate(int left, int right);

    abstract boolean checkingCalculation(int anInteger);

    protected void generateBinaryOperation(char anOperator) {
        int left, right, result;
        Random random = new Random();
        do {
            left = random.nextInt(UPPER + 1);
            right = random.nextInt(UPPER + 1);
            result = calculate(left, right);
        } while (!checkingCalculation(result));/*循环直到符合要求*/
        left_operand = left;
        right_operand = right;
        operator = anOperator;
        value = result;
    }


    public int getLefOperand() {
        return left_operand;
    }


    public int getRightOperand() {
        return right_operand;
    }


    public char getOperator() {
        return operator;
    }


    public int getResult() {
        return value;
    }


    public boolean equals(BinaryOperation anOperation) {
        return left_operand == anOperation.getLefOperand() &
                right_operand == anOperation.getRightOperand() &
                operator == anOperation.getOperator();
    }


    public String toString() {
        String str;
        str = String.format("%3d %c %3d ", left_operand, operator, right_operand);

        return str;
    }


    public String asString() {
        return toString() + " = ";
    }


    public String fullString() {
        return toString() + " = " + getResult();
    }

}