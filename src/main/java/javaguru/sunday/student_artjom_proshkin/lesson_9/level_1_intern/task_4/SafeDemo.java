package main.java.javaguru.sunday.student_artjom_proshkin.lesson_9.level_1_intern.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(1234,100);
        System.out.println("Money = " + safe.moneyAmount);
        System.out.println("Your PIN = " + safe.pinCode);
    }
}
