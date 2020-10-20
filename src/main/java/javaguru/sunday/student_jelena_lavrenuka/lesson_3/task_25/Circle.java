package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_25;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Проблема в том, что вы не инициализируете состояние радиуса, у объекта. В конструктор вы его подаете, но как переменная radius должна получить свое" +
        "значене? " +
        "Далее, задание уже содержит часть решения. Там написано - Методы: расчет площади (double calculateArea())." +
        "Где у вас такой метод? Вы просто сделали состояние calculateArea. Это лишнее состояние для класса. Можно в место него просто реализовать метод, который вернет значение " +
        "площади.")
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double area = (Math.PI * Math.pow(2, radius));
        return area;
    }
}
