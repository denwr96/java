package javaguru.sunday.student_artjoms_bocarovs.lesson_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task_26 {

    public static void main(String[] args) {

        System.out.println("Enter your array length:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] userArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Random random = new Random();
            userArray[i] = random.nextInt();
        }

        System.out.println("Your array is: ");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(userArray[i]);
        }

    }
}
