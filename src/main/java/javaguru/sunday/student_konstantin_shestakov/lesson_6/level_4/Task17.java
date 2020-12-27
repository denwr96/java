package javaguru.sunday.student_konstantin_shestakov.lesson_6.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "continue в самом конце цикла можно не писать. Они ничего не делают.")
class Task17 {

    public static void main(String[] args) {
        int i = 1;

        while (i > 0) {
            System.out.println("while loop");

            for ( ; i > 0; i++) {
                System.out.println("for loop");
                continue;
            }
            continue;
        }
    }
}
