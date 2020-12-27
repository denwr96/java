package javaguru.sunday.teacher.lesson_8.lessoncode.abstractclassexample;

public abstract class Car {

    protected String model;

    public Car(String model) {
        this.model = model;
    }

    public void drive() {

    }

    abstract void start();

    abstract void fillFuel();

    abstract void openDoors();
}
