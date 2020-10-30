package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_30;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayOddNumberOut {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int[] myArray = new int[6];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0)
                System.out.println("Odd number in array " + myArray[i]);
        }
    }
}
