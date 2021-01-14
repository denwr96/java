package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest test = new AuthorSearchCriteriaTest();
        test.authorSearchCriteriaTest();
    }

    Book book1 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");

    public void authorSearchCriteriaTest(){
        SearchCriteria victim = new AuthorSearchCriteria("Mark Twain");
        boolean result = victim.match(book1);
        testResult(result, "authorSearchCriteriaTest");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
