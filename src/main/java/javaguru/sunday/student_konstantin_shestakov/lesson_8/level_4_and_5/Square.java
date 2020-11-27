package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 17
@CodeReview(approved = true)
public class Square extends Shape {

    private double width;

    Square(String title, double width) {
        super(title);
        this.width = width;
    }

    @Override
    double calculateArea() {
        System.out.println("Square width = " + width + ", area = " + (width * width));
        return width * width;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Square width = " + width + ", perimeter = " + (4 * width));
        return 4 * width;
    }
}
