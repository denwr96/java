package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_26;

class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("TV");
        product.regularPrice = 480;
        product.discount = 20;
        product.actualPrice();
        product.printInformation();
    }
}
