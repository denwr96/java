package main.java.javaguru.sunday.teacher.lesson_9.lessoncode;

public class EncapsulationDemo {

    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone(1234);

//        mySmartPhone.changePin(4321);

        String[] smsArray = mySmartPhone.smsArray;
        Photo[] photos = mySmartPhone.photos;
    }

}
