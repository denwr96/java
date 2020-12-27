package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria;

import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.SearchCriteria;

public class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) && rightCondition.match(book);
    }

}
