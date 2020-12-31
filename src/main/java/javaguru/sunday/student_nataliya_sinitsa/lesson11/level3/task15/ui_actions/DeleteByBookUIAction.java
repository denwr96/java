package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

import java.util.Scanner;

public class DeleteByBookUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public DeleteByBookUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To delete book from library, please, enter following information:");

        System.out.println("Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.println("Title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Year of issue:");
        String bookYearOfIssue = scanner.nextLine();

        Book bookToDelete = new Book(bookAuthor, bookTitle, bookYearOfIssue);
        System.out.println("The following book is deleted from library: " + bookToDelete.toString());
        bookDatabase.delete(bookToDelete);
    }

}

