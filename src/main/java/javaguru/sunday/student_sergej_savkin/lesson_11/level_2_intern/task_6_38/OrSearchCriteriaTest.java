package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task20


class OrSearchCriteriaTest {

    public static void main(String[] args) {
        OrSearchCriteriaTest orSearchCriteriaTest = new OrSearchCriteriaTest();
        orSearchCriteriaTest.matchTest();
    }

    public void matchTest() {
        OrSearchCriteria test = new OrSearchCriteria(new TitleSearchCriteria("Pikovaja Dama"), new AuthorSearchCriteria("Tolstoj"));
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
