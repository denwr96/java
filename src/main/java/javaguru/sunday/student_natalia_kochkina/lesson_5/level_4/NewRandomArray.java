package javaguru.sunday.student_natalia_kochkina.lesson_5.level_4;

//Task_26

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
public class NewRandomArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Lenght of array = ");
        int length = scanner.nextInt();
        int[] newArray = new int[length];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt();
            System.out.println(newArray[i]);
        }
    }
}
