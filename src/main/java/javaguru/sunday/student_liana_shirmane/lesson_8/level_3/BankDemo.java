package javaguru.sunday.student_liana_shirmane.lesson_8.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task13
@CodeReview(approved = false)
@CodeReviewComment(comment = "Не правильное название переменных")
class BankDemo {
    public static void main(String args[]) {
        Bank b;
        b = new SEB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
        b = new SWED();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + "%");
    }
}

