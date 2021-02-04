package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Set;

@CodeReview(approved = true)
public class FindUniqueAuthorsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<String> findUniqueAuthors = bookDatabase.findUniqueAuthors();
        for (String findUniqueAuthor : findUniqueAuthors) {
            System.out.println(findUniqueAuthor);
        }
    }
}
