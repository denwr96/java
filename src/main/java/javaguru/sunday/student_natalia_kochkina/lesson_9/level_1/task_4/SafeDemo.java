package main.java.javaguru.sunday.student_natalia_kochkina.lesson_9.level_1.task_4;

//Task_4

public class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe();
        safe.amountOfMoney = 4;
        System.out.println(safe.amountOfMoney);

        safe.pin = 1111;
        System.out.println(safe.pin);
    }
}
