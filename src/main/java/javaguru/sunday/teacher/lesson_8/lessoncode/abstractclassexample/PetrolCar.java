package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.abstractclassexample;

public class PetrolCar extends Car {

    private int petrol;

    public PetrolCar(String model) {
        super(model);
    }

    @Override
    void start() {
        if (petrol > 0) {
            System.out.println("Started");
        } else {
            System.out.println("Out of fuel");
        }
    }

    @Override
    void fillFuel() {
        petrol++;
    }

    @Override
    void openDoors() {

    }


}
