package javaguru.sunday.student_liana_shirmane.lesson_9.level_1;
//task5

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Safe2Demo {

    public static void main(String[] args) {
        Safe2 safe2 = new Safe2(8888, 100);
        safe2.putMoney(8889, 10);
        safe2.getMoney(8888, 20);
        safe2.getBalance();
    }
}

