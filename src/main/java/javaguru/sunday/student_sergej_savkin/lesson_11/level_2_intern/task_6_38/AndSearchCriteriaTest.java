package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task19

class AndSearchCriteriaTest {

    public static void main(String[] args) {
        AndSearchCriteriaTest andSearchCriteriaTest = new AndSearchCriteriaTest();
        andSearchCriteriaTest.matchTest();
    }

    public void matchTest() {
       AndSearchCriteria test = new AndSearchCriteria(new AuthorSearchCriteria("Pushkin"), new TitleSearchCriteria("Pikovaja Dama"));
       check(test.match(new Book("Pushkin", "Pikovaja Dama")), "matchTest");
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
