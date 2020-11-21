package main.java.javaguru.sunday.student_kristina_sutugina.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.split();
        wordServiceTest.countOfWords();
    }
    public void split(){
        WordService wordService = new WordService();
        String testText = "Welcome to the Paris!";
        String [] result = wordService.split(testText);
        String [] expectedResult = {"Welcome", "to", "the", "Paris!"};
        check(expectedResult,result, "split");
    }
    public void countOfWords(){
        WordService wordService = new WordService();
        String testText = "Paris that my in the spring.Not that is related.";
        String [] result = wordService.split(testText);
        String words = wordService.countOfWords(result);
        String expectedResult = "that";
        check2(expectedResult, words, "countOfWords");

    }
    public void check(String [] expectedResult, String [] actualResult, String tesName) {
        if (Arrays.equals(expectedResult,actualResult)) {
            System.out.println(tesName + " test passed.");
        } else {
            System.out.println(tesName + " test failed.");
        }
    }
    public void check2(String expectedResult, String actualResult, String tesName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(tesName + " test passed.");
        } else {
            System.out.println(tesName + " test failed.");
        }
    }
}
