package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
        else {
            System.out.println("Please input a valid number between 1 and 7");
        }
    }
}
