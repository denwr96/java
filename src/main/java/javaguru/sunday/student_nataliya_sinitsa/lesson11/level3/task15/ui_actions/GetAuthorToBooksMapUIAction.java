package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.ui_actions;

import javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15.BookDatabaseV2;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabaseV2 bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabaseV2 bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        System.out.println("Books for each author available in library: "
                + bookDatabase.getAuthorToBooksMap().toString());
    }

}

