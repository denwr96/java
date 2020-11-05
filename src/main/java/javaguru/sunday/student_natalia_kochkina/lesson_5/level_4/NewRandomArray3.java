package main.java.javaguru.sunday.student_natalia_kochkina.lesson_5.level_4;

//Task_28

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class NewRandomArray3 {

    public static void main(String[] args) {
        int[] newArray = new int[6];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
            System.out.println(newArray[i]);
        }
        int minNumber = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (minNumber > newArray[i]) {
                minNumber = newArray[i];
            }
        }
        System.out.println("Min number = " + minNumber);
    }
}
