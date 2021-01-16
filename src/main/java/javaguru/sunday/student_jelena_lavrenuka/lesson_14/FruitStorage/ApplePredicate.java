package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
@FunctionalInterface
interface ApplePredicate {
    boolean test (Apple apple);
}
