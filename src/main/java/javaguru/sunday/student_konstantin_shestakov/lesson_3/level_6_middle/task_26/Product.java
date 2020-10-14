package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_6_middle.task_26;

class Product {

    String name;
    double regularPrice = 55.75;
    double discount = 10.00;
    double actualPrice;

    Product(String productName){
        this.name = productName;
    }

    double actualPrice(){
        actualPrice = (regularPrice - (regularPrice * (discount / 100)));
        actualPrice = Math.round(actualPrice * 100.00) / 100.00;
        return this.actualPrice;
    }

    void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Regular price: " + regularPrice + " €");
        System.out.println("Discount: " + discount + " %");
        System.out.println("Actual price: " + actualPrice + " €");
    }
}
