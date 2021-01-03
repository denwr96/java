package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;

public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Authors available in library: " + bookDatabase.findUniqueAuthors().toString());
    }

}

