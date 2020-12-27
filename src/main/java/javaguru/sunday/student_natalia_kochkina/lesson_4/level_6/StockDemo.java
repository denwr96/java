package javaguru.sunday.student_natalia_kochkina.lesson_4.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class StockDemo {
    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
