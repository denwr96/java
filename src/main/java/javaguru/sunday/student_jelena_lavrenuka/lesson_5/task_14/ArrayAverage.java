package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_14;

import java.util.Random;

class ArrayAverage {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random myRandom = new Random();
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
            sum = sum + myArray[i];
        }
        int average = sum / myArray.length;
        System.out.println(average);
    }
}
