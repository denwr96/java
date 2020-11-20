package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_4.task_17;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StockDemo {
    public static void main(String[] args) {
        Stock myStock = new Stock("CocaCola", 10);

        myStock.printInformation();
        myStock.updatePrice(12);
        myStock.printInformation();
        myStock.updatePrice(5);
        myStock.updatePrice(7);
        myStock.updatePrice(99);
        myStock.updatePrice(77);
        myStock.printInformation();

    }
}

