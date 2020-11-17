package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.inheritance;

public class SmartPhone extends MobilePhone {

    protected String os;
    protected boolean hasNetworkConnection;

    public SmartPhone(String model, boolean withButton, String os, boolean hasNetworkConnection) {
        super(model, withButton);
        this.os = os;
        this.hasNetworkConnection = hasNetworkConnection;
    }

    public void checkOSVersion() {
        System.out.println("My OS version is: " + os);
    }

    public void enable4G() {
        if (hasNetworkConnection) {
            System.out.println("Connected...");
        }
    }

    @Override
    public void interaction() {
        System.out.println("Touch screen");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                ", hasNetworkConnection=" + hasNetworkConnection +
                ", model='" + model + '\'' +
                ", withButton=" + withButton +
                '}';
    }
}
