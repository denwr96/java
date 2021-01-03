package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

// Task 23 --> Task 26 from 24th line, Task 28 --> Task 29 from 28th line

import java.util.*;

public interface BookDatabaseV2 {

    List<Book> bookList = new ArrayList<>();

    Long save(Book book);
    boolean delete(Long bookId);
    boolean delete(Book book);
    Optional<Book> findById(Long bookId);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String author);
    int countAllBooks();
    void deleteByAuthor(String author);
    void deleteByTitle(String title);
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();
    boolean contains(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();

}

