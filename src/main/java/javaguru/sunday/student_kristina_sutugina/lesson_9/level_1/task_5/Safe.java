package main.java.javaguru.sunday.student_kristina_sutugina.lesson_9.level_1.task_5;

class Safe {


    public int pinCode;
    public double amountOfMoney;

    public Safe() {
        this.pinCode = 1234;
        this.amountOfMoney = 100;
    }

    public void getMoney(int pin, double withdraw) {
        if (pin == this.pinCode) {
            this.amountOfMoney = this.amountOfMoney - withdraw;
            System.out.println("Your balance is: " + amountOfMoney);
        } else {
            System.out.println("Wong password");
        }
    }

    public void putMoney(int pin, double addMoney) {
        if (pin == this.pinCode) {
            this.amountOfMoney = this.amountOfMoney + addMoney;
            System.out.println("Your balance is: " + amountOfMoney);
        } else {
            System.out.println("Wong password");
        }
    }
}

