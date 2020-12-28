package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;

public class TitleSearchCriteriaTest {
    public static void main(String[] args) {
        TitleSearchCriteriaTest titleSearchCriteriaTest = new TitleSearchCriteriaTest();
        titleSearchCriteriaTest.shouldMatchTitle();
        titleSearchCriteriaTest.shouldNotMatchTitle();
    }

    Book book1 = new Book("Aleksandr Pushkin", "Kapitanskaya dochka", "1836");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833");

    void shouldMatchTitle() {
        TitleSearchCriteria victim = new TitleSearchCriteria("Evgeniy Onegin");
        boolean actualResult = victim.match(book2);
        check(true, actualResult, "Find title");
    }

    void shouldNotMatchTitle() {
        TitleSearchCriteria victim = new TitleSearchCriteria("Evgeniy Onegin");
        boolean actualResult = victim.match(book1);
        check(false, actualResult, "Doesn't find title");
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
