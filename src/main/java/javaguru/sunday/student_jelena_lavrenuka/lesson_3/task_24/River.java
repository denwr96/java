package javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_24;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.sql.SQLOutput;

@CodeReview(approved = true)
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
