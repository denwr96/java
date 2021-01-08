package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 35 (level 6);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter book's ID for removal:");
        Long userInputId = scanner.nextLong();
        bookDatabase.delete(userInputId);
    }

}
