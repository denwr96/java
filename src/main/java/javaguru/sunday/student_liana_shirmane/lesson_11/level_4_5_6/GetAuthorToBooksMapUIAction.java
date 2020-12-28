package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task38


import java.util.List;
import java.util.Map;

class GetAuthorToBooksMapUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetAuthorToBooksMapUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Map<String, List<Book>> authorToBooksMap;
        authorToBooksMap = bookDatabase.getAuthorToBooksMap();
        authorToBooksMap.forEach((key, value) -> System.out.println("Author - " + key + ", book " + value.toString()));

    }
}