package javaguru.sunday.student_liana_shirmane.lesson_10.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;
//corrected. Видимо что-то хотела делать и не доделала.
//task6
//A functional interface is an interface that contains only one abstract method.
// They can have only one functionality to exhibit.
@CodeReview(approved = true)
@FunctionalInterface
interface FunctionalInterfaceExample {

    String detectDayName(int number);

}

