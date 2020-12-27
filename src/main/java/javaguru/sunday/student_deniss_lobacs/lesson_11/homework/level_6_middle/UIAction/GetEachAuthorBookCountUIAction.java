package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_6_middle.UIAction;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.BookDatabase;

import java.util.Map;
// task38;
public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> authorBookCount = bookDatabase.getEachAuthorBookCount();
        for (Map.Entry<String, Integer> entry : authorBookCount.entrySet()) {
            System.out.println("Author: " + entry.getKey() + " Count: "
                    + entry.getValue());
        }
    }
}
