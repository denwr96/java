package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

public class YearOfIssueSearchCriteriaTest {
    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest test = new YearOfIssueSearchCriteriaTest();
        test.yearOfIssueSearchCriteriaTest();
    }

    Book book1 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");

    public void yearOfIssueSearchCriteriaTest(){
        SearchCriteria victim = new YearOfIssueSearchCriteria("2000");
        boolean result = victim.match(book1);
        testResult(result, "yearOfIssueSearchCriteriaTest");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
