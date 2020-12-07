package main.java.javaguru.sunday.student_natalia_kochkina.lesson_9.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_10
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
