package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task_17


class TitleToSearchCriteriaTest {
    public static void main(String[] args) {

        TitleToSearchCriteriaTest titleToSearchCriteriaTest = new TitleToSearchCriteriaTest();
        titleToSearchCriteriaTest.matchTest();
    }

    public void matchTest(){
        TitleSearchCriteria test = new TitleSearchCriteria("Evgenij Onegin");
        check(test.match(new Book("Pushkin", "Evgenij Onegin")), "matchTest");
    }

    public void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
