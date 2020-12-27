package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior;

import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_2_intern.Book;
import javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_3_junior.search_criteria.*;
// task15 - task20
public class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest searchCriteriaTest = new SearchCriteriaTest();
        searchCriteriaTest.authorSearchCriteriaMatchBookTestShouldBeOk();
        searchCriteriaTest.authorSearchCriteriaMatchBookTestShouldBeFail();
        searchCriteriaTest.titleSearchCriteriaMatchBookTestShouldBeOk();
        searchCriteriaTest.titleSearchCriteriaMatchBookTestShouldBeFail();
        searchCriteriaTest.yearOfIssueSearchCriteriaMatchBookTestShouldBeOk();
        searchCriteriaTest.yearOfIssueSearchCriteriaMatchBookTestShouldBeFail();
        searchCriteriaTest.andSearchCriteriaMatchBookTestShouldBeOk();
        searchCriteriaTest.andSearchCriteriaMatchBookTestShouldBeFail();
        searchCriteriaTest.orSearchCriteriaMatchBookTestShouldBeOk();
        searchCriteriaTest.orSearchCriteriaMatchBookTestShouldBeFail();
    }

    public void authorSearchCriteriaMatchBookTestShouldBeOk() {
        SearchCriteria searchMatches = new AuthorSearchCriteria("Alex Pushkin");
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin")), "authorSearchCriteriaMatchBookTestShouldBeOk");
    }

    public void authorSearchCriteriaMatchBookTestShouldBeFail() {
        SearchCriteria searchMatches = new AuthorSearchCriteria("Alex Pushkin");
        checkResults(searchMatches.match(new Book("Ivan Petrov", "Eugene Onegin")), "authorSearchCriteriaMatchBookTestShouldBeFail");
    }

    public void titleSearchCriteriaMatchBookTestShouldBeOk() {
        SearchCriteria searchMatches = new TitleSearchCriteria("Eugene Onegin");
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin")), "titleSearchCriteriaMatchBookTestShouldBeOk");
    }

    public void titleSearchCriteriaMatchBookTestShouldBeFail() {
        SearchCriteria searchMatches = new TitleSearchCriteria("Eugene Onegin");
        checkResults(searchMatches.match(new Book("Alexander Pushkin", "War and Peace")), "titleSearchCriteriaMatchBookTestShouldBeFail");
    }

    public void yearOfIssueSearchCriteriaMatchBookTestShouldBeOk() {
        SearchCriteria searchMatches = new YearOfIssueSearchCriteria("2020");
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2020")), "yearOfIssueSearchCriteriaMatchBookTestShouldBeOk");
    }

    public void yearOfIssueSearchCriteriaMatchBookTestShouldBeFail() {
        SearchCriteria searchMatches = new YearOfIssueSearchCriteria("2020");
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2000")), "yearOfIssueSearchCriteriaMatchBookTestShouldBeFail");
    }

    public void andSearchCriteriaMatchBookTestShouldBeOk() {
        SearchCriteria authorSearchMatches = new AuthorSearchCriteria("Alex Pushkin");
        SearchCriteria yearOfIssueSearchMatches = new YearOfIssueSearchCriteria("2020");
        SearchCriteria searchMatches = new AndSearchCriteria(authorSearchMatches , yearOfIssueSearchMatches);
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2020")), "andSearchCriteriaMatchBookTestShouldBeOk");
    }

    public void andSearchCriteriaMatchBookTestShouldBeFail() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Alex Pushkin");
        SearchCriteria yearOfIssueSearchMatches = new YearOfIssueSearchCriteria("2020");
        SearchCriteria searchMatches = new AndSearchCriteria(authorSearchCriteria , yearOfIssueSearchMatches);
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2000")), "andSearchCriteriaMatchBookTestShouldBeFail");
    }

    public void orSearchCriteriaMatchBookTestShouldBeOk() {
        SearchCriteria authorSearchMatches = new AuthorSearchCriteria("Alex Petrov");
        SearchCriteria yearOfIssueSearchMatches = new YearOfIssueSearchCriteria("2020");
        SearchCriteria searchMatches = new OrSearchCriteria(authorSearchMatches , yearOfIssueSearchMatches);
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2020")), "orSearchCriteriaMatchBookTestShouldBeOk");
    }

    public void orSearchCriteriaMatchBookTestShouldBeFail() {
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Alex Petrov");
        SearchCriteria yearOfIssueSearchMatches = new YearOfIssueSearchCriteria("2020");
        SearchCriteria searchMatches = new OrSearchCriteria(authorSearchCriteria , yearOfIssueSearchMatches);
        checkResults(searchMatches.match(new Book("Alex Pushkin", "Eugene Onegin", "2000")), "orSearchCriteriaMatchBookTestShouldBeFail");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return true;
        }
    }
}
