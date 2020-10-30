package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_2;

//Task_7
//Task_8
//Task_9


import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
 class StringTask {
    public static void main(String[] args) {
        //Напишите программу в которой создайте переменную
        //типа String и присвойте ей в качестве начального значения
        //ваше имя. Выведете на консоль значение этой переменной.
        String myName = "Kristina";
        System.out.println(myName);
        System.out.println("Hi "+myName+"!");

        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String guestName = input.nextLine();
        System.out.println("Hello "+guestName+"!");
    }
}
