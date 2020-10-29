package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_2_intern.task_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class NumberMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int numberUno = scanner.nextInt();
        System.out.println("Please enter another number");
        int numberDuo = scanner.nextInt();

        if (numberUno > numberDuo){
            System.out.println("Maximum number is " + numberUno);
        } else if(numberUno < numberDuo){
            System.out.println("Maximum number is " + numberDuo);
        } else {
            System.out.println("Numbers are equal");
        }
    }

}
