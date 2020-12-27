package javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrauyLenghtMin {
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

        if(number[0] < number[1] && number[0] < number[2]){
            System.out.println("Min array is: " + number[0]);
        }else if (number[1] < number[0] && number[1] < number[2]){
            System.out.println("Min array is: " + number[1]);
        }else{
            System.out.println("Min array is: " + number[2]);
        }

    }
}
