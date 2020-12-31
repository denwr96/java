package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

import java.util.Optional;
import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public ContainsUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To check if a book is available in our library, please, enter following information:");

        System.out.println("Author: ");
        String bookAuthor = scanner.nextLine();

        System.out.println("Title: ");
        String bookTitle = scanner.nextLine();

        System.out.println("Year of issue:");
        String bookYearOfIssue = scanner.nextLine();

        Book bookToFind = new Book(bookAuthor, bookTitle, bookYearOfIssue);
        System.out.println("The book availability: " + bookDatabase.contains(bookToFind));

    }

}

