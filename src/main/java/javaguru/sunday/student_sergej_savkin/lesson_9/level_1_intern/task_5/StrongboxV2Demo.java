package javaguru.sunday.student_sergej_savkin.lesson_9.level_1_intern.task_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StrongboxV2Demo {
    public static void main(String[] args) {
        StongboxV2 stongboxV2 = new StongboxV2(1234, 0);

        stongboxV2.putMoneyAmount(1234, 100);
        System.out.println("Money amount in strongbox is " + stongboxV2.getMoneyAmount());
        stongboxV2.getMoneyFromStrongBox(1234, 50);
        System.out.println("Money amount in strongbox is " + stongboxV2.getMoneyAmount());
        stongboxV2.getMoneyFromStrongBox(0000, 50);
        System.out.println("Money amount in strongbox is " + stongboxV2.getMoneyAmount());
        stongboxV2.getMoneyFromStrongBox(1234, 60);
        System.out.println("Money amount in strongbox is " + stongboxV2.getMoneyAmount());
    }

}
