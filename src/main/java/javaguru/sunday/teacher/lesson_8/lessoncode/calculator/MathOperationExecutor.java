package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.calculator;

public class MathOperationExecutor {

    public void execute(MathOperation[] mathOperations, double argOne, double argTwo) {
        for (MathOperation mathOperation : mathOperations) {
            double result = mathOperation.calculate(argOne, argTwo);
            System.out.println(result);
        }
    }
}
