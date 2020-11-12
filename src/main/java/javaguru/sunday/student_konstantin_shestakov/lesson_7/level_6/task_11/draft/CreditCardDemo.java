package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_11.draft;

class CreditCardDemo {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("Customer1",1111222233334444L,1234, 0, 1000);
        creditCard.creditLimit = 2000;
        creditCard.login();
    }
}
