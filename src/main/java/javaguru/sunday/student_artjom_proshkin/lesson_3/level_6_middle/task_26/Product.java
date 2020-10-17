package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_26;

class Product {
    String name;
    double regularPrice;
    double discount; // in %

    Product(String name){
        this.name = name;
    }
    double actualPrice(){
        double actualPrice = regularPrice - (regularPrice * ( discount / 100));
        return actualPrice;
    }

    void printInformation(){
        System.out.println("Price with discount will be : " + actualPrice());
    }
}
