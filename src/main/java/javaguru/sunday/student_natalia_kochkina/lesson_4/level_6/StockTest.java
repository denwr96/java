package main.java.javaguru.sunday.student_natalia_kochkina.lesson_4.level_6;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
        stockTest.test2();
    }

    public void test1() {
        Stock viktim = new Stock("crack", 10);
        int newPrice = viktim.price;
        viktim.updatePrice(12);
        int newPrice1 = viktim.price;
        viktim.updatePrice(5);
        int newPrice2 = viktim.price;
        viktim.updatePrice(7);
        int newPrice3 = viktim.price;
        viktim.updatePrice(99);
        int newPrice4 = viktim.price;
        viktim.updatePrice(77);
        int newPrice5 = viktim.price;
        System.out.println(newPrice + " -> " + newPrice1 + " -> " + newPrice2 + " -> " +
                newPrice3 + " -> " + newPrice4 + " -> " + newPrice5);
        if (viktim.maxPrice == 99) {
            System.out.println("Max test is OK");
        } else {
            System.out.println("Max test is FAILED");
        }
    }

    public void test2() {
        Stock viktim = new Stock("crack", 10);
        int newPrice = viktim.price;
        viktim.updatePrice(12);
        int newPrice1 = viktim.price;
        viktim.updatePrice(5);
        int newPrice2 = viktim.price;
        viktim.updatePrice(7);
        int newPrice3 = viktim.price;
        viktim.updatePrice(99);
        int newPrice4 = viktim.price;
        viktim.updatePrice(77);
        int newPrice5 = viktim.price;
        System.out.println(newPrice + " -> " + newPrice1 + " -> " + newPrice2 + " -> " +
                newPrice3 + " -> " + newPrice4 + " -> " + newPrice5);
        if (viktim.minPrice == 5) {
            System.out.println("Min test is OK");
        } else {
            System.out.println("Min test is FAILED");
        }
    }
}
