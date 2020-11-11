package main.java.javaguru.sunday.student_kristina_sutugina.lesson_4.level_6;



class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.firstInsertTest();
    }

    public void firstInsertTest() {

        Stock stock = new Stock("Goog", 10);
        int initialPrice = stock.maxPrice;
        stock.updatePrice(12);
        int firstInsert = stock.maxPrice;
        int maxPrice1 = stock.getMaxPrice();
        stock.updatePrice(5);
        int secondInsert = stock.minPrice;
        int maxPrice2 = stock.getMaxPrice();
        stock.updatePrice(7);
        int thirdInsert = stock.currentPrice;
        int maxPrice3 = stock.getMaxPrice();
        stock.updatePrice(99);
        int fourthInsert = stock.maxPrice;
        int maxPrice4 = stock.getMaxPrice();
        stock.updatePrice(77);
        int fifthInsert = stock.currentPrice;
        int maxPrice5 = stock.getMaxPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " -> " + secondInsert + " -> " + thirdInsert + " -> " + fourthInsert + " -> " + fifthInsert + " = Максимальная цена за указанный переуд: " + priceMax);

        if (firstInsert > initialPrice) {
            System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " = Максимальная цена за указанный переуд: " + maxPrice1);
        } else if (firstInsert <= initialPrice) {
            System.out.println("Test failed.");
        }
        if (secondInsert < maxPrice1) {
            System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " -> " + secondInsert + " = Максимальная цена за указанный переуд: " + maxPrice2);
        } else if (secondInsert >= maxPrice1) {
            System.out.println("Test failed.");
        }
        if (thirdInsert < maxPrice2) {
            System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " -> " + secondInsert + " -> " + thirdInsert + " = Максимальная цена за указанный переуд: " + maxPrice3);
        } else if (thirdInsert >= maxPrice2) {
            System.out.println("Test failed.");
        }
        if (fourthInsert > maxPrice3) {
            System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " -> " + secondInsert + " -> " + thirdInsert + " -> " + fourthInsert + " = Максимальная цена за указанный переуд: " + maxPrice4);
        } else if (fourthInsert <= maxPrice3) {
            System.out.println("Test failed.");
        }
        if (fifthInsert < maxPrice4) {
            System.out.println("Изменение цены акции: " + initialPrice + " -> " + firstInsert + " -> " + secondInsert + " -> " + thirdInsert + " -> " + fourthInsert + " -> " + fifthInsert + " = Максимальная цена за указанный переуд: " + maxPrice5);
        } else if (fifthInsert >= maxPrice4) {
            System.out.println("Test failed.");
        }
    }
}
