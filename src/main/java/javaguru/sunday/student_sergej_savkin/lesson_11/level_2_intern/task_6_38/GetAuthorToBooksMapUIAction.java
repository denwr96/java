package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//task38

class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String , List<Book>> authorToBooksMap;
        authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        for (Map.Entry entry : authorToBooksMap.entrySet()) {
            System.out.println("Author: " + entry.getKey() + " Book: "
                    + entry.getValue().toString());
        }
    }
}
