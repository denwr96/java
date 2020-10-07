package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson2.level3.task9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int usersNumber = scanner.nextInt();

        System.out.println(usersNumber + " x 1 = " + usersNumber);
        System.out.println(usersNumber + " x 2 = " + usersNumber * 2);
        System.out.println(usersNumber + " x 3 = " + usersNumber * 3);
        System.out.println(usersNumber + " x 4 = " + usersNumber * 4);
        System.out.println(usersNumber + " x 5 = " + usersNumber * 5);
        System.out.println(usersNumber + " x 6 = " + usersNumber * 6);
        System.out.println(usersNumber + " x 7 = " + usersNumber * 7);
        System.out.println(usersNumber + " x 8 = " + usersNumber * 8);
        System.out.println(usersNumber + " x 9 = " + usersNumber * 9);
        System.out.println(usersNumber + " x 10 = " + usersNumber * 10);

    }
}
