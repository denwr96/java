package javaguru.sunday.student_kristina_sutugina.lesson_2.level_2;
//Task_8
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
 class AskName {
    public static void main(String[] args) {
        System.out.println("Please, enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + " !");

    }
}
