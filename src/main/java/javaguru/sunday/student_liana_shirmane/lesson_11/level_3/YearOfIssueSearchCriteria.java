package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task18
@CodeReview(approved = true)
class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }

}

