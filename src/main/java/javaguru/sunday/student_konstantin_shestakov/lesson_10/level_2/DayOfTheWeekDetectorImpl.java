package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 4
@CodeReview(approved = true)
class DayOfTheWeekDetectorImpl implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            System.out.println("Monday");
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

    @Override
    public String detectDayNameSwitch(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                System.out.println("Tuesday");
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String detectDayNameArray(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (number >= 1 && number <= 7) {
            System.out.println(weekDays[number - 1]);
            return weekDays[number - 1];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}

