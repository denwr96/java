package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3;

public class BankAccount {

    public String ownerFirstName;
    public String ownerLastName;
    public String moneyAmount;

    BankAccount(String ownerFirstName,String ownerLastName,String moneyAmount){
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

    public String getMoneyAmount(){
        return this.moneyAmount;
    }
}
