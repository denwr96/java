package main.java.javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}