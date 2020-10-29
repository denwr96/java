package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayLengthNotEven {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Enter array length: ");
        int[] number = new int[3];
        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("Array one: " + number[0]);
        System.out.println("Array one: " + number[1]);
        System.out.println("Array one: " + number[2]);

        if(number[0] % 2 != 0){
            System.out.println(number[0] + " the number is not even");
        }
        if(number[1] % 2 != 0){
            System.out.println(number[1] + " the number is not even");
        }
        if(number[2] % 2 != 0){
            System.out.println(number[2] + " the number is not even");
        }
    }
}
