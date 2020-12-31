package javaguru.sunday.student_jelena_lavrenuka.lesson_9.task_5;

import java.util.Scanner;


class SafeV2 {
    public int pinCode;
    public int moneyAmount;

    public SafeV2(int pinCode, int moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }

    public void getMoney(int pinCode, int moneyToGet) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter pin code");
        int userPinCode = myScanner.nextInt();
        if (userPinCode == pinCode && moneyToGet <= moneyAmount) {
            System.out.println("Please get your money");
        }else{
            System.out.println("Invalid Pin code");
        }
    }

    public void putMoney(int pinCode) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter pin code");
        int userPinCode = myScanner.nextInt();
        if (userPinCode == pinCode) {
            System.out.println("Please put your money");
        }else{
            System.out.println("Invalid Pin code");
        }
    }
}
