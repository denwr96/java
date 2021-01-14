package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;


import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteriaTest {
    public static void main(String[] args) {
        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.shouldMatchAuthor();
        authorSearchCriteriaTest.shouldNotMatchAuthor();
    }

    Book book1 = new Book("Lev Tolstoy", "Voina i mir", "1867");
    Book book2 = new Book("Aleksandr Pushkin", "Evgeniy Onegin", "1833");


    void shouldMatchAuthor() {
        AuthorSearchCriteria victim = new AuthorSearchCriteria("Aleksandr Pushkin");
        boolean actualResult = victim.match(book2);
        check(true, actualResult, "Find author");
    }

    void shouldNotMatchAuthor() {
        AuthorSearchCriteria victim = new AuthorSearchCriteria("Aleksandr Pushkin");
        boolean actualResult = victim.match(book1);
        check(false, actualResult, "Doesn't find author");
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
