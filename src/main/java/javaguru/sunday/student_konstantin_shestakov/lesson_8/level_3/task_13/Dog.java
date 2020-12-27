package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog extends Animal {

    Dog(String breed) {
        super(breed);
    }

    @Override
    void voice() {
        System.out.println("Woof");
    }
}
