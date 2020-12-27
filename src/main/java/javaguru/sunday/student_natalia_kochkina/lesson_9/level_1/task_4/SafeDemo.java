package javaguru.sunday.student_natalia_kochkina.lesson_9.level_1.task_4;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_4
@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe();
        safe.amountOfMoney = 4;
        System.out.println(safe.amountOfMoney);

        safe.pin = 1111;
        System.out.println(safe.pin);
    }
}
