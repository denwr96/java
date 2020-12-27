package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.SearchCriteria;

public class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }

}

