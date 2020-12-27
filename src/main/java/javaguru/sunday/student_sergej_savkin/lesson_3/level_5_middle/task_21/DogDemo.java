package javaguru.sunday.student_sergej_savkin.lesson_3.level_5_middle.task_21;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharky", 5, "black");
        dog.voice();
    }
}
