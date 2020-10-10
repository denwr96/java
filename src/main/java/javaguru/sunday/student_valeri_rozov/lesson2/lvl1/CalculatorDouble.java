package main.java.javaguru.sunday.student_valeri_rozov.lesson2.lvl1;

import java.util.Scanner;

public class CalculatorDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        double y = scanner.nextDouble();

        double sum = x + y;
        double sub = x - y;
        double multi = x * y;
        double div = x / y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    }
}
