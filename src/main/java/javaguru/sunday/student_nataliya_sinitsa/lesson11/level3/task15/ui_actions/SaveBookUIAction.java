package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class SaveBookUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public SaveBookUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("To save a book, please, enter following information:");

        System.out.println("Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.println("Title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Year of issue:");
        String bookYearOfIssue = scanner.nextLine();

        Book savedBook = new Book(bookAuthor, bookTitle, bookYearOfIssue);
        bookDatabase.save(savedBook);
        System.out.println("The book is saved as: " + savedBook.toString());

    }

}

