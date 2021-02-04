package javaguru.sunday.student_liana_shirmane.lesson_8.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import javax.swing.*;

//task7
@CodeReview(approved = true)
@CodeReviewComment(comment = "А чего переменную wings никуда не сохраняете? Можно было создать свойство у класса Pegasus и туда положить значение")
class Pegasus extends Horse {
    public Pegasus (String color, int age, String name, boolean wings) {
        super (color, age, name);
    }
}
