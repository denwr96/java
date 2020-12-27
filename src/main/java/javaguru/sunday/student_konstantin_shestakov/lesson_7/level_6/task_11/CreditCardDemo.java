package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_11;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 0, 1000);
        creditCard.creditLimit = 2000;
        creditCard.login(1234);
        creditCard.deposit(1000);
        creditCard.printInfo();
        creditCard.withdrawal(2000);
        creditCard.printInfo();
        creditCard.deposit(100);
        creditCard.printInfo();
        creditCard.withdrawal(2000);
        creditCard.printInfo();
    }
}
