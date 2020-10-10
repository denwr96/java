package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 3 любх числа");

        System.out.println("Первое: ");
        int numbOne = scan.nextInt();

        System.out.println("Второе: ");
        int numbTwo = scan.nextInt();

        System.out.println("Третье: ");
        int numbThree = scan.nextInt();

        double result = (numbOne + numbTwo + numbThree) / 3;

        System.out.println("Среднее арифмет. = " + result);
    }

}
