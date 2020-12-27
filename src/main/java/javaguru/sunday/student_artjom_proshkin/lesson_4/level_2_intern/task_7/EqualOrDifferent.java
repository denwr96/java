package javaguru.sunday.student_artjom_proshkin.lesson_4.level_2_intern.task_7;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class EqualOrDifferent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int numberUno = scanner.nextInt();
        System.out.println("Please enter another number");
        int numberDuo = scanner.nextInt();

        if (numberUno == numberDuo){
            System.out.println("Numbers are EQUAL ");
        }  else {
            System.out.println("Numbers are DIFFERENT");
        }
    }
}
