package javaguru.sunday.student_liana_shirmane.lesson_8.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//task2
@CodeReview(approved = true)
public class DefaultConstructor2Demo {
    public static void main(String[] args) {
        DefaultConstructor2 defaultConstructor2 = new DefaultConstructor2();
    }
}

//    Конструктор имеется в любом классе. Даже если вы его не написали,
//    компилятор Java сам создаст конструктор по умолчанию (default constructor).
//        Этот конструктор пустой и не делает ничего, кроме вызова конструктора суперкласса.