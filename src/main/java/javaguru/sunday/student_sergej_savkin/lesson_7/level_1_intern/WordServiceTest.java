package javaguru.sunday.student_sergej_savkin.lesson_7.level_1_intern;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.convertStringToWordArrayTest();
        wordServiceTest.findMostCommonWordTest();
        wordServiceTest.wordsRepeatTimesTest();
        wordServiceTest.findMostFrequentWordTest();

    }

    public void convertStringToWordArrayTest(){
        WordService test = new WordService();
        String[] expectedResult = {"Have", "a", "nice", "day"};
        check(expectedResult, test.convertStringToWordArray("Have a nice day"), "convertStringToWordArrayTest");
    }

    public void findMostCommonWordTest(){
        WordService test = new WordService();
        String expectedResult = "name";
        check(expectedResult, test.findMostCommonWord(test.convertStringToWordArray("Hello! My name name is Sergej"), test.findWordsRepeatTimes(test.convertStringToWordArray("Hello! My name name is Sergej"))), "findMostCommonWordTest");
    }

    public void wordsRepeatTimesTest(){
        WordService test = new WordService();
        int[] expectedResult = {2, 2, 1, 1};
        check(expectedResult, test.findWordsRepeatTimes(test.convertStringToWordArray("hello hello my name")), "wordsRepeatTimesTest");
    }

    public void findMostFrequentWordTest(){
        WordService test = new WordService();
        String expectedResult = "name";
        check(expectedResult, test.findMostFrequentWord("Hello! My name name is Sergej"), "findMostFrequentWordTest");
    }

    public void check(String expectedResult, String actualResult, String testName){
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(int[] expectedResult, int[] actualResult, String testName) {
        if(Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(String[] expectedResult, String[] actualResult, String testName){
        if (Arrays.deepEquals(expectedResult, actualResult)) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}

