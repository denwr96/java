package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_6.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class IsEven {
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEvenNew(int number) {
        return number % 2 == 0;
    }
}