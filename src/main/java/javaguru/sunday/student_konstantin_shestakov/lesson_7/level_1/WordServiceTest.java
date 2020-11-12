package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_7.level_1;

// Task 2-3

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.textToArrayTest();
        wordServiceTest.checkForRepeatWordsAndCountRepeatsTest();
        wordServiceTest.wordServiceTest1();
        wordServiceTest.wordServiceTest2();
        wordServiceTest.wordServiceTest3();
    }

    WordService wordService = new WordService();

    void textToArrayTest() {
        String text = "один, два, три";
        String[] textArray = text.split("[ ~!@#$%^&*()_+`1234567890-={}:;'|<>,./?]");
        String[] expectedResult = {"один","", "два","", "три"};
        checkResults(Arrays.equals(textArray, expectedResult), "Text to text array test");
        System.out.println();
    }

    void checkForRepeatWordsAndCountRepeatsTest() {
        String[] textArray = {"один", "два", "три", "один"};
        String expectedResult = "один";
        checkResults((wordService.checkForRepeatWordsAndCountRepeats(textArray).equals(expectedResult)), "Check for most repeat word test");
        System.out.println();
    }

    void wordServiceTest1() {
        String expectedResult = "I";
        checkResults(wordService.findMostFrequentWord("Me? I know who I am. I'm a dude playing a dude disguised as another dude.").equals(expectedResult), "Word service test 1 (priority for first encountered repeat word)");
        System.out.println();
    }

    void wordServiceTest2() {
        String expectedResult = "dude";
        checkResults(wordService.findMostFrequentWord("Me? I know who I am. I'm a dude playing a dude disguised as another dude, dude.").equals(expectedResult), "Word service test 2");
        System.out.println();
    }

    void wordServiceTest3() {
        String expectedResult = "N/A";
        checkResults(wordService.findMostFrequentWord("один, два, три, четыре, пять").equals(expectedResult), "Word service test 3 (no repeat words)");
        System.out.println();
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition;
        } else {
            System.out.println(testName + " = FAIL");
            return !condition;
        }
    }
}
