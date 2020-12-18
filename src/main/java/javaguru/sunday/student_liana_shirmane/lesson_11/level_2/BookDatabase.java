package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_2;
//task6

public interface BookDatabase {
    Long save(Book book);

    boolean delete(Long bookId);
}
