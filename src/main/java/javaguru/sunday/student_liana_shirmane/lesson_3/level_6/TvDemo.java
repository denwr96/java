package javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TvDemo {
    public static void main(String[] args) {
        Tv phillips = new Tv(32, "Phillips", false, "null");
        phillips.tvInfo();
        phillips.switchOn();
        phillips.switchChannel("LTV1");
        phillips.switchChannel("CartoonNetwork");
    }
}
