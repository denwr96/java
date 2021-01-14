package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.HashSet;
import java.util.Set;

//task38

@CodeReview(approved = true)
class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<String> foundUniqueTitles;
        foundUniqueTitles = bookDatabase.findUniqueTitles();
        for (String title : foundUniqueTitles) {
            System.out.println("Unique title in library: " + title);
        }
    }

}
