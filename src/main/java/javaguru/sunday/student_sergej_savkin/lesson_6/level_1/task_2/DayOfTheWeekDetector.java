package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_1.task_2;

class DayOfTheWeekDetector {

    String weekDay;

    String detectDayName(int firstNumber){
        if ((firstNumber >=1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> weekDay = "Monday";
                case 2 -> weekDay = "Tuesday";
                case 3 -> weekDay = "Wednesday";
                case 4 -> weekDay = "Thursday";
                case 5 -> weekDay = "Friday";
                case 6 -> weekDay = "Saturday";
                case 7 -> weekDay = "Sunday";
            }
        }
        else {
            weekDay = "Please input a valid number between 1 and 7";
        }
        return weekDay;
    }
}
