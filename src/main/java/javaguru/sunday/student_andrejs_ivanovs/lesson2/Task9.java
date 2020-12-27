package javaguru.sunday.student_andrejs_ivanovs.lesson2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task9 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int yourNumber = Scan.nextInt();

        System.out.println(yourNumber + " x 1 = " + yourNumber);
        System.out.println(yourNumber + " x 2 = " + (yourNumber * 2));
        System.out.println(yourNumber + " x 3 = " + (yourNumber * 3));
        System.out.println(yourNumber + " x 4 = " + (yourNumber * 4));
        System.out.println(yourNumber + " x 5 = " + (yourNumber * 5));
        System.out.println(yourNumber + " x 6 = " + (yourNumber * 6));
        System.out.println(yourNumber + " x 7 = " + (yourNumber * 7));
        System.out.println(yourNumber + " x 8 = " + (yourNumber * 8));
        System.out.println(yourNumber + " x 9 = " + (yourNumber * 9));
        System.out.println(yourNumber + " x 10 = " + (yourNumber * 10));


    }
}
