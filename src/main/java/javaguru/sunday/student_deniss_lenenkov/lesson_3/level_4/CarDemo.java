package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}
