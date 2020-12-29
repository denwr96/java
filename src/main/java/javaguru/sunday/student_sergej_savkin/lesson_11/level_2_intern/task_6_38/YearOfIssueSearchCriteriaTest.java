package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task18


class YearOfIssueSearchCriteriaTest {

    public static void main(String[] args) {
        YearOfIssueSearchCriteriaTest yearOfIssueSearchCriteriaTest = new YearOfIssueSearchCriteriaTest();
        yearOfIssueSearchCriteriaTest.matchTest();
    }

    public void matchTest(){
        YearOfIssueSearchCriteria test = new YearOfIssueSearchCriteria("1820");
        Book book = new Book("Pushkin", "Pikovaja Dama");
        book.setYearOfIssue("1820");
        check(test.match(book), "matchTest");
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
