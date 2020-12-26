package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public FindByAuthorUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter an author:");
        String author = scanner.nextLine();
        List<Book> bookListByAuthor = bookDatabase.findByAuthor(author);
        System.out.println("The book list for author " + author + " is: " + bookListByAuthor.toString());
    }

}
