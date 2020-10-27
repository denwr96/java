package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){

        System.out.println("Please enter Your name ");
        Scanner nameFromConsole = new Scanner( System.in);
        String userName = nameFromConsole.nextLine();
        System.out.println("Your name is " + userName);
    }
}
