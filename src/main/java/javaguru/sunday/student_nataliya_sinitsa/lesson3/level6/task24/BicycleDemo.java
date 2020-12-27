package javaguru.sunday.student_nataliya_sinitsa.lesson3.level6.task24;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BicycleDemo {

    public static void main(String[] args) {
        Bicycle firstBicycle = new Bicycle("Red", "Merida", false);
        firstBicycle.availability();
        firstBicycle.changeAvailability();
    }


}
