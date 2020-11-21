package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_4_and_5;

// Task 18 (level4)

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle(String title, double width, double height) {
        super(title);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        System.out.println("Recangle width = " + width + ", height = " + height + ", area = " + (width * height));
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        System.out.println("Recangle width = " + width + ", height = " + height + ", perimeter = " + ((2 * width) + (2 * height)));
        return (2 * width) + (2 * height);
    }
}
