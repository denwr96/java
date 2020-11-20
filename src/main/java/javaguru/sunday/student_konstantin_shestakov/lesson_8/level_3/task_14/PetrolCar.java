package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_14;

class PetrolCar extends Car {

    private double petrolTankCapacity;
    private int speed;

    @Override
    void accelerate() {
        speed++;
        petrolTankCapacity--;
    }
}
