package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

// lesson_11 task_6
// lesson_11 task_7
// lesson_11 task_8
// lesson_11 task_9
// lesson_11 task_10
// lesson_11 task_11
// lesson_11 task_12
// lesson_11 task_13
// lesson_11 task_14
// lesson_11 task_15
// lesson_11 task_16
// lesson_11 task_17
// lesson_11 task_18
// lesson_11 task_19
// lesson_11 task_20
// lesson_11 task_21
// lesson_11 task_22
// lesson_11 task_23
// lesson_11 task_24
// lesson_11 task_25
// lesson_11 task_26
// lesson_11 task_27
// lesson_11 task_28
// lesson_11 task_29
// lesson_11 task_30
// lesson_11 task_31
// lesson_11 task_32
// lesson_11 task_33
// lesson_11 task_34
// lesson_11 task_35
// lesson_11 task_36
// lesson_11 task_37
// lesson_11 task_38


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
    List<Book> find(SearchCriteria searchCriteria);
    Set<String> findUniqueAuthors();
    Set<String> findUniqueTitles();
    Set<Book> findUniqueBooks();
    boolean contains(Book book);
    Map<String, List<Book>> getAuthorToBooksMap();
    Map<String, Integer> getEachAuthorBookCount();
}
