package main.java.javaguru.sunday.student_mihails_gutmans.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinNumberinArray {


    public static void main(String[] args) {
        System.out.println("Enter lenght of your array");

        Scanner enterArrayLength = new Scanner(System.in);
        int arrayLength = enterArrayLength.nextInt();

        int [] myArray = new int [arrayLength];

        for (arrayLength =0 ; arrayLength < myArray.length ; arrayLength++){
            Random random = new Random();
            myArray[arrayLength] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(myArray));

        int minNumber = myArray[0];
        for (arrayLength =0 ; arrayLength < myArray.length ; arrayLength++){
            if (minNumber > myArray[arrayLength]){
                minNumber = myArray[arrayLength];
            }
        }
        System.out.println("Min number is " + minNumber);
    }
}

