package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

import javax.lang.model.element.Name;

@CodeReview(approved = true)
class ProductDemo {
  public static void main(String[] args) {
    Product myProduct = new Product("Milk");
    myProduct.regularPrice = 1.20;
    myProduct.discount = 15;
    myProduct.printInformation();

  }
}
