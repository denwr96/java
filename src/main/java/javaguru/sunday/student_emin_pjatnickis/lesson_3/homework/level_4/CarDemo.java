package javaguru.sunday.student_emin_pjatnickis.lesson_3.homework.level_4;

// level_4

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_16
@CodeReview(approved = true)
public class CarDemo {

    public static void main(String[] args) {

        Car myCar = new Car("Dodge");

        String carModel = myCar.getModel();

        System.out.println("Car model = " + carModel);
    }

}
