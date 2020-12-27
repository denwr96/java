package javaguru.sunday.student_natalia_kochkina.lesson_3.level_6.task_24;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_24
@CodeReview(approved = true)
public class WineDemo {
    public static void main(String[] args) {
        Wine newWine = new Wine("white", "portveinTriTopora", 13.5);
        newWine.openTheBottle();
    }
}
