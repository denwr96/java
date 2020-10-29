package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_4.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Переменная vawelenght написана без использования camelCase")
public class LightColorDetector {
    String detect(int vawelenght){
        if(vawelenght >= 380 && vawelenght <= 449){
            return "Violet";
        }else if (vawelenght >= 450 && vawelenght <= 494){
            return "Blue";
        }else if (vawelenght >= 495 && vawelenght <= 569){
            return "Green";
        }else if (vawelenght >= 570 && vawelenght <= 589){
            return "Yellow";
        }else if (vawelenght >= 590 && vawelenght <= 619){
            return "Orange";
        }else if (vawelenght >= 620 && vawelenght <= 750){
            return "Red";
        }else {
            return "Invisible Light";
        }
    }
}
