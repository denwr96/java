package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public DeleteByIdUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("To delete a book, please, enter it's id:");
        Long id = scanner.nextLong();
        System.out.println("The book " + bookDatabase.findById(id).toString() + " is deleted from database.");
        bookDatabase.delete(id);
    }

}

