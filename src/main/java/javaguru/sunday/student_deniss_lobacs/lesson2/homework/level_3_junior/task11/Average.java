package main.java.javaguru.sunday.student_deniss_lobacs.lesson2.homework.level_3_junior.task11;

import java.util.Scanner;

public class Average {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter First number= ");
        double firstNumber=scn.nextDouble();

        System.out.print("Enter Second number= ");
        double secondNumber=scn.nextDouble();

        System.out.print("Enter Third number= ");
        double thirdNumber=scn.nextDouble();


        double result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Result= "+result );

    }

}
