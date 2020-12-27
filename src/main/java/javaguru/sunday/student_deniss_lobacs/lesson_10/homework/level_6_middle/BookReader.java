package javaguru.sunday.student_deniss_lobacs.lesson_10.homework.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.ArrayList;

// task14, task15, task16, task17, task18, task19, task20, task21, task22, task23, task24, task25;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Не используйте имплементацию ArrayList, лучше использовать интерфейс List")
public interface BookReader {
    boolean addBook(Book book);

    boolean addBookV2(Book book);

    boolean deleteBook(Book book);

    ArrayList<String> getBooks();

    ArrayList<Book> searchByAuthor(String author);

    ArrayList<Book> searchByTitle(String title);

    ArrayList<Book> findByAuthorBeginning(String author);

    ArrayList<Book> searchByTitleBeginning(String title);

    boolean setBookAsRed(Book book);

    boolean setBookAsNotRed(Book book);

    public ArrayList<String> getRedBookList();

    public ArrayList<String> getNotRedBookList();
}
