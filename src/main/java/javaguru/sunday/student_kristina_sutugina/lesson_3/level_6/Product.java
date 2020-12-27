package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

//Task_26

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Product {

     String name;
     double regularPrice;
     double discount;

     public Product(String name) {

         this.name = name;
     }

     double actualPrice() {
         return this.regularPrice - (this.discount / 100);
     }

     void printInformation() {

         System.out.println(this.name + " actual price is : " + actualPrice() + " Euro.");
     }
 }
