package javaguru.sunday.student_laura_upelniece.lesson3.lvl4.task17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String firstName,   //ownerFirstName -> firstName
                String lastName,    //ownerLastName -> lastName
                int money) {        //moneyAmount -> money
        this.ownerFirstName = firstName;
        this.ownerLastName = lastName;
        this.moneyAmount = money;   //money -> moneyAmount
    }

    String getOwnerFirstName() {
        return this.ownerFirstName; // +";", +")"
    }

    String getOwnerLastName() {
        return this.ownerLastName; // +";", +"("
    }

    int getMoneyAmount() {
        return this.moneyAmount;  // void -> int
    }

}