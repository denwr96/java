package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 32 (level 6);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter book's ID:");
        Long userInputId = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(userInputId);

        System.out.println(bookOpt);
    }

}
