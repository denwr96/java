package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_1.task2;

public class DayOfTheWeekDetector {

    public static String detectDayName(int number) {

       if (number == 1) {
           return "Monday";
       } else if (number == 2) {
           return "Tuesday";
       } else if (number == 3) {
           return "Wednesday";
       } else if (number == 4) {
           return "Thursday";
       } else if (number == 5) {
           return "Friday";
       } else if (number == 6) {
           return "Saturday";
       } else if (number == 7) {
           return "Sunday";
       } else {
           return "Please input a valid number between 1 and 7";
       }
    }
}
