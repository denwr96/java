package javaguru.sunday.student_artjom_proshkin.lesson_10.level_6_middle;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean checkIfBookIsAdded(Book book);

    boolean checkBookAuthorAndTitle(Book book);

    boolean deleteBook(Book book);

    List<String> showSavedBooks(List<Book> books);

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByAuthorPart(String authorBeginning);

    List<Book> findBookByTitle(String title);

    List<Book> findBookByTitlePart(String titleBeginning);

    boolean bookWasRead(Book book);

    boolean bookWasNotRead(Book book);

    List<String> showAllReadBooks(List<Book> books);

    List<String> showAllUnreadBooks(List<Book> books);

}
