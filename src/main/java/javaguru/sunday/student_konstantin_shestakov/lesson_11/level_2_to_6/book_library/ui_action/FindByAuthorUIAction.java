package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;

// Task 33 (level 6);

import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter author");
        String userInputAuthor = scanner.next();
        List<Book> authorsBooksList = bookDatabase.findByAuthor(userInputAuthor);

        System.out.println(authorsBooksList);
    }

}
