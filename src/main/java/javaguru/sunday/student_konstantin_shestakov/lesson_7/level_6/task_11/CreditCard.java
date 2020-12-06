package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_11;


import java.util.Scanner;

class CreditCard {
    public String customerName;
    private long creditCardNumber;
    private int creditCardPin;
    private int loginAttempts = 3;
    private boolean isLogin;
    private double creditCardBalance;
    double creditLimit;

    CreditCard(String customerName, long creditCardNumber, int creditCardPin, double creditCardBalance, double creditLimit) {
        this.customerName = customerName;
        this.creditCardNumber = creditCardNumber;
        this.creditCardPin = creditCardPin;
        this.loginAttempts = loginAttempts;
        this.isLogin = isLogin;
        this.creditCardBalance = creditCardBalance;
        this.creditLimit = creditLimit;
    }

    Scanner scanner = new Scanner(System.in);

    boolean login(int pin) {
        if (loginAttempts == 1) {
            System.out.println("Your account has been blocked");
            isLogin = false;
        }
        if (pin == creditCardPin) {
            loginAttempts = 3;
            isLogin = true;
        }
        if (pin != creditCardPin) {
            loginAttempts--;
            System.out.println("Incorrect PIN, login attempts remain = " + loginAttempts);
            isLogin = false;
        }
        return isLogin;
    }

    double deposit(double deposit) {
        if(isLogin) {
          creditCardBalance += deposit;
          System.out.println("Deposit = " + deposit);
        } else {
            System.out.println("Incorrect login");
        }
        return creditCardBalance;
    }

    double withdrawal(double withdraw) {
        if(isLogin) {

            if (withdraw > (creditCardBalance + creditLimit)) {
                System.out.println("Withdraw = " + withdraw);
                System.out.println("Sorry, your balance is exceeded");
                return creditCardBalance;
            }
            creditCardBalance -= withdraw;
            System.out.println("Withdraw = " + withdraw);
        } else {
            System.out.println("Incorrect login");
        }
        return creditCardBalance;
    }

    void printInfo() {
        System.out.println("----------------");
        System.out.println("Card number: " + creditCardNumber);
        System.out.println("Customer: " + customerName);
        System.out.println("Balance = " + creditCardBalance);
        System.out.println("Credit limit = " + creditLimit);
        System.out.println("----------------");
    }
}
