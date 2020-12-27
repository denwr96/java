package javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_1;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Objects;

@CodeReview(approved = true)
class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.getTextTest();
        test.findMostFrequentWordTest();
    }

    public void getTextTest(){
        WordService victim = new WordService();
        String textFromUser = "i love you so much";
        String[] textExpected = {"i", "love", "you", "so", "much"};
        String[] textActual = victim.splitText(textFromUser);
        testResult(textExpected, textActual, "getTextTest");
    }

    public void findMostFrequentWordTest(){
        WordService victim = new WordService();
        String textFromUser = "I bought two books: a new book and an old book The new book was more expensive than the old book";
        String[] text;
        String delimeter = " ";
        text = textFromUser.split(delimeter);
        String expectedResult = "book";
        String actualResult = victim.findMostFrequentWord(text);
        testResult(expectedResult, actualResult, "findMostFrequentWordTest");
    }

    public void testResult (String [] myArrayExpected, String [] myArrayActual, String testName) {
        if (Arrays.equals(myArrayExpected, myArrayActual)) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }

    public void testResult(String actualResult, String expectedResult, String testName) {
        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }
}
