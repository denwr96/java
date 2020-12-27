package javaguru.sunday.student_liana_shirmane.lesson_3.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

//task 7
//task 8
//task9
@CodeReview(approved = true)
class Name {
    public static void main(String[] args) {
        String myName = "Liana";
        System.out.println(myName);
        String greeting = "Hi " + myName + "!";
        System.out.println(greeting);
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String greetingUser = "Hi " + userName + "!";
        System.out.println(greetingUser);
    }
}
