package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5;


public class OrSearchCriteriaTest {
    public static void main(String[] args) {
        OrSearchCriteriaTest orSearchCriteriaTest = new OrSearchCriteriaTest();
        orSearchCriteriaTest.shouldFind();
        orSearchCriteriaTest.shouldNotFind();
    }

    Book book1 = new Book("Lev Tolstoy", "Voina i mir", "1867");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833");

    void shouldFind(){
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("Aleksandr Pushkin"), new TitleSearchCriteria("Kapitanskaya dochka"));
        boolean actualResult = victim.match(book2);
        check(true, actualResult, "Find one of the conditions");
    }

    void shouldNotFind(){
        OrSearchCriteria victim = new OrSearchCriteria(new AuthorSearchCriteria("Aleksandr Pushkin"), new TitleSearchCriteria("Kapitanskaya dochka"));
        boolean actualResult = victim.match(book1);
        check(false, actualResult, "Doesn't find one of the conditions");
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
