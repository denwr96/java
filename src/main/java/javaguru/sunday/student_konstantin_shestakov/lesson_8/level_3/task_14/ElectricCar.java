package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_14;

class ElectricCar extends Car {

    private int batteryCharge;
    private int speed;

    @Override
    void accelerate() {
        speed++;
        batteryCharge--;
    }
}
