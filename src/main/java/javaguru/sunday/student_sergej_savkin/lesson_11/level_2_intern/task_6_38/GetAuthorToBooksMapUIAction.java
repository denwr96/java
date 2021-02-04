package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//task38

@CodeReview(approved = true)
@CodeReviewComment(comment = "Map.Entry<String, List<Book>> entry - вот такой тип должен быть у Entry")
class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> authorToBooksMap;
        authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        for (Map.Entry<String, List<Book>> entry : authorToBooksMap.entrySet()) {
            System.out.println("Author: " + entry.getKey() + " Book: "
                    + entry.getValue().toString());
        }
    }
}
