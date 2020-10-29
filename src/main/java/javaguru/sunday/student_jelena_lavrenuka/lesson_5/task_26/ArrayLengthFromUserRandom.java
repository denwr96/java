package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_26;

import java.util.Random;
import java.util.Scanner;

class ArrayLengthFromUserRandom {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        System.out.println("Please enter array length (integer number) ");
        int[] myArray = new int[myScanner.nextInt()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
        System.out.println("");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
