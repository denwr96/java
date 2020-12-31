package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task21


class SearchCriteriaDemo {

    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
    SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);

    SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");
    SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);

    SearchCriteria searchCriteriaThree = new OrSearchCriteria(searchCriteria, searchCriteriaTwo);

}
