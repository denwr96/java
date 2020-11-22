package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level3.task14;

class ElectricCar extends Car {

    private int batteryCharge;
    public double speed;

    @Override
    void accelerate() {
        if (batteryCharge > 10) {
            speed = speed + 0.5;
        }
    }
}
