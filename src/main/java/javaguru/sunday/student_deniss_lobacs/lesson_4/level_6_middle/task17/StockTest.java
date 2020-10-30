package main.java.javaguru.sunday.student_deniss_lobacs.lesson_4.level_6_middle.task17;

public class  StockTest {
    private Stock stock = new Stock("Google" , 999);
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.firstTest();
        stockTest.secondTest();
        stockTest.thirdTest();
        stockTest.fourthTest();
        stockTest.firstTest();
    }

    public void firstTest() {
        int stepOne = stock.getCurrentPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + stepOne + " = Максимальная цена за указанный переуд: " + priceMax);
    }

    public void secondTest() {
        int stepOne = stock.getCurrentPrice();
        stock.updatePrice(1);
        int stepTwo = stock.getCurrentPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + stepOne + " -> " + stepTwo + " = Максимальная цена за указанный переуд: " + priceMax);
    }

    public void thirdTest() {
        int stepOne = stock.getCurrentPrice();
        stock.updatePrice(2);
        int stepTwo = stock.getCurrentPrice();
        stock.updatePrice(1000);
        int stepThree = stock.getCurrentPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + stepOne + " -> " + stepTwo + " -> " + stepThree + " = Максимальная цена за указанный переуд: " + priceMax );
    }

    public void fourthTest() {
        int stepOne = stock.getCurrentPrice();
        stock.updatePrice(2);
        int stepTwo = stock.getCurrentPrice();
        stock.updatePrice(1000);
        int stepThree = stock.getCurrentPrice();
        stock.updatePrice(8);
        int stepFour = stock.getCurrentPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + stepOne + " -> " + stepTwo + " -> " + stepThree + " -> " + stepFour + " = Максимальная цена за указанный переуд: " + priceMax);
    }

    public void fifthTest() {
        int stepOne = stock.getCurrentPrice();
        stock.updatePrice(27);
        int stepTwo = stock.getCurrentPrice();
        int priceMax = stock.getMaxPrice();
        System.out.println("Изменение цены акции: " + stepOne + " -> " + stepTwo + " = Максимальная цена за указанный переуд: " + priceMax);
    }

}