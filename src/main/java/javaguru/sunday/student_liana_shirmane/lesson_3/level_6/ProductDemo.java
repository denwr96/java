package javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Piens", 1.86, 0.12);
        milk.actualPrice();
        milk.printInformation();
    }
}
