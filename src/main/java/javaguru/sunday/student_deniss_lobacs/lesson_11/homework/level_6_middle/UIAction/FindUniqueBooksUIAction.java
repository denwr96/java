package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Set;
// task38;
public class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> books = bookDatabase.findUniqueBooks();
        for (Book book : books) {
            System.out.println("Unique books in library: " + book.toString());
        }
    }

}
