package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_1.task_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {
        SafeDemo safeDemo = new SafeDemo();
        safeDemo.changePin();
        Safe safe = new Safe();
        double newAmountOfMoney = safe.amountOfMoney;
        System.out.println(newAmountOfMoney);
        double newAmountOfMoney2 = safeDemo.withdraw(newAmountOfMoney, 110);
        System.out.println(newAmountOfMoney2);
        double newAmountOfMoney3 = safeDemo.withdraw(newAmountOfMoney, 90);
        System.out.println(newAmountOfMoney3);
    }

    public void changePin() {
        Safe safe = new Safe();
        System.out.println("Original pin: " + safe.pinCode);
        safe.pinCode = 123;
        System.out.println("New pin: " + safe.pinCode);
    }

    public double withdraw(double money, double withdraw) {
        if (money > 0 && money > withdraw) {
            money = money - withdraw;
            return money;
        } else {
            System.out.println("Not enough funds");
        }
        return money;
    }
}
