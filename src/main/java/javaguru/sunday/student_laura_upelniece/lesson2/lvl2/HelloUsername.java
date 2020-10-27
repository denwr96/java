package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl2;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class HelloUsername {

    public static void main(String[] args) {
        //Takes input word
        Scanner input = new Scanner(System.in);
        String username = input.next();

        //Prints output message
        System.out.println("Hello " + username);
    }
}
