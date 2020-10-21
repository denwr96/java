package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class BankAccount {

    public String ownerFirstName;
    public String ownerLastName;
    public int moneyAmount;

    BankAccount(String ownerFirstName,String ownerLastName,int moneyAmount){
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName(){
        return this.ownerFirstName;
    }

    public String getOwnerLastName(){
        return this.ownerLastName;
    }

    public int getMoneyAmount(){
        return this.moneyAmount;
    }
}
