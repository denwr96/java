package javaguru.sunday.student_natalia_kochkina.lesson_8.level_3.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_14
@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;
    int speed;

    public void accelerate() {
        speed++;
    }
}