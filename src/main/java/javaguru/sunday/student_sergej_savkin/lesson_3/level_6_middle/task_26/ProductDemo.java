package main.java.javaguru.sunday.student_sergej_savkin.lesson_3.level_6_middle.task_26;

class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Phone");
        product1.regularPrice = 300;
        product1.discount = 50;
        product1.actualPrice();
        product1.printInformation();


    }
}