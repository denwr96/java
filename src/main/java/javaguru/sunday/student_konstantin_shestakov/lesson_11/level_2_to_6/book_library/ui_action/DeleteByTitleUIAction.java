package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 38 (level 6)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter title to remove from library");
        String userInputTitle = scanner.next();
        bookDatabase.deleteByTitle(userInputTitle);
    }

}
