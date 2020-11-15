package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.inheritance;

public class MobilePhoneDemo {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Nokia 3310", true);

        System.out.println(mobilePhone.toString());

        SmartPhone smartPhone = new SmartPhone("Samsung S20", false, "Android", true);
        smartPhone.interaction();

        System.out.println(smartPhone.toString());
    }
}
