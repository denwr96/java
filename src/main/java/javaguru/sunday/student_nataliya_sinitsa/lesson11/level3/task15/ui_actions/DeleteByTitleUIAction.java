package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public DeleteByTitleUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("To delete books, please, enter their title:");
        String title = scanner.nextLine();
        System.out.println("The books with title '" + title + "' are deleted from database.");
        bookDatabase.deleteByTitle(title);
    }

}

