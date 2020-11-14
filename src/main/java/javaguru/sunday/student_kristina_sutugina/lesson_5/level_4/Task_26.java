package main.java.javaguru.sunday.student_kristina_sutugina.lesson_5.level_4;
//Task_26
//Task_27
//Task_28
//Task_29
//Task_30

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array's length: ");
        int lengthFromUSer = scanner.nextInt();
        int[] array = new int[lengthFromUSer];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
            System.out.println(array[i]);
        }
        maxNumber(array);
        minNumber(array);
        isEven(array);
        notEven(array);
    }


    public static void maxNumber(int[] array) {
        int x = 0;
        int maxNumber = array[x];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        System.out.println("Maximal number: " + maxNumber);
    }

    public static void minNumber(int[] array) {
        int x = 0;
        int minNumber = array[x];
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        System.out.println("Minimal number: " + minNumber);
    }

    public static void isEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Even number: " + array[i]);
            }
        }
    }

    public static void notEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Not even number: " + array[i]);
            }
        }
    }
}
