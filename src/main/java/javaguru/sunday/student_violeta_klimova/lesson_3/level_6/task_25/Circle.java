package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_6.task_25;

class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(14);
        double area = circle.calculateArea();
        System.out.printf("Area: %f", area);
    }
}
