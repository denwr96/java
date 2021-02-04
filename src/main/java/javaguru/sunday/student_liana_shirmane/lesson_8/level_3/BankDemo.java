package javaguru.sunday.student_liana_shirmane.lesson_8.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//task13
//corrected
@CodeReview(approved = false)
@CodeReviewComment(comment = "Не правильное название переменных")
class BankDemo {
    public static void main(String args[]) {
        Bank bank;
        bank = new SEB();
        System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + "%");

        bank = new SWED();
        System.out.println("Rate of Interest is: " + bank.getRateOfInterest() + "%");
    }
}

