package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level3.task14;

class PetrolCar extends Car {

    private double petrolTankCapacity;
    public double speed;

    @Override
    void accelerate() {
        if (petrolTankCapacity > 2) {
            speed = speed + 0.5;
        }
    }
}
