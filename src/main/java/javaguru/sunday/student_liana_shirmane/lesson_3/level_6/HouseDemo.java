package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class HouseDemo {
    public static void main(String[] args) {
        House firstHouse = new House(2, 4, "yellow");
        firstHouse.houseInfo();
        House secondHouse = new House(5, 25, "white");
        secondHouse.houseInfo();

    }
}
