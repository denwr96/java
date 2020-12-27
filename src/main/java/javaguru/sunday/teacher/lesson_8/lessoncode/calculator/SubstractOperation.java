package javaguru.sunday.teacher.lesson_8.lessoncode.calculator;

public class SubstractOperation implements MathOperation{

    @Override
    public double calculate(double argOne, double argTwo) {
        return argOne - argTwo;
    }
}
