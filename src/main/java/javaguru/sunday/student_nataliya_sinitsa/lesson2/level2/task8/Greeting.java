package javaguru.sunday.student_nataliya_sinitsa.lesson2.level2.task8;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Greeting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, please");
        String userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }
}
