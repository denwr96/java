package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;


import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

public class CountAllBooksUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public CountAllBooksUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        System.out.println("The book amount in library is: " + bookDatabase.countAllBooks());

    }

}
