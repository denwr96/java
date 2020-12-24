package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level3.task15;

//Task 15 --> Task 22

import java.util.ArrayList;
import java.util.List;

class SearchCriteriaTest {

    public static void main(String[] args) {

        SearchCriteriaTest test = new SearchCriteriaTest();

        test.shouldSearchByAuthorTrue();
        test.shouldSearchByAuthorFalse();
        test.shouldSearchByTitleTrue();
        test.shouldSearchByTitleFalse();
        test.shouldSearchByYearOfIssueTrue();
        test.shouldSearchByYearOfIssueFalse();
        test.andSearchCriteriaShouldBeTrue();
        test.andSearchCriteriaShouldBeFalse();
        test.orSearchCriteriaShouldBeTrue();
        test.orSearchCriteriaShouldBeFalse();
        test.shouldReturnListBySearchCriteriaAnd1();
        test.shouldReturnListBySearchCriteriaAnd2();
        test.shouldReturnListBySearchCriteriaOr1();
        test.shouldReturnListBySearchCriteriaOr2();
    }

    Book bookOne = new Book("George Orwell", "1984", "1991");
    Book bookTwo = new Book("Ethel Lilian Voynich", "An Interrupted Friendship", "1968");
    Book bookThree = new Book("Ethel Lilian Voynich", "The Gadfly", "1968");
    Book bookFour = new Book("Test", "1984", "1968");


    public void shouldSearchByAuthorTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        victim.bookList.add(bookOne);
        check(authorSearchCriteria.match(bookOne), "shouldSearchByAuthorTrue");
    }

    public void shouldSearchByAuthorFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        victim.bookList.add(bookTwo);
        check(!authorSearchCriteria.match(bookTwo), "shouldSearchByAuthorFalse");
    }

    public void shouldSearchByTitleTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        victim.bookList.add(bookOne);
        check(titleSearchCriteria.match(bookOne), "shouldSearchByTitleTrue");
    }

    public void shouldSearchByTitleFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        victim.bookList.add(bookTwo);
        check(!titleSearchCriteria.match(bookTwo), "shouldSearchByTitleFalse");
    }

    public void shouldSearchByYearOfIssueTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        victim.bookList.add(bookOne);
        check(yearOfIssueSearchCriteria.match(bookOne), "shouldSearchByYearOfIssueTrue");
    }

    public void shouldSearchByYearOfIssueFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        victim.bookList.add(bookTwo);
        check(!yearOfIssueSearchCriteria.match(bookTwo), "shouldSearchByYearOfIssueFalse");
    }

    public void andSearchCriteriaShouldBeTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.bookList.add(bookOne);
        check(andSearchCriteria.match(bookOne), "andSearchCriteriaShouldBeTrue");
    }

    public void andSearchCriteriaShouldBeFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.bookList.add(bookFour);
        check(!andSearchCriteria.match(bookFour), "andSearchCriteriaShouldBeFalse");
    }

    public void orSearchCriteriaShouldBeTrue() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.bookList.add(bookFour);
        check(orSearchCriteria.match(bookFour), "orSearchCriteriaShouldBeTrue");
    }

    public void orSearchCriteriaShouldBeFalse() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria orSearchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.bookList.add(bookTwo);
        check(!orSearchCriteria.match(bookTwo), "orSearchCriteriaShouldBeFalse");
    }

    public void shouldReturnListBySearchCriteriaAnd1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("George Orwell");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("1984");
        SearchCriteria andSearchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        List<Book> actualList = victim.find(andSearchCriteria1);
        List<Book> expectedList = new ArrayList<>() {{
            add(bookOne);
        }};
        check(actualList.equals(expectedList), "shouldReturnListBySearchCriteriaAnd1");
    }

    public void shouldReturnListBySearchCriteriaAnd2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Ethel Lilian Voynich");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1968");
        SearchCriteria andSearchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        List<Book> actualList = victim.find(andSearchCriteria2);
        List<Book> expectedList = new ArrayList<>() {{
            add(bookTwo);
            add(bookThree);
        }};
        check(actualList.equals(expectedList), "shouldReturnListBySearchCriteriaAnd2");
    }

    public void shouldReturnListBySearchCriteriaOr1() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Ethel Lilian Voynich");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1968");
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        List<Book> actualList = victim.find(orSearchCriteria1);
        List<Book> expectedList = new ArrayList<>() {{
            add(bookTwo);
            add(bookThree);
            add(bookFour);
        }};
        check(actualList.equals(expectedList), "shouldReturnListBySearchCriteriaOr1");
    }

    public void shouldReturnListBySearchCriteriaOr2() {
        BookDatabaseImpl victim = new BookDatabaseImpl();
        victim.bookList.clear();
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Ethel Lilian Voynich");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1991");
        SearchCriteria orSearchCriteria1 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        victim.bookList.add(bookOne);
        victim.bookList.add(bookTwo);
        victim.bookList.add(bookThree);
        victim.bookList.add(bookFour);
        List<Book> actualList = victim.find(orSearchCriteria1);
        List<Book> expectedList = new ArrayList<>() {{
            add(bookOne);
            add(bookTwo);
            add(bookThree);
        }};
        check(actualList.equals(expectedList), "shouldReturnListBySearchCriteriaOr2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
