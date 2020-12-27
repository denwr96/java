package javaguru.sunday.teacher.lesson_3.lessoncode;

public class Phone {

    public String manufacture;
    public String os;
    public boolean power;
    public int charge;

    public Phone(String manufacture, String os, boolean power) {
        this.manufacture = manufacture;
        this.os = os;
        this.power = power;
    }

    public void makeCall(int number) {
        System.out.println("Making call to the number: " + number);
    }

    public void makeCall(char plus, int number) {
        System.out.println("Making call to the number: " + plus + number);
    }

    public void sendSMS(int number, String smsText) {
        System.out.println("Sending SMS to number: " + number);
        System.out.println("With text: " + smsText);
    }

    public String receiveSMS(int number) {
        System.out.println("SMS received from number: " + number);
        String receivedText = "Hello, It's me! Mario!";
        return receivedText;
    }

}
