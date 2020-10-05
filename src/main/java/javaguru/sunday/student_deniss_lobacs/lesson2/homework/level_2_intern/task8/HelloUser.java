package main.java.javaguru.sunday.student_deniss_lobacs.lesson2.homework.level_2_intern.task8;

import java.util.Scanner;

public class HelloUser {

    static Scanner scn=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name=scn.nextLine();

        System.out.println("Hello," +name);
    }
}
