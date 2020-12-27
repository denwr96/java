package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;
    private int speed;

    @Override
    void accelerate() {
        speed++;
        batteryCharge--;
    }
}
