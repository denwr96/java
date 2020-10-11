package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_senior;

import java.util.Scanner;

public class Super_task_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 3 любх числа");
// Объясняет что нужно сделать

        System.out.println("Первое: ");
        int numbOne = scan.nextInt();

        System.out.println("Второе: ");
        int numbTwo = scan.nextInt();

        System.out.println("Третье: ");
        int numbThree = scan.nextInt();
/*
   Запрашивает числа

   Что бы потом найти среднее арифметическое
*/
        double result = (numbOne + numbTwo + numbThree) / 3;

        System.out.println("Среднее арифмет. = " + result);
    }

}


