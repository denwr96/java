package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

//task16

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class AuthorSearchCriteriaTest {

    public static void main(String[] args) {
        AuthorSearchCriteriaTest authorSearchCriteriaTest = new AuthorSearchCriteriaTest();
        authorSearchCriteriaTest.matchTest();
    }

    public void matchTest(){
        AuthorSearchCriteria test = new AuthorSearchCriteria("Pushkin");
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
