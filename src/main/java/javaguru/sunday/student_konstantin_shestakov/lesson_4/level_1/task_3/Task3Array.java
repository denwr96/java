package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_1.task_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task3Array {

    public static void main(String[] args) {

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int loop = 3;

        while (loop > 0) {
            loop--;

        System.out.println("Enter integer (from 1 to 7): ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

            if (userInput >= 1 && userInput <= 7) {

                String yourDay = weekDays[userInput - 1];
                System.out.println(yourDay);
                break;
            }
            else if (loop > 0) {
                System.out.println("Please, chose integer from 1 to 7");
            }
            else {
                System.out.println("Program terminated");
            }

        }
    }
}