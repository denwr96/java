package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArraySum {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random myRandom = new Random();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
            sum = sum + myArray[i];
        }
        System.out.println("Sum of the numbers is " + sum);
    }
}
