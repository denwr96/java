package javaguru.sunday.student_liana_shirmane.lesson_4.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.test1();
    }

    public void test1() {
        double expectedResultMax = 15;
        double expectedResultMin = 7;
        double expectedResultPrice = 14;
        Stock stock = new Stock("Yandex", 10);
        String priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
        double actualResultMax = stock.updatePrice(15);
        double actualResultMin = stock.updatePrice(7);
        double actualResultPrice = stock.updatePrice(14);
        priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
        check(expectedResultMax, actualResultMax, "Price test Max");
        check(expectedResultMin, actualResultMin, "Price test Min");
        check(expectedResultPrice, actualResultPrice, "Price test");
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}