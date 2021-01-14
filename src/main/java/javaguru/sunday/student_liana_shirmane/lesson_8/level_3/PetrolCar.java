package javaguru.sunday.student_liana_shirmane.lesson_8.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task14
@CodeReview(approved = false)
@CodeReviewComment(comment = "Порядок переменных и методов не правильный")
class PetrolCar extends Car {
    @Override
    void accelerate() {}
    private double petrolTankCapacity;

}
