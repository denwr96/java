package main.java.javaguru.sunday.teacher.lesson_5.lessoncode;

import java.util.Scanner;

public class WorkingWithArraysExampleV2 {

    public static void main(String[] args) {
        WorkingWithArraysExampleV2 example = new WorkingWithArraysExampleV2();
//        example.calculateSum();
//        example.calculateNumbers();
        example.findMax();
    }

    public void calculateSum() {
        int[] myArray = {56, 12, -5, 43, 18};

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum: " + sum);
    }

    public void findMax() {
        int[] array = {12, -5, 43, 56, 18};

        int max = array[0]; // max = 12
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max value is: " + max);
    }

    public void calculateNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type starting point:");
        int start = scanner.nextInt();
        System.out.println("Stop Condition");
        int stopCondition = scanner.nextInt();
        for (int i = start; i <= stopCondition; i++) {
            System.out.println(i);
        }
    }

    public void example() {
        int length = 350;
        for (int i = 0; i < 5; i++) {
            //call test with length
            length+= 100;
        }
    }
}
