package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task20

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        return (leftCondition.match(book) || (rightCondition.match(book)));
    }
}
