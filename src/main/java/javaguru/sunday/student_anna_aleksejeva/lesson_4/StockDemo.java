package javaguru.sunday.student_anna_aleksejeva.lesson_4;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "А тесты где? =)")
public class StockDemo {

    public static void main(String[] args) {
        Stock googleStock = new Stock("" + "Google ", 10);
        googleStock.printInformation();
        googleStock.updatePrice(12);
        googleStock.printInformation();
        googleStock.updatePrice(5);
        googleStock.printInformation();
        googleStock.updatePrice(7);
        googleStock.printInformation();
        googleStock.updatePrice(99);
        googleStock.printInformation();
        googleStock.updatePrice(77);

    }
}
