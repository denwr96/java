package javaguru.sunday.student_natalia_kochkina.lesson_5.level_2;

//Task_11

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class Array2 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number one = ");
        numbers[0] = scanner.nextInt();
        System.out.println("Number two = ");
        numbers[1] = scanner.nextInt();
        System.out.println("Number three = ");
        numbers[2] = scanner.nextInt();

        System.out.println("number1 = " + numbers[0]);
        System.out.println("number2 = " + numbers[1]);
        System.out.println("number3 = " + numbers[2]);
    }
}
