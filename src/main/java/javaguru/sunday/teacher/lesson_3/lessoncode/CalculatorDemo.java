package main.java.javaguru.sunday.teacher.lesson_3.lessoncode;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int sumResult = myCalculator.sum(5, 2);
        int subResult = myCalculator.sub(5, 2);
        int mulResult = myCalculator.mult(5, 2);
        double divResult = myCalculator.div(5, 2);
        System.out.println(sumResult);
        System.out.println(subResult);
        System.out.println(mulResult);
        System.out.println(divResult);

        double materResult = sumResult + subResult + mulResult + divResult;
        System.out.println("Mater result = " + materResult);


    }
}
