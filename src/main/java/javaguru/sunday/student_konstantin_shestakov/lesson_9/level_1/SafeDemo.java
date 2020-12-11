package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 4
@CodeReview(approved = true)
class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pin = 4321;
        safe.moneyAmount = 10000;
    }
}
