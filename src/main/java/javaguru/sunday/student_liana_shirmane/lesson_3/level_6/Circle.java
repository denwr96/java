package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_6;
//task25
class Circle {
    double radiuss;
    double Phi = 3.14;
    Circle (double radiuss){
        this.radiuss = radiuss;
    }
  double calculateArea() {
        double result = Phi * radiuss * radiuss;
      System.out.println("Circle area is " + result);
      return result;
  }
}
