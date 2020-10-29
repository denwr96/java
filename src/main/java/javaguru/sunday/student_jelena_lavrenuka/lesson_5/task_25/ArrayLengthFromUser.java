package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_25;

import java.util.Scanner;

class ArrayLengthFromUser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter array length (integer number) ");
        int[] myArray = new int[myScanner.nextInt()];
        System.out.println("Please enter numbers to fill array ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myScanner.nextInt();
        }
        System.out.println("");

        for (int i = 0; i < myArray.length; i++) {

            System.out.println(myArray[i]);
        }
    }
}

