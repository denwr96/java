package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 34 (level 6);

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.List;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter title:");
        String userInputTitle = scanner.next();
        List<Book> titleBooksList = bookDatabase.findByTitle(userInputTitle);

        System.out.println(titleBooksList);
    }

}
