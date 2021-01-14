package javaguru.sunday.student_liana_shirmane.lesson_9.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//task4
@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode = 5678; //change pin
        safe.amount = 1000; //get money and change amount

    }
}
