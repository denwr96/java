package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;


// Task 38 (level 6)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Unique titles list: ");
        System.out.println(bookDatabase.findUniqueTitles());
    }
}
