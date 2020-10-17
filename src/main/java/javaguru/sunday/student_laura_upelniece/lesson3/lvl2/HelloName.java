package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl2;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class HelloName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Creates input scanner
        System.out.println("Enter nickname: "); //Prints string which asks user for a nickname
        String username = input.nextLine();
        System.out.println("Hello " + username + "!"); //Prints greeting with input nickname

    }
}
