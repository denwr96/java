package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_8.shape;

// lesson_8 task_15
// lesson_8 task_16
// lesson_8 task_17
// lesson_8 task_18
// lesson_8 task_19

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
