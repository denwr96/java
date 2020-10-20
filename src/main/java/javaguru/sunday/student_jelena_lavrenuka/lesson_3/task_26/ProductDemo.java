package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_26;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product(5,10);
        myProduct.actualPrice();
        myProduct.printInformation();
    }
}
