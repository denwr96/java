package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.calculator;

public class Demo {

    public static void main(String[] args) {
        MathOperation[] operations = new MathOperation[5];
        operations[0] = new SumOperation();
        operations[1] = new SubstractOperation();
        operations[2] = new DivisionOperation();
        operations[3] = new MultiplyOperations();
        operations[4] = new SumOperation();

        MathOperationExecutor executor = new MathOperationExecutor();

        executor.execute(operations, 6, 3);
    }
}
