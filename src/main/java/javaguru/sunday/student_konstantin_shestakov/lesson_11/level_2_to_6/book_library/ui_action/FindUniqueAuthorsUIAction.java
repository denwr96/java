package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.ui_action;

// Task 38 (level 6)

import main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;

public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Authors list: ");
        System.out.println(bookDatabase.findUniqueAuthors());
    }
}
