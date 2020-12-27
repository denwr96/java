package javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_8;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class HelloUser {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Please enter your Login: ");

        String Login = scanner.nextLine();

        System.out.println("Hello " + Login);

    }
}
