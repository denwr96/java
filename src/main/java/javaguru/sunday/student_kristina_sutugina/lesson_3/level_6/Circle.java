package javaguru.sunday.student_kristina_sutugina.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_25
@CodeReview(approved = true)
 class Circle {
     double radius;

     public Circle(double radius) {

         this.radius = radius;
     }

     double calculateArea() {
         return this.radius * 3.1415;

     }
 }
