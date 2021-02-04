package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;


// Task 17 (level 3)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }

}
