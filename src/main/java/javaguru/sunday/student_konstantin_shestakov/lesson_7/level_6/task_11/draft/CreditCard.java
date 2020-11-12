package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_6.task_11.draft;

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

    boolean login() {
        System.out.println("Please enter PIN: ");
        int pin = scanner.nextInt();

        if (loginAttempts == 1) {
            System.out.println("Your account has been blocked");
            isLogin = false;
        }
        if (pin == creditCardPin) {
            loginAttempts = 3;
            isLogin = true;
            menu();
        }
        if (pin != creditCardPin) {
            loginAttempts--;
            System.out.println("Incorrect PIN, login attempts remain = " + loginAttempts);
            isLogin = false;
            login();
        }
        return isLogin;
    }

    double deposit() {
        if(isLogin) {
            System.out.println("Please enter sum to deposit: ");
            double deposit = scanner.nextDouble();
            creditCardBalance += deposit;
            System.out.println("Your balance = " + creditCardBalance);
            menu();
        } else {
            System.out.println("Incorrect login");
        }
        return creditCardBalance;
    }

    double withdrawal() {
        if(isLogin) {
            System.out.println("Please enter sum to withdraw: ");
            double withdraw = scanner.nextDouble();

            if (withdraw > (creditCardBalance + creditLimit)) {
                System.out.println("Sorry, your balance is exceeded");
                return this.creditCardBalance;
            }
            creditCardBalance -= withdraw;
            System.out.println("Your balance = " + creditCardBalance);
            menu();
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

    void menu() {
        System.out.println("Welcome, " + customerName + "! Please chose an operation:");
        System.out.println("1 - deposit");
        System.out.println("2 - withdrawal");
        System.out.println("3 - check balance");
        System.out.println("4 - exit");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> deposit();
            case 2 -> withdrawal();
            case 3 -> {
                printInfo();
                menu();
            }
            case 4 -> System.out.println("Take care!");
            default -> System.out.println("Unknown input");
        }
    }
}