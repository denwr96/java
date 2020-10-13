package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;

    }
    double calculateArea(){
        double area = radius * radius * 3.1415;
        System.out.println("Area of cyrlce is " + area);
        return area;
    }

}
