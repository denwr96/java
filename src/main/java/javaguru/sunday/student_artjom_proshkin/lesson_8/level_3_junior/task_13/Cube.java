package main.java.javaguru.sunday.student_artjom_proshkin.lesson_8.level_3_junior.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Cube extends SolidFigure {

    double edgeLength;

    Cube(String name, double edgeLength) {
        super(name);
        this.edgeLength = edgeLength;

    }

    @Override
    double calculateVolume() {
        return edgeLength * edgeLength * edgeLength;
    }
}
