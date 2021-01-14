package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Map;

@CodeReview(approved = true)
class GetEachAuthorBookCountUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction (BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Map<String, Integer> authorToBooksMap = bookDatabase.getEachAuthorBookCount();
        for (Map.Entry<String, Integer> stringListEntry : authorToBooksMap.entrySet()) {
            System.out.println("Key: " + stringListEntry.getKey() + " Value: "
                    + stringListEntry.getValue());
        }
    }
}
