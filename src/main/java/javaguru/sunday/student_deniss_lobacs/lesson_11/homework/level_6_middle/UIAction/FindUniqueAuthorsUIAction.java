package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Set;
// task38;
public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> uniqueAuthors = bookDatabase.findUniqueAuthors();
        for (String author : uniqueAuthors) {
            System.out.println("Unique authors in library: " + author);
        }
    }
}
