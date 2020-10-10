package main.java.javaguru.sunday.student_mihails_gutmans.lesson2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Please enter Your name");
        Scanner nameFromConsole = new Scanner(System.in);
        String yourName = nameFromConsole.nextLine();
        System.out.println("Hello" + yourName);
    }
}
