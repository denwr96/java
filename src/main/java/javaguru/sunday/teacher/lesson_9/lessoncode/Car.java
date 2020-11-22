package main.java.javaguru.sunday.teacher.lesson_9.lessoncode;

import java.util.Objects;

public class Car {

    private String color;        //color
    private String manufacture;  //manufacture
//    public int power;           //power
//    public double engineVolume; //engineVolume
//    public String engineType;   //engineType
    private int speed;            //speed
    public boolean openDoors;
    public boolean engineState;

    public Car() {

    }


    public Car(String color) {
        this.color = color;
    }

    public Car(String color, String manufacture) {
        this.color = color;
        this.manufacture = manufacture;
    }

    public void startEngine() {
        engineState = true;
    }

    public void speedUp() {
        speed = speed + 1;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(manufacture, car.manufacture);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", openDoors=" + openDoors +
                ", engineState=" + engineState +
                '}';
    }
}
