package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Optional;
import java.util.Scanner;
// task32
public class FindByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id: ");
        Long bookID = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(bookID);
        System.out.println(bookOpt.toString());
    }
}
