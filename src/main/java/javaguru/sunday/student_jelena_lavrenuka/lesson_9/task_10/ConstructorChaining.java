package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount){
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}
