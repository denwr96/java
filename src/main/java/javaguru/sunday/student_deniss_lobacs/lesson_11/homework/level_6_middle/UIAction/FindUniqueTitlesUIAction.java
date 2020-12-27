package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Set;
// task38;
public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> uniqueTitles = bookDatabase.findUniqueTitles();
        for (String title : uniqueTitles) {
            System.out.println("Unique titles in library: " + title);
        }
    }

}
