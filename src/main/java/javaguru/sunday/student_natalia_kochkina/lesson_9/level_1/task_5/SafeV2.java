package main.java.javaguru.sunday.student_natalia_kochkina.lesson_9.level_1.task_5;

//Task_5

public class SafeV2 {
    private int amountOfMoney;
    private int pin;

    public SafeV2(int amountOfMoney, int pin) {
        this.amountOfMoney = amountOfMoney;
        this.pin = pin;
    }

    public void getMoney(int usersPin, int moneyToGet) {
        if (usersPin == pin) {
            if (moneyToGet <= amountOfMoney) {
                amountOfMoney = amountOfMoney - moneyToGet;
            }
        }
    }

    public void putMoney(int usersPin, int moneyToPut) {
        if (usersPin == pin) {
            amountOfMoney = amountOfMoney + moneyToPut;
        }
    }

    public void moneyInSafe(int usersPin) {
        if (usersPin == pin) {
            System.out.println("Your balance = " + amountOfMoney);
        } else {
            System.out.println("PIN is wrong");
        }
    }
}