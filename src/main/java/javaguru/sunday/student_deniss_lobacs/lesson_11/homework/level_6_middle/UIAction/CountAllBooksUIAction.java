package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;
// task38;

public class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        int count = bookDatabase.countAllBooks();
        System.out.println("Book count is : "+ count);
    }
}
