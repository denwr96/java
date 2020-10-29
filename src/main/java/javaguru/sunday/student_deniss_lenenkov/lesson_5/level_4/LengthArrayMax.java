package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class LengthArrayMax {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Array length: ");
        int[] number = new int[2];

        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("Array one: " + number[0]);
        System.out.println("Array two: " + number[1]);

       if(number[0] >= number[1]){
           System.out.println("Max array is: " + number[0]);
       }else {
           System.out.println("Max array is: " + number[1]);
       }

    }


}
