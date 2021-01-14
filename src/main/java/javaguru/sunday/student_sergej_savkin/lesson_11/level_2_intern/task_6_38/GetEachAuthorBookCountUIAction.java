package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.HashMap;
import java.util.Map;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Map.Entry<String, List<Book>> entry - вот такой тип должен быть у Entry")

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
