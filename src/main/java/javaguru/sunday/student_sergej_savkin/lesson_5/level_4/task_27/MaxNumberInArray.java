package javaguru.sunday.student_sergej_savkin.lesson_5.level_4.task_27;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class MaxNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please enter your array length:");
        int[] userArray = new int[scanner.nextInt()];


        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = random.nextInt(10);
            System.out.println((i + 1) + " number in your array is: " + userArray[i]);
        }

        int maxNumberInArray = userArray[0];

        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i] > maxNumberInArray) {
                maxNumberInArray = userArray[i];
            }
        }
        System.out.println("Max number in array is: " + maxNumberInArray);
    }
}