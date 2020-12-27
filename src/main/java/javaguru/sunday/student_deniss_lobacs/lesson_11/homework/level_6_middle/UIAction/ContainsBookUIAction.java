package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Scanner;
// task38;
public class ContainsBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public ContainsBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author: ");
        String author = scanner.next();
        System.out.println("Enter book title: ");
        String title = scanner.next();
        Book book = new Book(author, title);
        if (bookDatabase.contains(book)) {
            System.out.println("Book contains in database");
        } else {
            System.out.println("Book not contains in database");
        }
    }

}
