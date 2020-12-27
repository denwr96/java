package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

class TitleSearchCriteriaTest {
    public static void main(String[] args) {
        TitleSearchCriteriaTest test = new TitleSearchCriteriaTest();
        test.titleSearchCriteriaTest();
    }

    Book book1 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");

    public void titleSearchCriteriaTest(){
        SearchCriteria victim = new TitleSearchCriteria("The Adventures of Tom Sawyer");
        boolean result = victim.match(book1);
        testResult(result, "titleSearchCriteriaTest");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}

