package javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Тут скобок не хватает в цикла. Так должно быть?")
class WhileDefinition2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
        }
        i++;
    }
}

