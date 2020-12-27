package javaguru.sunday.teacher.lesson_10.lessoncode.library;

public interface Library {

    Book takeTheBook(String bookTitle);

    Book takeTheBook(Book book);

    boolean returnTheBook(Book book);

    void issuePenalty(ReaderCard readerCard);

    boolean bookReservation(Book book);

    //add a book

    //search


}
