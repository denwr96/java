package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import java.util.Random;

public class ArrayLengthEven {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Array Length: ");
        int[] number = new int[3];
        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("Array one: " + number[0]);
        System.out.println("Array two: " + number[1]);
        System.out.println("Array three: " + number[2]);

        if (number[0] % 2 == 0){
            System.out.println(number[0] + " is even");
        }else{
            System.out.println(number[0] + " not even");
        }
        if (number[1] % 2 == 0){
            System.out.println(number[1] + " is even");
        }else{
            System.out.println(number[1] + " not even");
        }
        if (number[2] % 2 == 0){
            System.out.println(number[2] + " is even");
        }else{
            System.out.println(number[2] + " not even");
        }
    }
}
