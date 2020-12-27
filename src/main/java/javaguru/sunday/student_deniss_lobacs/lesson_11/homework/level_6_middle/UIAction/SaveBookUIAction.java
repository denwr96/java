package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Scanner;
// task31
public class SaveBookUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author: ");
        String bookAuthor = scanner.nextLine();
        System.out.println("Enter title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter year of issue: ");
        String bookYearOfIssue = scanner.nextLine();
        Book book = new Book(bookAuthor, bookTitle, bookYearOfIssue);
        bookDatabase.save(book);
    }
}
