package javaguru.sunday.student_nataliya_sinitsa.lesson6.level1.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DayOfTheWeekDetector {

    String dayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter order number of day from 1 to 7");
        int number = scanner.nextInt();

//        return switch (number) {
//            case 1 -> "Monday";
//            case 2 -> "Tuesday";
//            case 3 -> "Wednesday";
//            case 4 -> "Thursday";
//            case 5 -> "Friday";
//            case 6 -> "Saturday";
//            case 7 -> "Sunday";
//            default -> "Unknown input. Please input a valid number between 1 and 7";
//        };
        return null;

    }

}
