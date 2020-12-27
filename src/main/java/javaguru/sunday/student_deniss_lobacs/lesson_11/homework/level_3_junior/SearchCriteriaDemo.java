package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.*;

// task21

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1890");

        Book book = new Book("Kuper", "Zveroboi", "2000");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);

        System.out.println(searchCriteria1.match(book));
        System.out.println(searchCriteria2.match(book));
        System.out.println(searchCriteria3.match(book));
        System.out.println(searchCriteria4.match(book));
    }
}
