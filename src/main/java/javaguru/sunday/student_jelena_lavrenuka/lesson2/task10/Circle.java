package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson2.task10;

import java.util.Scanner;

public class Circle {
    public static void main(String[] agrs){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input a number: ");
        double Number = Scanner.nextDouble();

        byte one = 2;

        double perimetr = one * Math.PI * Number;
        double area = Math.PI * Math.pow(one, Number);

        System.out.println("Radius is " + Number);
        System.out.println("Perimeter is " + perimetr);
        System.out.println("Area is " + area);
    }
}
