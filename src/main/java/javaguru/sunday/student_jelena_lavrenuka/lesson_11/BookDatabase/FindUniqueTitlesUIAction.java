package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Set;

@CodeReview(approved = true)
class FindUniqueTitlesUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> findUniqueTitles = bookDatabase.findUniqueTitles();
        for (String findUniqueTitle : findUniqueTitles) {
            System.out.println(findUniqueTitle);
        }
    }
}
