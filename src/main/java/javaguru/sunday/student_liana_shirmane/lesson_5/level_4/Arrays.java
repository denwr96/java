package main.java.javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task25
//task26
//task27
//task28
//task29
//task30

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Разделите на понятные и логические методы")
public class Arrays {

    public static void main(String[] args) {

//task25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength = scanner.nextInt();
        int[] numbersFromUser = new int[arrayLength];
        for (int i = 0; i < numbersFromUser.length; i++) {
            System.out.println("Please enter number");
            numbersFromUser[i] = scanner.nextInt();
        }
        for (int j : numbersFromUser) {
            System.out.println(j);
        }
//task26
        System.out.println("Please enter array length");
        int arrayLength2 = scanner.nextInt();
        Random random = new Random();
        int[] numbersRandom = new int[arrayLength2];
        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = random.nextInt(100);
        }
        for (int j : numbersRandom) {
            System.out.println(j);
        }

//task27
        int[] numbersMax = new int[5];
        Random randomMax = new Random();
        for (int i = 0; i < numbersMax.length; i++) {
            numbersMax[i] = randomMax.nextInt(100);
        }
        for (int j : numbersMax) {
            System.out.println("Numbers for task 27 are " + j);
        }
        int max = numbersMax[0];
        for (int i = 0; i < numbersMax.length; i++) {
            if (numbersMax[i] > max) {
                max = numbersMax[i];
            }
        }
        System.out.println("Max value is: " + max);

//task28
        int[] numbersMin = new int[5];
        Random randomMin = new Random();
        for (int i = 0; i < numbersMin.length; i++) {
            numbersMin[i] = randomMin.nextInt(100);
        }
        for (int j : numbersMin) {
            System.out.println("Numbers for task 28 are " + j);
        }
        int min = numbersMin[0];
        for (int i = 0; i < numbersMin.length; i++) {
            if (numbersMin[i] < min) {
                min = numbersMin[i];
            }
        }
        System.out.println("Min value is: " + min);

//task29
        int[] numbersEven = new int[9];
        Random randomEven = new Random();
        for (int i = 0; i < numbersEven.length; i++) {
            numbersEven[i] = randomEven.nextInt(100);
        }
        for (int j : numbersEven) {
            System.out.println("Numbers for task 29 " + j);
        }
        for (int i = 0; i < numbersEven.length; i++) {
            if (numbersEven[i] % 2 == 0) {
                System.out.println("Even numbers are: " + numbersEven[i]);
            }
        }
//task30
        int[] numbersOdd = new int[9];
        Random randomOdd = new Random();
        for (int i = 0; i < numbersOdd.length; i++) {
            numbersOdd[i] = randomOdd.nextInt(100);
        }
        for (int j : numbersOdd) {
            System.out.println("Numbers for task 30 " + j);
        }
        for (int i = 0; i < numbersOdd.length; i++) {
            if (numbersOdd[i] % 2 != 0) {
                System.out.println("Odd numbers are: " + numbersOdd[i]);
            }
        }

    }

}

