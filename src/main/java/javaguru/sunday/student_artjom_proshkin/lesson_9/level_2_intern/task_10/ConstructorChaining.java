package javaguru.sunday.student_artjom_proshkin.lesson_9.level_2_intern.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName,int parameterCount){
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}
