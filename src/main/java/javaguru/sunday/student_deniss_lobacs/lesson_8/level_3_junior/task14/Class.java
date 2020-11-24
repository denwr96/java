package main.java.javaguru.sunday.student_deniss_lobacs.lesson_8.level_3_junior.task14;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;


    @Override
    void accelerate() {

    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}