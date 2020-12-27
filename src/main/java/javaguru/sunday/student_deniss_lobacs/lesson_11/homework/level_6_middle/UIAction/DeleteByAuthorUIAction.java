package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Scanner;
// task38;
public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter author to delete book: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);
    }
}
