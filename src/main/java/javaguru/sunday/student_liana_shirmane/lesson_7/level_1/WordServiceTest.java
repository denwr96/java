package javaguru.sunday.student_liana_shirmane.lesson_7.level_1;



import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.checkArray();
        test.shouldFindWordAndCount();
        test.shouldFindMostFrequentWord();

    }
    public void checkArray() {
        WordService test = new WordService();
        String[] actualResult = test.splitText("test some new text, test will pass or test will fail");
        String[] expectedResult = {"fail", "new", "or", "pass", "some", "test", "test", "test", "text", "will", "will"};
        check(expectedResult, actualResult, "check Array test");
    }

 public void shouldFindWordAndCount() {
     WordService test = new WordService();
     String[] words = {"fail", "new", "or", "pass", "some", "test", "test", "test", "text", "will", "will"};
     String expectedResult = ("test");
     String actualResult = test.findPopularWordAndCountIt(words);
     check(expectedResult, actualResult, "Most frequently word test");
 }

public void shouldFindMostFrequentWord(){
    WordService test = new WordService();
    String text = ("test some new text, test will pass or test will fail");
    String expectedResult = "test";
    String actualResult = test.findMostFrequentWord(text);
    check(actualResult, expectedResult, "Main test");
}
    public void check(String[] expectedResult, String[] actualResult, String testName) {
        if ((Arrays.equals(expectedResult, actualResult))) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
    public void check(int[] expectedResult, int[] actualResult, String testName) {
        if ((Arrays.equals(expectedResult, actualResult))) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }
    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}

