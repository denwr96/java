package main.java.javaguru.sunday.student_sergej_savkin.lesson_9.level_1_intern.task_4;

public class StrongboxDemo {
    public static void main(String[] args) {
        Strongbox strongbox = new Strongbox();
        strongbox.pincode = 0000;
        strongbox.moneyAmount = 0;

        System.out.println("New pincode is " + strongbox.getPincode());
        System.out.println("Money amount in strongbox is " + strongbox.getMoneyAmount());

    }
}
