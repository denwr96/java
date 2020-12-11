package main.java.javaguru.sunday.student_natalia_kochkina.lesson_9.level_1.task_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//Task_5
@CodeReview(approved = true)
public class SafeV2Demo {
    public static void main(String[] args) {

        SafeV2 safeV2 = new SafeV2(50, 4444);

        safeV2.getMoney(4444, 20);
        safeV2.moneyInSafe(4444);
        safeV2.putMoney(1234, 10);
        safeV2.moneyInSafe(4444);
    }
}
