package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl3;
import java.util.Scanner;

public class Average {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Takes three input numbers
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //Calculates result and assign it to variable
        double result = (num1 + num2 + num3) / 3;

        //Prints result
        System.out.println("Average of numbers: " + result);

    }
}
