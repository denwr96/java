package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_6;
//Task_11
class CreditCardDemo {
  public static void main(String[] args) {
    CreditCard creditCard = new CreditCard(123, 123456);
    CreditCard creditCard2 = new CreditCard(123, 123456, 5);
    creditCard2.withdraw(123456, 3);
    creditCard2.withdraw(123456, 1);
    creditCard2.deposit(123456, 3);
    creditCard2.deposit(123456, 3);
    creditCard2.deposit(123456, 3);
    creditCard2.withdraw(123456, 4);
    creditCard2.withdraw(123456, 4);
    creditCard2.withdraw(123456, 1);
    creditCard2.withdraw(123456, 1);
    creditCard2.withdraw(123456, 1);
    creditCard2.changeLimit(123456, 10);
    creditCard2.withdraw(123456, 2);
  }
}
