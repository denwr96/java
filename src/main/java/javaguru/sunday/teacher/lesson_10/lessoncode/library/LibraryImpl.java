package main.java.javaguru.sunday.teacher.lesson_10.lessoncode.library;

public class LibraryImpl implements Library{
    @Override
    public Book takeTheBook(String bookTitle) {
        return null;
    }

    @Override
    public Book takeTheBook(Book book) {
        return null;
    }

    @Override
    public boolean returnTheBook(Book book) {
        return false;
    }

    @Override
    public void issuePenalty(ReaderCard readerCard) {

    }

    @Override
    public boolean bookReservation(Book book) {
        return false;
    }
}
