package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book's author");
        String author = scanner.nextLine();
        List<Book> findByAuthorUIAction = bookDatabase.findByAuthor(author);
        for (Book book : findByAuthorUIAction) {
            System.out.println(book.toString());
        }
    }
}
