package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;
//Task_2

//нет codeReview
import java.util.Scanner;

class DayOfTheWeekDetector {
    String nameOfDay;

    String detectDayName(int number) {
        Scanner scanner = new Scanner(System.in);
        if (1 <= number && number <= 7) {
            if (number == 1) {
                nameOfDay = "Monday";
                System.out.println("Monday");
            } else if (number == 2) {
                nameOfDay = "Tuesday";
                System.out.println("Tuesday");
            } else if (number == 3) {
                nameOfDay = "Wednesday";
                System.out.println("Wednesday");
            } else if (number == 4) {
                nameOfDay = "Thursday";
                System.out.println("Thursday");
            } else if (number == 5) {
                nameOfDay = "Friday";
                System.out.println("Friday");
            } else if (number == 6) {
                nameOfDay = "Saturday";
                System.out.println("Saturday");
            } else if (number == 7) {
                nameOfDay = "Sunday";
                System.out.println("Sunday");
            }
        } else {
            nameOfDay ="Wrong";
            System.out.println("Wrong number. Enter a number from 1 till 7: ");
            number = scanner.nextInt();
            detectDayName(number);
        }

        return nameOfDay;
    }
}
