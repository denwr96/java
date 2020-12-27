package javaguru.sunday.student_kristina_sutugina.lesson_9.level_2.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName,int parameterCount) {
        this(constructorName);
        this.constructorName = constructorName;
    }

}
