package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 10
@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}
