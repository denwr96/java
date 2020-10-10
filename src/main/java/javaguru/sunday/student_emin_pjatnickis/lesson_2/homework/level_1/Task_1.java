package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_1;


import java.util.Scanner;

public class Task_1 {

    public static void main (String[] args){


            Scanner scan = new Scanner (System.in);

            System.out.println ("Введите первое число: ");
            int numbOne = scan.nextInt();

            System.out.println ("Введите второе число: ");
            int numbTwo = scan.nextInt();

            int adt = numbOne + numbTwo;
            int sub = numbOne - numbTwo;
            double div = numbOne / numbTwo;
            int mult = numbOne * numbTwo;

            System.out.println("Результат сложения = " + adt);
            System.out.println("Результат вычитания = " + sub);
            System.out.println("Результат деления = " + div);
            System.out.println("Результат умножения = " + mult);


    }
}