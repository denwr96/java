package main.java.javaguru.sunday.student_natalia_kochkina.lesson_10.level_2;

//Task_4

public class DayOfWeekDetectorArray implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] dayOfWeekArray = new String[8];
        dayOfWeekArray[1] = "Monday";
        dayOfWeekArray[2] = "Tuesday";
        dayOfWeekArray[3] = "Wednesday";
        dayOfWeekArray[4] = "Thursday";
        dayOfWeekArray[5] = "Friday";
        dayOfWeekArray[6] = "Saturday";
        dayOfWeekArray[7] = "Sunday";
        if ((number > 0) && (number < 8)) {
            return dayOfWeekArray[number];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
