package javaguru.sunday.student_liana_shirmane.lesson_11.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

//task21
@CodeReview(approved = true)
public class SearchCriteriaDemo {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1986");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteriaTwo = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteriaAll = new OrSearchCriteria(searchCriteria, searchCriteriaTwo);
}
