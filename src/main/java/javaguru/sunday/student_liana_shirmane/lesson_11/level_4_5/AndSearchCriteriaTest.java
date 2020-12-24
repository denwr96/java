package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5;


public class AndSearchCriteriaTest {
    public static void main(String[] args) {
        AndSearchCriteriaTest andSearchCriteriaTest = new AndSearchCriteriaTest();
        andSearchCriteriaTest.shouldFind();
        andSearchCriteriaTest.shouldNotFind();
    }

    Book book1 = new Book("Lev Tolstoy", "Voina i mir", "1867");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833");

    void shouldFind(){
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("Aleksandr Pushkin"), new TitleSearchCriteria("Evgeniy Onegin"));
        boolean actualResult = victim.match(book2);
        check(true, actualResult, "Find both conditions");
    }

    void shouldNotFind(){
        AndSearchCriteria victim = new AndSearchCriteria(new AuthorSearchCriteria("Aleksandr Pushkin"), new TitleSearchCriteria("Evgeniy Onegin"));
        boolean actualResult = victim.match(book1);
        check(false, actualResult, "Doesn't find both conditions");
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
