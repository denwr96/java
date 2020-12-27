package javaguru.sunday.teacher.lesson_5.lessoncode.stock;

public class StockTest {

    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.testInitValues();
        testRunner.testUpdatePrice();
    }
    //10 -> 12 -> 5 -> 7 -> 99 -> 77
    public void testUpdatePrice() {
        Stock stock = new Stock("Google", 10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        check(77, stock.getCurrentPrice(), "TestUpdatePrice");
        check(99, stock.getMaxPrice(), "TestUpdatePrice");
        check(5, stock.getMinPrice(), "TestUpdatePrice");
    }

    public void testInitValues() {
        Stock stock = new Stock("Google", 100);
        check(100, stock.getCurrentPrice(), "TestInitValues");
        check(100, stock.getMaxPrice(), "TestInitValues");
        check(100, stock.getMinPrice(), "TestInitValues");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "  has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}
