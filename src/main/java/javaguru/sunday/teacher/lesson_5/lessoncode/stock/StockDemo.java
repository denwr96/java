package main.java.javaguru.sunday.teacher.lesson_5.lessoncode.stock;

public class StockDemo {

    public static void main(String[] args) {
        Stock googleStock = new Stock("Google", 10);

        googleStock.printInformation();
        googleStock.updatePrice(100);
        googleStock.printInformation();
        googleStock.updatePrice(5);
        googleStock.updatePrice(200);
        googleStock.updatePrice(300);
        googleStock.updatePrice(150);
        googleStock.printInformation();
    }
}
