package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;

import java.util.Scanner;

public class ContainsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check if library contains desired book");

        System.out.println("Please enter author");
        String userInputAuthor = scanner.next();

        System.out.println("Please enter title");
        String userInputTitle = scanner.next();

        System.out.println(bookDatabase.contains(new Book(userInputAuthor, userInputTitle)));
    }
}
