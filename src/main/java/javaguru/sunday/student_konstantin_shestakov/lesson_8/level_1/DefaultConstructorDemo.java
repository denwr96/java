package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 1 - 2
@CodeReview(approved = true)
class DefaultConstructorDemo {

    DefaultConstructorDemo() {
        System.out.println("Default constructor");
    }

    public static void main(String[] args) {
        DefaultConstructorDemo demo = new DefaultConstructorDemo();
    }
}
