package main.java.javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_2;

//Task_9

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class MyName_Scan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Как вас зовут?");
        String name = scan.nextLine();

        System.out.println("Hello " + name);


    }

}
