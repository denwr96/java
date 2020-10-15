package main.java.javaguru.sunday.student_artjoms_bocarovs.lesson_2;

import java.util.Scanner;

public class Task_9_Multiplication_Table {

    public static void main(String args[]) {
        int n, c;
        System.out.print("Enter any number, to print it's multiplication table: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        System.out.println(" ");
        System.out.println("Multiplication table of: " + n);

        for (c = 1; c <= 10; c++)
            System.out.println(n + "*" + c + " = " + (n * c));

    }
}
