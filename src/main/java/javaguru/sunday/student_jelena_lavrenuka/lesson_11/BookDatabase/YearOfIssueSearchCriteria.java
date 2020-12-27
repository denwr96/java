package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue().equals(yearOfIssueToSearch);
    }
}