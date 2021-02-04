package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ParentClass {

    protected String name;
    protected int number;

    protected ParentClass(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
