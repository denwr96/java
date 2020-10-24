package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

class Car {

    String make;
    double engineSize;
    String color;

    Car(String make,
           double engineSize,
           String color) {
        this.make = make;
        this.engineSize = engineSize;
        this.color = color;
    }

    String getMake() {
        return this.make;
    }

    double getEngineSize() {
        return this.engineSize;
    }

    String getColor() {
        return this.color;
    }
}
