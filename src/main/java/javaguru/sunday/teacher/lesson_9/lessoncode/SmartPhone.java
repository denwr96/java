package javaguru.sunday.teacher.lesson_9.lessoncode;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SmartPhone {

    int pin;
    String[] smsArray;
    Photo[] photos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return pin == that.pin &&
                Arrays.equals(smsArray, that.smsArray) &&
                Arrays.equals(photos, that.photos);
    }


    public SmartPhone(int pin) {
        this.pin = pin;
    }

    public boolean changePinByUser(int newPin) {
        if (checkPinCodes()) {
            changePin(newPin);
            return true;
        }
        return false;
    }


    boolean checkPinCodes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type current pint code...");
        int pinCodeFromUser = scanner.nextInt();
        return pin == pinCodeFromUser;
    }

    private void changePin(int newPin) {
        pin = newPin;
    }

    //public
    //protected = default + inheritance
    //default
    //private

}