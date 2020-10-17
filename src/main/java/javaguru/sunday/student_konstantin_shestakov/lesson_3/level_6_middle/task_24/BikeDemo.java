package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class BikeDemo {

    public static void main(String[] args) {
        Bike myBike = new Bike("Grey", false, 0);
        myBike.bikeMount(); // Залазим на лесопед
        myBike.bikeSpeedIncrease(); // Ускоряемся
        myBike.bikeSpeedDecrease(); // Замедляемся
        myBike.bikeDismount(); // Слазим с лесопеда
        myBike.bikeChangeColor(); // Перекрашиваем
    }
}
