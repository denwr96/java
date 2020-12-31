package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38



import java.util.Map;


class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, Integer> eachAuthorBookCount = bookDatabase.getEachAuthorBookCount();
        eachAuthorBookCount.forEach((key, value) -> System.out.println("Author - " + key + ", book " + value));
    }
}