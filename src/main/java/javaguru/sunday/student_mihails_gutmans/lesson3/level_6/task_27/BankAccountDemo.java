package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_6.task_27;

public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        int moneyAmount = bankAccount.getMoney(); // izmenil tip na int
        System.out.println("Owner = " + ownerFirstName); // izmenil mazvanije peremennoj
        System.out.println("Money = " + moneyAmount); // izmenil nazvnaije peremennoj
    }
}
