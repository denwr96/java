package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_4.task_17;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount firstBankAccount = new BankAccount("Viktor", "Savonin", 460);
        String ownerFirstName = firstBankAccount.getOwnerFirstName();
        String ownerLastName = firstBankAccount.getOwnerLastName();
        int moneyAmount = firstBankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
