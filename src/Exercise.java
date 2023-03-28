import java.util.ArrayList;
import java.util.Random;


public class Exercise {
    private ArrayList<BinaryOperation> operationList = new ArrayList<BinaryOperation>();/*存放数组*/
    private int current = 0;/*用于遍历*/

    void generateAdditionExercise(int operationCount) {
        BinaryOperation anOperation;
        while (operationCount > 0) {
            do {
                anOperation = new AdditionOperation();
            } while (operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }


    public void generateSubstractExercise(int operationCount) {
        BinaryOperation anOperation;
        while (operationCount > 0) {
            do {
                anOperation = new SubstractOperation();
            } while (operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }


    public void generateBinaryExercise(int operationCount) {
        BinaryOperation anOperation;
        Random random = new Random();
        while (operationCount > 0) {
            do {
                int opValue = random.nextInt(2);
                if (opValue == 0)
                    anOperation = new AdditionOperation();
                else
                    anOperation = new SubstractOperation();
            } while (operationList.contains(anOperation));
            operationList.add(anOperation);
            operationCount--;
        }
    }


    public boolean hasNext() {
        return current <= operationList.size() - 1;
    }


    public BinaryOperation next() {
        return operationList.get(current++);
    }

}