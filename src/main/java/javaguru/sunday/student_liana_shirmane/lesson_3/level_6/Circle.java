package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

//task25
class Circle {
    double radius;
    double Phi = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double result = Phi * radius * radius;
        System.out.println("Circle area is " + result);
        return result;
    }
}
