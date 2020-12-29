package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.Set;


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
