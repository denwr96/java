package javaguru.sunday.student_liana_shirmane.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
@CodeReview(approved = true)
public class ForInfLoopStop {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            if (i == 7)
                break;
        }
    }

}
