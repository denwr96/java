package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson9.level1.task4;

class SafeDemo {

    public static void main(String[] args) {
        Safe neighbourSafe = new Safe(1234, 1000000);
        System.out.println("Safe pin code is: " + neighbourSafe.getPinCode() +
                ". Money amount in safe is: " + neighbourSafe.getMoneyAmount());
    }

}
