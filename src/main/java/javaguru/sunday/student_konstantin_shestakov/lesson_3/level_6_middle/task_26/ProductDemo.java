package javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_26;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {

    public static void main(String[] args) {
        Product shockAbsorber = new Product("Shock absorber BPW");
        shockAbsorber.actualPrice();
        shockAbsorber.printInformation();
    }
}
