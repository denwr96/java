package javaguru.sunday.student_konstantin_shestakov.lesson_12.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 25
@CodeReview(approved = true)
class StackOverflowErrorExample {

    public static void main(String[] args) {
        StackOverflowErrorExample demo = new StackOverflowErrorExample();
        demo.createObject();
    }

    void createObject() {
        StackOverflowErrorExample stackOverflowErrorExample = new StackOverflowErrorExample();
        createObject();
    }
}
