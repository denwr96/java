package javaguru.sunday.student_sergej_savkin.lesson_4.level_6_middle.task_17;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testCaseMax();
        stockTest.testCaseMin();
    }


    public void testCaseMax(){
        Stock google = new Stock("Google", 10);
        int firstPrice = google.currentPrice;
        google.updatePrice(12);
        int secondPrice = google.currentPrice;
        google.updatePrice(5);
        int thirdPrice = google.currentPrice;
        google.updatePrice(7);
        int fourthPrice = google.currentPrice;
        google.updatePrice(99);
        int fifthPrice = google.currentPrice;
        google.updatePrice(77);
        int sixthPrice = google.currentPrice;
        int maxPrice = google.getMaxPrice();
        System.out.println("Stock price change: " + firstPrice + " -> " + secondPrice + " -> " + thirdPrice + " -> " + fourthPrice + " -> " + fifthPrice + " -> " + sixthPrice + " = Max stock price for specified period is: " + maxPrice);
    }

    public void testCaseMin(){
        Stock google = new Stock("Google", 10);
        int firstPrice = google.currentPrice;
        google.updatePrice(12);
        int secondPrice = google.currentPrice;
        google.updatePrice(5);
        int thirdPrice = google.currentPrice;
        google.updatePrice(7);
        int fourthPrice = google.currentPrice;
        google.updatePrice(99);
        int fifthPrice = google.currentPrice;
        google.updatePrice(77);
        int sixthPrice = google.currentPrice;
        int minPrice = google.getMinPrice();
        System.out.println("Stock price change: " + firstPrice + " -> " + secondPrice + " -> " + thirdPrice + " -> " + fourthPrice + " -> " + fifthPrice + " -> " + sixthPrice + " = Min stock price for specified period is: " + minPrice);
    }
}
