package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_3.task_13;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_13
@CodeReview(approved = false)
@CodeReviewComment(comment = "Давайте попробуем еще какой-нибудь пример придумать?" +
        "Как минимум абстрактный метод getPrice идентичен для всех продуктов и нет никаких" +
        "различий между тем, как они его имплементируют. Именно это и позволяет нам " +
        "абстрактный класс. Создать общую логику своих потомков и дать некую свободу и предоставить " +
        "возможность имплементировать часть логики самостоятельно.")
public class Chips extends Product {
    @Override
    public int getPrice() {
        return price;
    }
}
