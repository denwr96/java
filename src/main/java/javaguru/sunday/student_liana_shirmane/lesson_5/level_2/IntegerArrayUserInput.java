package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;
//task11
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class IntegerArrayUserInput {

    public static void main(String[] args) {

        int[] numbersFromUser = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbersFromUser.length; i++) {
            System.out.println("Please enter number");
            numbersFromUser[i] = scanner.nextInt();
        }
        System.out.println("First number from user is " + numbersFromUser[0]);
        System.out.println("Second number from user is " + numbersFromUser[1]);
        System.out.println("Third number from user is " + numbersFromUser[2]);
    }
}

