package main.java.javaguru.sunday.teacher.lesson_10.lessoncode.library;

import java.text.ParseException;
import java.util.List;

public class LibraryDemo {

    public static void main(String[] args) throws ParseException {
        ReaderCard readerCard = new ReaderCard();
        Reader reader = new Reader("Alex", readerCard, 12345689);

        Book book1 = new Book("A", "BB");
        Book book2 = new Book("D", "CC");

        readerCard.takeTheBook(book1);
        readerCard.takeTheBook(book2);

        List<ReaderCardItem> cardItems = readerCard.getCardItems();

        for (ReaderCardItem cardItem : cardItems) {
            System.out.println(cardItem);
        }

        readerCard.returnTheBook(book2);



        for (ReaderCardItem cardItem : cardItems) {
            System.out.println(cardItem);
        }
    }
}
