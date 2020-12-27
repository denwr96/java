package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не надо выводить на консоль значения сразу из конструктора. Это совершенно не нужно. Конструктор служит только для инициализации состояний объекта." +
        "Иногда, очень редно, туда можно включить какую-то маленькую бизнесс логику.")
public class Fridge {
    //Task_24

    String color;
    String mark;
    double hight;

    public Fridge(String fridgeColor , String fridgeMark , double fridgeHight){
        this.color = fridgeColor;
        this.mark = fridgeMark;
        this.hight = fridgeHight;

        System.out.println("Color: " + fridgeColor);
        System.out.println("Mark: " + fridgeMark);
        System.out.println("Hight: " + fridgeHight);

    }


}
