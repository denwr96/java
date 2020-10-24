package main.java.javaguru.sunday.student_laura_upelniece.lesson3.lvl6.task26;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String productName) {
        this.name = productName;
        }


    public double actualPrice() {
        return (regularPrice - (discount/ 100) * (regularPrice));

    }


    public void printInformation() {
        System.out.println("Product: " + name);
        System.out.println("Regular price " + regularPrice);
        System.out.println("Price with discount: " + actualPrice());


    }

}
