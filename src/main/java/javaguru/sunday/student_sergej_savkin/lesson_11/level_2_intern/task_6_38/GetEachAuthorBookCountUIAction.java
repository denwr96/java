package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.HashMap;
import java.util.Map;


class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> authorToBookCountMap;
        authorToBookCountMap = bookDatabase.getEachAuthorBookCount();
        for (Map.Entry entry : authorToBookCountMap.entrySet()) {
            System.out.println("Author: " + entry.getKey() + " Book count: "
                    + entry.getValue());
        }
    }
}
