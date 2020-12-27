package javaguru.sunday.student_artjom_proshkin.lesson_8.level_3_junior.task_13;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class SolidFigure {

    private String title;

    SolidFigure(String title) {
        this.title = title;
    }

    abstract double calculateVolume();


}
