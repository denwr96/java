package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;


// Task 18 (level 3)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYear().equals(this.yearOfIssueToSearch);
    }

}
