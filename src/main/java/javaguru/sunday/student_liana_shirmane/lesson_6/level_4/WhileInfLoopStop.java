package javaguru.sunday.student_liana_shirmane.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//task17
@CodeReview(approved = true)
class WhileInfLoopStop {
    public static void main(String args[]) {
        int i = 1;
        while (i > 0) {
            System.out.println(i);
            i++;
            if ( i == 5)
                break;

        }
    }
}