package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.search_criteria;


// Task 21 (level 3)

import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.Book;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabase;
import javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.book_library.BookDatabaseImpl;

class SearchCriteriaDemo {

    public static void main(String[] args) {
        BookDatabase bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Kuper", "Zveroboi");
        book.yearOfIssue = "1998";

        Book book2 = new Book("Author", "Title 2");

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1998");

        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria orSearchCriteria2 = new OrSearchCriteria(orSearchCriteria, yearOfIssueSearchCriteria);

        andSearchCriteria.match(book);
        andSearchCriteria2.match(book);
        orSearchCriteria2.match(book);

        System.out.println(andSearchCriteria.match(book));
        System.out.println(andSearchCriteria2.match(book));
        System.out.println(orSearchCriteria2.match(book));

    }
}
