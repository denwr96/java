package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println ("Введите число: ");
        int numbOne = scan.nextInt();

        System.out.println ("Число " + numbOne + " умножено от 1 до 10");

        System.out.println (numbOne * 1);
        System.out.println (numbOne * 2);
        System.out.println (numbOne * 3);
        System.out.println (numbOne * 4);
        System.out.println (numbOne * 5);
        System.out.println (numbOne * 6);
        System.out.println (numbOne * 7);
        System.out.println (numbOne * 8);
        System.out.println (numbOne * 9);
        System.out.println (numbOne * 10);


    /*     Это можно как то сжать в 1 строку?

           Или кождое действие так отдельно прописывать?
     */

    }

}
