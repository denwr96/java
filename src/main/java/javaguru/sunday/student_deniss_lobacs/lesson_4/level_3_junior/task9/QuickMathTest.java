package javaguru.sunday.student_deniss_lobacs.lesson_4.level_3_junior.task9;
import  javaguru.sunday.student_deniss_lobacs.lesson_4.level_1_intern.task1.QuickMath;
import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Весь QuickMath нужно было уместить в одном классе")
public class QuickMathTest {

    public static void main(String[] args) {
        QuickMathTest quickMathTest = new QuickMathTest();
        quickMathTest.test1();
        quickMathTest.test2();
        quickMathTest.test3();
        quickMathTest.test4();
    }

    public void test1() {
        QuickMath victim = new QuickMath();
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        String expectedResult = "increasing";
        String actualResult = victim.Compare(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test1");
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int numberOne = 3;
        int numberTwo = 2;
        int numberThree = 1;
        String expectedResult = "decreasing";
        String actualResult = victim.Compare(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test2");
    }

    public void test3() {
        QuickMath victim = new QuickMath();
        int numberOne = 4;
        int numberTwo = 2;
        int numberThree = 3;
        String expectedResult = "Neither increasing or decreasing order";
        String actualResult = victim.Compare(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test3");
    }

    public void test4() {
        QuickMath victim = new QuickMath();
        int numberOne = 3;
        int numberTwo = 2;
        int numberThree = 1;
        String expectedResult = "increasing";
        String actualResult = victim.Compare(numberOne , numberTwo , numberThree);
        check(expectedResult, actualResult, "Test4");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
}


