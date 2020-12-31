package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

public class GetEachAuthorBookCount implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public GetEachAuthorBookCount(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Amount of books for each author available in library: "
                + bookDatabase.getEachAuthorBookCount().toString());
    }

}

