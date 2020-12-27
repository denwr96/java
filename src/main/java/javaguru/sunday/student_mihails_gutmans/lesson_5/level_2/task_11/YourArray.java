package javaguru.sunday.student_mihails_gutmans.lesson_5.level_2.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class YourArray {
    public static void main(String[] args) {
        int[] number = new int[3];

        System.out.println("Enter first number ");
        Scanner myNumber  = new Scanner(System.in);
        number[0]  = myNumber.nextInt();
        System.out.println("Enter second number ");
        number[1]  = myNumber.nextInt();
        System.out.println("Enter third number ");
        number[2]  = myNumber.nextInt();

        System.out.println( number[0] +" "+ number[1] +" "+number[2]);
    }
}
