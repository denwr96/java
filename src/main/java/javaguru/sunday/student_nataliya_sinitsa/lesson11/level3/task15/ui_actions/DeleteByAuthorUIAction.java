package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public DeleteByAuthorUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("To delete books, please, enter their author:");
        String author = scanner.nextLine();
        System.out.println("The books of author " + author + " are deleted from database.");
        bookDatabase.deleteByAuthor(author);
    }

}

