package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.List;
import java.util.Map;
// task38;
public class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        for (Map.Entry<String, List<Book>> entry : authorToBooksMap.entrySet()) {
            System.out.println("Author: " + entry.getKey() + " Book: "
                    + entry.getValue().toString());
        }
    }
}
