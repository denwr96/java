package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level1.task5;


class SafeV2Demo {

    public static void main(String[] args) {
        SafeV2 mySafe = new SafeV2(1234, 0);
        System.out.println("Money amount in safe is: " + mySafe.getMoneyAmount());
        mySafe.putMoney(1234, 1000);
        System.out.println("Money amount in safe is: " + mySafe.getMoneyAmount());
        mySafe.getMoney(1234, 500);
        System.out.println("Money amount in safe is: " + mySafe.getMoneyAmount());
    }

}
