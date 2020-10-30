package main.java.javaguru.sunday.student_glebs_surtajevs.lesson_3.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Product {

    String name;
    double regularPrice;
    double discount;

  Product(String name, double regularPrice, double discount) {

      this.name = name;
      this.regularPrice = regularPrice;
      this.discount = discount;
  }

  void printInformation() {
      double result = regularPrice - (regularPrice * discount);
      System.out.println("Product: " + name);
      System.out.println("Regular price: " + regularPrice);
      System.out.println("Actual price is: " + result);
  }

}
