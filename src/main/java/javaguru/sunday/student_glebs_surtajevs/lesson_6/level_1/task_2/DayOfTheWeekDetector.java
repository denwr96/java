package javaguru.sunday.student_glebs_surtajevs.lesson_6.level_1.task_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetector {

    public String detect(int number) {

        if (number == 1) {
            return ("Monday");
        } else if (number == 2) {
            return ("Tuesday");
        } else if (number == 3) {
            return ("Wednesday");
        } else if (number == 4) {
            return ("Thursday");
        } else if (number == 5) {
            return ("Friday");
        } else if (number == 6) {
            return ("Saturday");
        } else if (number == 7) {
            return ("Sunday");
        } else {
            return ("Please input a valid number between 1 and 7");
        }
    }
}
