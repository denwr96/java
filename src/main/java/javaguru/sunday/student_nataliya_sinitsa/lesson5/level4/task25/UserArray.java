package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson5.level4.task25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class UserArray {

    public static void main(String[] args) {

        System.out.println("Enter your array length:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] userArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter number " + (i+1));
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Your array is: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(userArray[i]);
        }

    }

}
