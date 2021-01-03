package javaguru.sunday.student_liana_shirmane.lesson_9.level_1;
//task5


public class Safe2 {
    private int pinCode;
    private double money;

    Safe2 (int enteredPinCode, double money){
        this.pinCode = enteredPinCode;
        this.money = money;
    }

    public void getMoney (int enteredPinCode, double amount){
        if (pinCode == enteredPinCode) {
            money = money - amount;
        }  else
            System.out.println("Wrong PIN");
    }

    public void putMoney (int enteredPinCode, double amount){
        if (pinCode == enteredPinCode) {
            money = money + amount;
        }  else
            System.out.println("Wrong PIN");
    }

    public double getBalance() {
        System.out.println(money);
        return money;
    }
}
