package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import java.util.Set;

class FindUniqueBooksUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Set<Book> findUniqueBooks = bookDatabase.findUniqueBooks();
        for (Book findUniqueBook : findUniqueBooks) {
            System.out.println(findUniqueBook.toString());
        }
    }
}
