package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CarDemo {

    public static void main(String[] args) {

        Car car = new Car("BMW", 3.00, "Silver");
        String make = car.getMake();
        double engineSize = car.getEngineSize();
        String color = car.getColor();
        System.out.println("Car make = " + make);
        System.out.println("Engine size = " + engineSize);
        System.out.println("Car color = " + color);
    }
}
