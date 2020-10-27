package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_29;

import java.util.Random;

class ArrayEvenNumbersOut {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int[] myArray = new int[7];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0)
                System.out.println("Even number in array: " + myArray[i]);
        }
    }
}
