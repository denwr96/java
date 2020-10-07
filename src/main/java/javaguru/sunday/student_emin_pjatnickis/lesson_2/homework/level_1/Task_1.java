package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_1;


import java.util.Scanner;

public class Task_1 {

    public static void main (String[] args){


            Scanner scan = new Scanner (System.in);

            System.out.println ("Введите первое число: ");
            double numbOne = scan.nextInt();

            System.out.println ("Введите второе число: ");
            double numbTwo = scan.nextInt();

            double adt = numbOne + numbTwo;
            double sub = numbOne - numbTwo;
            double div = numbOne / numbTwo;
            double mult = numbOne * numbTwo;

            System.out.println("Результат сложения = " + adt);
            System.out.println("Результат вычитания = " + sub);
            System.out.println("Результат деления = " + div);
            System.out.println("Результат умножения = " + mult);


    }
}