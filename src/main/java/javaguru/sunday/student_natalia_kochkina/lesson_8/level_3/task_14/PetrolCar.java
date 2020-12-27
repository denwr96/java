package javaguru.sunday.student_natalia_kochkina.lesson_8.level_3.task_14;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_14
@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;
    int speed;

    public void accelerate() {
        speed++;
    }
}
