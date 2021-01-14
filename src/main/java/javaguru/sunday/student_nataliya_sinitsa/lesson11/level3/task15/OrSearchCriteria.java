package javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return leftCondition.match(book) || rightCondition.match(book);
    }

}

