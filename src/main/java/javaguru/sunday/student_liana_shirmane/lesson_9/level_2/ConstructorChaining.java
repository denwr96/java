package javaguru.sunday.student_liana_shirmane.lesson_9.level_2;
//task10

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining (String constructorName, int parameterCount){
        this("firstOne");

    }
}
