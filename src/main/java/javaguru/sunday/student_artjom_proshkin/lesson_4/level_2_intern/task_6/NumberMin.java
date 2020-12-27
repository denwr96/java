package javaguru.sunday.student_artjom_proshkin.lesson_4.level_2_intern.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class NumberMin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int numberUno = scanner.nextInt();
        System.out.println("Please enter another number");
        int numberDuo = scanner.nextInt();

        if (numberUno < numberDuo){
            System.out.println("Minimal number is " + numberUno);
        } else if(numberUno > numberDuo){
            System.out.println("Minimal number is " + numberDuo);
        } else {
            System.out.println("Numbers are equal");
        }
    }

}
