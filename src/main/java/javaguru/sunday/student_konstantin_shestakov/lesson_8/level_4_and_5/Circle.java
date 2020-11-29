package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 16 (level4)
@CodeReview(approved = true)
@CodeReviewComment(comment = "Вывод на консоль в методах совершенно лишние.")
class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        System.out.println("Circle radius = " + radius + ", area = "  + (3.14159 * radius * radius));
        return 3.14159 * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Circle radius = " + radius + ", perimeter = "  + (2 * 3.14159 * radius));
        return 2 * 3.14159 * radius;
    }
}
