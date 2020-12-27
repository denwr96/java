package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library;

// Task 6 - 14 (level 2);
// Task 22 (level 3);
// Task 23 - 26 (level 4);
// Task 28, 29 (level 5);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria.SearchCriteria;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface BookDatabase {

    Long save(Book book);

    boolean delete(Long bookId);

    boolean delete(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

    List<Book> getBooksLibrary();

    List<Book> find(SearchCriteria searchCriteria);

    Set<String> findUniqueAuthors();

    Set<String> findUniqueTitles();

    Set<Book> findUniqueBooks();

    boolean contains(Book book);

    Map<String, List<Book>> getAuthorToBooksMap();

    Map<String, Integer> getEachAuthorBookCount();

}
