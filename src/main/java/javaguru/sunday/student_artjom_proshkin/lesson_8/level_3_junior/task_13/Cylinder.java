package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_3_junior.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Cylinder extends SolidFigure {

    double radius;
    double height;

    Cylinder(String name, double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
