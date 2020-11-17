package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.inheritance;

public class MobilePhone {

    protected String model;
    protected boolean withButton;

    public MobilePhone(String model, boolean withButton) {
        this.model = model;
        this.withButton = withButton;
    }

    public void call() {
        System.out.println("Ring ring!");
    }

    public void interaction() {
        System.out.println("Push the buttons");
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "model='" + model + '\'' +
                ", withButton=" + withButton +
                '}';
    }
}
