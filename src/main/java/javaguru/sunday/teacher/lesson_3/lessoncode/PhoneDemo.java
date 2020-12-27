package javaguru.sunday.teacher.lesson_3.lessoncode;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung S20", "Android", true);
        samsung.makeCall(1122233445);
        samsung.makeCall('+', 1122233445);

        String text = samsung.receiveSMS(12314141);
        System.out.println("Received sms text is: " + text);
    }
}
