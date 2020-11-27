package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_9.level_1;

// Task 5

public class SafeV2Demo {

    public static void main(String[] args) {
        SafeV2 safeV2 = new SafeV2(1234, 50000);
        safeV2.isLogin(1234);
        safeV2.putMoney(10000);
        safeV2.Info();
        safeV2.getMoney(60000);
        safeV2.Info();
    }
}
