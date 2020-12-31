package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;


class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

    SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    SearchCriteria searchCriteria2 = new AndSearchCriteria(yearOfTheIssueSearchCriteria, titleSearchCriteria);
    SearchCriteria searchCriteria3 = new AndSearchCriteria(authorSearchCriteria, yearOfTheIssueSearchCriteria);
    SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfTheIssueSearchCriteria);
    SearchCriteria searchCriteria5 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
    SearchCriteria searchCriteria6 = new OrSearchCriteria(yearOfTheIssueSearchCriteria, titleSearchCriteria);
}
