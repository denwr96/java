package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_1_intern.task_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Safe2Demo {

    public static void main(String[] args) {
        Safe2 safe2 = new Safe2(1234,100);
        System.out.println("Money in safe = " + safe2.getMoneyAmount());
        safe2.putMoney(1234,50);
        System.out.println("Money in safe = " + safe2.getMoneyAmount());
        safe2.getMoney(1234,149);
        System.out.println("Money in safe = " + safe2.getMoneyAmount());
    }
}
