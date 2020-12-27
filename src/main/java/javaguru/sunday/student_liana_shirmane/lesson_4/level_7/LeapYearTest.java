package javaguru.sunday.student_liana_shirmane.lesson_4.level_7;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();
        leapYearTest.test2();
        leapYearTest.test3();
        leapYearTest.test4();
    }
    public void test1(){
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(4), "leap year as dividable by 4");
    }
    public void test2(){
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(7), "regular year as not dividable by 4");
    }
    public void test3(){
        LeapYear leapYear = new LeapYear();
        checkResults(!leapYear.isLeapYear(1970), "regular year as dividable by 100 and not dividable by 4");
    }
    public void test4(){
        LeapYear leapYear = new LeapYear();
        checkResults(leapYear.isLeapYear(2000), "leap year as dividable by 100 and by 400");
    }
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
