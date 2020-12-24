package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5;


public class YearOfIssueSearchCriteriaTest {
    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest yearOfIssueSearchCriteriaTest = new YearOfIssueSearchCriteriaTest();
        yearOfIssueSearchCriteriaTest.shouldMatchYear();
        yearOfIssueSearchCriteriaTest.shouldNotMatchYear();
    }

    Book book1 = new Book("Lev Tolstoy", "Voina i mir", "1867");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833");

    void shouldMatchYear(){
        YearOfIssueSearchCriteria victim = new YearOfIssueSearchCriteria("1867");
        boolean actualResult = victim.match(book1);
        check(true, actualResult, "Find year");
    }

    void shouldNotMatchYear(){
        YearOfIssueSearchCriteria victim = new YearOfIssueSearchCriteria("1867");
        boolean actualResult = victim.match(book2);
        check(false, actualResult, "Doesn't find year");
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

}