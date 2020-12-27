package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.SearchCriteria;

public class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}
