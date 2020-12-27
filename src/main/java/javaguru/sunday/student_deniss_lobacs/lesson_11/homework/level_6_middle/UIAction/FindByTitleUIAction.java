package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.List;
import java.util.Scanner;
// task34
public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title: ");
        String bookTitle = scanner.nextLine();
        List<Book> findByTitle = bookDatabase.findByTitle(bookTitle);
        System.out.println(findByTitle.toString());
    }
}
