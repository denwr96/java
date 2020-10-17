package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3.task_26;

class Product {
    String name;
    double regularPrice;
    double discount;
    double newPrice;

    Product (double regularPrice, double discount){
        this.name = "CocaCola";
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    double actualPrice(double regularPrice, double discount){
        double discountAmount = (regularPrice * discount)/100;
        double newPrice = regularPrice - discountAmount;
        return newPrice;
    }

    void printInformation(){
        System.out.println(this.name);
        System.out.println("Discount " + discount + '%');
        System.out.println("New price is " + newPrice);

    }
}
