package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.HashSet;
import java.util.Set;

//task38


class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Set<Book> foundUniqueBooks;
        foundUniqueBooks = bookDatabase.findUniqueBooks();
        for (Book book : foundUniqueBooks) {
            System.out.println("Unique book in library: " + book.toString());
        }
    }

}
