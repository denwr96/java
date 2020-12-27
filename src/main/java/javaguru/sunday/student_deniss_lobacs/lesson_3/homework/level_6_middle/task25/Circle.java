package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task25;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Circle {

    public double radius;

    double calculateArea(double radius) {

        double result = 3.14 * (radius * radius);
        System.out.println("Площадь круга= " + result);
        return result;
    }

}
