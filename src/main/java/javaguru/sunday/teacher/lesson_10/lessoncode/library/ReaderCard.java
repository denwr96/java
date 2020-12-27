package javaguru.sunday.teacher.lesson_10.lessoncode.library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReaderCard {

    private static SimpleDateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");

    private int id;
    private List<ReaderCardItem> cardItems = new ArrayList<>();

    public void takeTheBook(Book book) throws ParseException {
        ReaderCardItem item = new ReaderCardItem(this, book, new Date(), formatter.parse("01.12.2020"), null);
        cardItems.add(item);
    }

    public void returnTheBook(Book book) {
        for (ReaderCardItem cardItem : cardItems) {
            if (cardItem.getBook().equals(book)) {
                cardItem.setActualReturnDate(new Date());
            }
        }
    }

    public List<ReaderCardItem> getCardItems() {
        return cardItems;
    }

    @Override
    public String toString() {
        return "ReaderCard{" +
                "cardItems=" + cardItems +
                '}';
    }
}
