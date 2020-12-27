package javaguru.sunday.student_emin_pjatnickis.lesson_2.homework.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println ("Как вас зовут? ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);

    }


}
