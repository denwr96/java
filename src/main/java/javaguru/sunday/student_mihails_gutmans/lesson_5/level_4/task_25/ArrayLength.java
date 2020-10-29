package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLength {

    public static void main(String[] args) {

        System.out.println("Enter lenght of your array");

        Scanner enterArrayLength = new Scanner(System.in);
        int arrayLength = enterArrayLength.nextInt();

        int [] myArray = new int [arrayLength];

        for (arrayLength =0 ; arrayLength < myArray.length ; arrayLength++){
            Scanner enterNumber = new Scanner(System.in);
            int yourNumber = enterNumber.nextInt();
            myArray [arrayLength] = yourNumber;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
