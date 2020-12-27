package javaguru.sunday.student_nataliya_sinitsa.lesson4.level6.task17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
        stockTest.test2();
    }

    public void test1() {
        Stock victim = new Stock("Victim & Co.", 10);

        String initialPriceInformation = victim.getPriceInformation();
        System.out.println(initialPriceInformation);
        victim.updatePrice(15);
        double updatedPrice1 = victim.currentPrice;
        victim.updatePrice(7);
        double updatedPrice2 = victim.currentPrice;
        victim.updatePrice(14);
        double updatedPrice3 = victim.currentPrice;
        String updatedPriceInformation = victim.getPriceInformation();
        System.out.println(updatedPriceInformation);

        if (updatedPrice1 == Math.max(updatedPrice1, Math.max(updatedPrice2, updatedPrice3))) {
            System.out.println("Max price test 1 is OK");
        } else {
            System.out.println("Max price test 1 is FAILED");
        }

        if (updatedPrice2 == Math.min(updatedPrice1, Math.min(updatedPrice2, updatedPrice3))) {
            System.out.println("Min price test 1 is OK");
        } else {
            System.out.println("Min price test 1 is FAILED");
        }

        if (updatedPrice3 == victim.currentPrice) {
            System.out.println("Current price test 1 is OK");
        } else {
            System.out.println("Current price test 1 is FAILED");
        }

    }

    public void test2 () {
        Stock victim = new Stock("Victim & Co.", 30);

        victim.updatePrice(10);
        double updatedPrice1 = victim.currentPrice;

        victim.updatePrice(12);
        double updatedPrice2 = victim.currentPrice;

        victim.updatePrice(5);
        double updatedPrice3 = victim.currentPrice;

        victim.updatePrice(7);
        double updatedPrice4 = victim.currentPrice;

        victim.updatePrice(99);
        double updatedPrice5 = victim.currentPrice;

        victim.updatePrice(77);
        double updatedPrice6 = victim.currentPrice;

        String updatedPriceInformation = victim.getPriceInformation();
        System.out.println(updatedPriceInformation);

        if (updatedPrice5 == Math.max(Math.max(Math.max(updatedPrice1, updatedPrice2),
                Math.max(updatedPrice3, updatedPrice4)),
                Math.max(updatedPrice5, updatedPrice6))) {
            System.out.println("Max price test 2 is OK");
        } else {
            System.out.println("Max price test 2 is FAILED");
        }

        if (updatedPrice3 == Math.min(Math.min(Math.min(updatedPrice1, updatedPrice2),
                Math.min(updatedPrice3, updatedPrice4)),
                Math.min(updatedPrice5, updatedPrice6))) {
            System.out.println("Min price test 2 is OK");
        } else {
            System.out.println("Min price test 2 is FAILED");
        }

        if (updatedPrice6 == victim.currentPrice) {
            System.out.println("Current price test 2 is OK");
        } else {
            System.out.println("Current price test 2 is FAILED");
        }

    }

}
