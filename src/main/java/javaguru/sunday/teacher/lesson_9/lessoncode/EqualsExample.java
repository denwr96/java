package main.java.javaguru.sunday.teacher.lesson_9.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class EqualsExample {

    List<Car> carArray = new ArrayList<>();

    public static void main(String[] args) {
        EqualsExample equalsExample = new EqualsExample();
        Car myCarOne = new Car("Black", "BMW");
        Car myCarTwo = new Car("White", "BMW");
        Car myCarThree = new Car("Black", "BMW");

        if (myCarOne.equals(myCarTwo)) {
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equal");
        }


        if (myCarOne.equals(myCarThree)) {
            System.out.println("They are equals");
        } else {
            System.out.println("They are not equal");
        }

        equalsExample.addCarToArray(myCarOne);
        equalsExample.addCarToArray(myCarTwo);
        equalsExample.addCarToArray(myCarThree);


        for (Car car : equalsExample.carArray) {
//            System.out.println(car.getColor() + " " + car.getManufacture());
        }
    }

    public void addCarToArray(Car car) {
        if (!isPresent(car)) {
            carArray.add(car);
        }
    }

    public boolean isPresent(Car car) {
        for (Car storedCar : carArray) {
            if (storedCar.equals(car)) {
                return true;
            }
        }
        return false;
    }
}
