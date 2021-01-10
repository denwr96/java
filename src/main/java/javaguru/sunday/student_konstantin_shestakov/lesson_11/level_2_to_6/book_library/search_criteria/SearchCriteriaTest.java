package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;


// Task 16, 17, 18, 19, 20 (level 3)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;

class SearchCriteriaTest {

    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.matchTest();
    }

    void matchTest() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Author", "Title");
        Book book2 = new Book("Author 2", "Title 2");
        Book book3 = new Book("Author", "Title 3");
        Book book4 = new Book("Author 3", "Title");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Author");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Title");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1998");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        checkResults(authorSearchCriteria.match(book), "Author search criteria test");
        checkResults(titleSearchCriteria.match(book), "Title search criteria test");
        book.yearOfIssue = "1998";
        checkResults(yearOfIssueSearchCriteria.match(book), "Year of issue search criteria test");

        checkResults(andSearchCriteria.match(book), "And search criteria test");
        checkResults(orSearchCriteria.match(book), "Or search criteria test");
    }

    void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
