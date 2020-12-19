package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_3;
//task21
public class SearchCriteriaDemo {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1986");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteriaAll = new OrSearchCriteria(searchCriteria, searchCriteriaTwo);
}
