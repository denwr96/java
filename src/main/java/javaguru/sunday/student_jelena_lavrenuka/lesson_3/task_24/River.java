package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.sql.SQLOutput;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Надо переделать. Нельзя писать методы в одну строчку. Не должно быть методов, название которых отличает просто 1-2." +
        "Почему метод information меняет состояние флага isClean? Как это логически обоснованно?")
class River {
    String riverName;
    int riverLength;
    String riverPurity;

    public River(String riverName, int riverLength, String riverPurity) {
        this.riverName = riverName;
        this.riverLength = riverLength;
        this.riverPurity = riverPurity;
    }

    void information() {
        System.out.println("River name is " + riverName + ',' + "length " + riverLength + ',' + " purity " + '-' + riverPurity);
    }

    void changePurity(String newPurity){
        this.riverPurity = newPurity;
        System.out.println("River name is " + riverName + ',' + "length " + riverLength + ',' + " purity " + '-' + newPurity);
    }
}
