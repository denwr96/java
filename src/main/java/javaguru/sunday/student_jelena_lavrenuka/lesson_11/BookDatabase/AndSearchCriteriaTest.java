package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;

class AndSearchCriteriaTest {
    public static void main(String[] args) {
        AndSearchCriteriaTest test = new AndSearchCriteriaTest();
        test.andSearchCriteriaTest();
    }

    Book book1 = new Book("Mark Twain", "The Adventures of Tom Sawyer", "2000");
    SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Mark Twain");
    SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Adventures of Tom Sawyer");
    SearchCriteria yearOfTheIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");

    public void andSearchCriteriaTest(){
        SearchCriteria victim = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        boolean result = victim.match(book1);
        testResult(result, "andSearchCriteriaTest");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
