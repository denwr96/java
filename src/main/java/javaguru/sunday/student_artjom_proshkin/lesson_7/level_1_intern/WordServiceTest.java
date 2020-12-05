package main.java.javaguru.sunday.student_artjom_proshkin.lesson_7.level_1_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.splitTextToWordsTest();
        test.countWordFrequencyTest();
        test.findMaxRepeatWordPositionTest();
        test.findMostFrequentWordTest();

    }

    WordService victim = new WordService();

    void splitTextToWordsTest() {
        String text = "I am Groot!";
        String[] expected = {"I", "am", "Groot"};
        String[] actual = victim.splitTextToWords(text);
        checkResult(expected, actual, "splitTextToWordsTest");

    }

    void countWordFrequencyTest() {
        String[] wordArray = {"I", "am", "am", "Groot", "am"};
        int[] expected = {1, 3, 3, 1, 3};
        int[] actual = victim.countWordFrequency(wordArray);
        checkResult(expected, actual, "countWordTest");
    }

    void findMaxRepeatWordPositionTest() {
        String[] wordArray = {"I", "am", "am", "Groot", "am"};
        int[] wordCountArray = victim.countWordFrequency(wordArray);
        int expected = 1;   // "am"
        int actual = victim.findMaxRepeatWordPosition(wordCountArray);
        checkResult(expected, actual, "findMaxRepeatWordPositionTest");

    }

    void findMostFrequentWordTest() {
        String text = "I am Groot Groot Rocket, Groot man I am cute Groot!";
        String actual = victim.findMostFrequentWord(text);
        String expected = "Groot";
        checkResult(expected,actual,"findMostFrequentWordTest");
    }


    void checkResult(String[] expected, String[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + (Arrays.toString(expected)) + "; Actual = " + (Arrays.toString(actual)) + "; " + testName);
        }
    }

    void checkResult(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + (Arrays.toString(expected)) + "; Actual = " + (Arrays.toString(actual)) + "; " + testName);
        }
    }

    void checkResult(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + expected + "; Actual = " + actual + "; " + testName);
        }
    }
    void checkResult(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println(testName + " PASSED!");
        } else {
            System.out.println(testName + " FAILED!");
            System.out.println("Expected = " + expected + "; Actual = " + actual + "; " + testName);
        }
    }
}
