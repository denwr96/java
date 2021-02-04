package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.Book;
import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Optional;
import java.util.Scanner;
@CodeReview(approved = true)
public class FindByIdUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public FindByIdUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the book id:");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println("The book is: " + bookOpt.toString());
    }

}

