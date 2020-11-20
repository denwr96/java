package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.updatePriceTest();
    }
 // 10 -> 12 -> 5 -> 7 -> 99 -> 77
    public void  updatePriceTest(){
        Stock victim = new Stock("CocaCola", 10);
        victim.updatePrice(12);
        victim.updatePrice(5);
        victim.updatePrice(7);
        victim.updatePrice(99);
        victim.updatePrice(77);
        testResult(77, victim.getCurrentPrice(), "UpdatePriceTest" + "Current price is ok");
        testResult(5, victim.getMinPrice(), "updatePriceTest" + "Min price is ok");
        testResult(99, victim.getMaxPrice(), "updatePriceTest" + "Max price is ok");
    }

    public void testResult(int actualResult, int expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}

