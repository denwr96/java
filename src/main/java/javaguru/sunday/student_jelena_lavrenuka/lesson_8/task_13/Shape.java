package javaguru.sunday.student_jelena_lavrenuka.lesson_8.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName){this.shapeName = shapeName;}

    abstract void shapeArea();
}
