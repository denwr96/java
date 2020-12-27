package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не надо выводить на консоль значения сразу из конструктора. Это совершенно не нужно. Конструктор служит только для инициализации состояний объекта." +
        "Иногда, очень редно, туда можно включить какую-то маленькую бизнесс логику.")
public class Sofa {

    //Task_24

    String color;
    String mterial;
    String roomines;

    public Sofa(String sofaColor , String sofaMaterial, String sofaRoomines){
        this.color = sofaColor;
        this.mterial = sofaMaterial;
        this.roomines = sofaRoomines;

        System.out.println("Color: " + sofaColor);
        System.out.println("Material: " + sofaMaterial);
        System.out.println("Roomines: " + sofaRoomines);
    }

}
