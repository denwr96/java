package main.java.javaguru.sunday.student_natalia_kochkina.lesson_5.level_4;

//Task_25

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class NewArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lenght of array = ");
        int length = scanner.nextInt();

        int[] newArray = new int[length];
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("number:");
            newArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
