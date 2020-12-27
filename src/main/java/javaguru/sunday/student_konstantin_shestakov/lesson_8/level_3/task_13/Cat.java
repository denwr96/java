package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Cat extends Animal {

    public Cat(String breed) {
        super(breed);
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }
}
