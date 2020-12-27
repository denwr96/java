package javaguru.sunday.student_deniss_lenenkov.lesson_6.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetector {

    String detectDayName(int numberOfDay){
        if(numberOfDay == 1){
            return "Monday";
        }else if(numberOfDay == 2){
            return "Tuesday";
        }else if(numberOfDay == 3){
            return "Wednesday";
        }else if(numberOfDay == 4){
            return "Thursday";
        }else if(numberOfDay == 5){
            return "Friday";
        }else if(numberOfDay == 6){
            return "Saturday";
        }else if(numberOfDay == 7){
            return "Sunday";
        }else{
            return "Incorrect number";
        }
    }
}
