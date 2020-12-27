package javaguru.sunday.student_sergej_savkin.lesson_10.level_3_junior.task_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Swimming like a fish");
    }
}
