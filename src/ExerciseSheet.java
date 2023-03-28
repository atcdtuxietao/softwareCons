public class ExerciseSheet {

    private static final short COLUMN_NUM = 5;//默认打印列数

    public void formattedDisplay(Exercise ex, int columns) {
        int column = 1;
        int count = 1;
        while (ex.hasNext()) {
            if (column > columns) {
                System.out.println();
                column = 1;
            }
            System.out.printf("%3d.  ", count);
            System.out.print((ex.next()).toString() + "\t");
            column++;
            count++;
        }
        System.out.println();
    }

    public void formattedDisplay(Exercise ex) {
        formattedDisplay(ex, COLUMN_NUM);
    }

    public static void main(String[] args) {
        ExerciseSheet sheet = new ExerciseSheet();
        Exercise exerciseAdd1 = new Exercise();
        Exercise exerciseAdd2 = new Exercise();
        Exercise exerciseSub1 = new Exercise();
        Exercise exerciseSub2 = new Exercise();
        Exercise exerciseMix1 = new Exercise();
        Exercise exerciseMix2 = new Exercise();

        exerciseAdd1.generateAdditionExercise(50);
        System.out.println("---- 第一套加法算式习题 ----");
        sheet.formattedDisplay(exerciseAdd1);

        exerciseAdd2.generateAdditionExercise(50);
        System.out.println("---- 第二套加法算式习题 ----");
        sheet.formattedDisplay(exerciseAdd2);

        exerciseSub1.generateSubstractExercise(50);
        System.out.println("---- 第一套减法混合算式习题 ----");
        sheet.formattedDisplay(exerciseSub1);

        System.out.println("---- 第二套减法混合算式习题 ----");
        exerciseSub2.generateSubstractExercise(50);
        sheet.formattedDisplay(exerciseSub2);

        exerciseMix1.generateBinaryExercise(50);
        System.out.println("---- 第一套加减法混合算式习题 ----");
        sheet.formattedDisplay(exerciseMix1, 6);

        System.out.println("---- 第二套加减法混合算式习题 ----");
        exerciseMix2.generateBinaryExercise(50);
        sheet.formattedDisplay(exerciseMix2, 4);
    }
}