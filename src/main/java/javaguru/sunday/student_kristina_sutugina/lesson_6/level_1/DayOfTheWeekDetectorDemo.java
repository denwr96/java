package main.java.javaguru.sunday.student_kristina_sutugina.lesson_6.level_1;
//нет codeReview
import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number form 1 till 7: ");
        int dayNumber = scanner.nextInt();
        dayOfTheWeekDetector.detectDayName(dayNumber);
    }
}
