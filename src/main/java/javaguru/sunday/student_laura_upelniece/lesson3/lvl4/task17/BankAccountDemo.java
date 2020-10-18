package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl4.task17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
        String firstName = bankAccount.getOwnerFirstName(); //ownerFirstName -> firstName
        String lastName = bankAccount.getOwnerLastName();   //ownerFirstName -> lastName
        int moneyAmount = bankAccount.getMoneyAmount();     //String -> int

        System.out.println("Owner first name = " + firstName); //ownerFirstName -> firstName
        System.out.println("Owner last name = " + lastName);   //ownerFirstName -> lastName
        System.out.println("Money amount = " + moneyAmount);
    }

}