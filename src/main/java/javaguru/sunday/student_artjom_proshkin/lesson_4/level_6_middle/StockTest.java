package javaguru.sunday.student_artjom_proshkin.lesson_4.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockTest {
    public static void main(String[] args) {
        StockTest victim = new StockTest();
        victim.testCaseMax();
        victim.testMaxOfTwo();
    }

    void testCaseMax (){
        Stock bosch = new Stock("BOSCH",10);
        double priceOne = bosch.getCurrentPrice();
        bosch.updatePrice(12);
        double priceTwo = bosch.getCurrentPrice();
        bosch.updatePrice(5);
        double priceThree = bosch.getCurrentPrice();
        bosch.updatePrice(7);
        double priceFour = bosch.getCurrentPrice();
        bosch.updatePrice(99);
        double priceFive = bosch.getCurrentPrice();
        bosch.updatePrice(77);
        double priceSix = bosch.getCurrentPrice();
        double priceMax = bosch.getMaxPrice();
        System.out.println("Изменение цены акции: " + priceOne +" -> "+ priceTwo +" -> "+ priceThree +" -> "+ priceFour +" -> "+ priceFive +" -> "+ priceSix + " Максимальная цена за указанный переуд: " + priceMax);
    }

    void testMaxOfTwo (){
        Stock apple = new Stock("Apple",9);
        double priceOne = apple.getCurrentPrice();
        apple.updatePrice(27);
        double priceTwo = apple.getCurrentPrice();
        double priceMax = apple.getMaxPrice();
        System.out.println("Изменение цены акции: " + priceOne +" -> "+ priceTwo +" Максимальная цена за указанный переуд: " + priceMax);

    }
}
