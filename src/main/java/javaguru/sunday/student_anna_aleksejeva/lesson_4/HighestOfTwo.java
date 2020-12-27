package javaguru.sunday.student_anna_aleksejeva.lesson_4;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class HighestOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter two integer numbers ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        if
        (numberOne == numberTwo) {
            System.out.println(" Numbers are equal ");
        }
        else if
        (numberOne > numberTwo) {
            System.out.println(" Highest number " + numberOne);
        }
        else {
            System.out.println(" Highest number " + numberTwo);
        }
    }
}
