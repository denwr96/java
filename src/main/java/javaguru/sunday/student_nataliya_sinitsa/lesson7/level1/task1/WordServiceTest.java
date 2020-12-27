package javaguru.sunday.student_nataliya_sinitsa.lesson7.level1.task1;

// Task 1 --> Task 3

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.shouldSplitTextToStringArray();
        test.shouldFindWordFrequency();
        test.shouldFindMostFrequentWordPosition();
        test.shouldFindMostFrequentWord1();
        test.shouldFindMostFrequentWord2();
    }

    public void shouldSplitTextToStringArray() {
        WordService victim = new WordService();
        String text = "a well a everybody is heard about the bird bird bird is the word";
        String[] actualArray = victim.words(text);
        String[] expectedArray = {"a", "well", "a", "everybody", "is", "heard", "about", "the", "bird", "bird",
                "bird", "is", "the", "word"};
        check(Arrays.equals(actualArray, expectedArray), "shouldSplitTextToStringArray");
    }


    public void shouldFindWordFrequency() {
        WordService victim = new WordService();
        String text = "a well a everybody is heard about the bird bird bird is the word";
        String[] testArray = victim.words(text);
        int[] actualWordFrequency = victim.wordFrequencyArray(testArray);
        int[] expectedWordFrequency = {2, 1, 2, 1, 2, 1, 1, 2, 3, 3, 3, 2, 2, 1};
        check(Arrays.equals(actualWordFrequency, expectedWordFrequency), "shouldFindWordFrequency");
    }

    public void shouldFindMostFrequentWordPosition() {
        WordService victim = new WordService();
        String text = "a well a everybody is heard about the bird bird bird is the word";
        String[] testArray = victim.words(text);
        int[] wordFrequency = victim.wordFrequencyArray(testArray);
        int actualMostFrequentWordPosition = victim.mostFrequentWordPosition(wordFrequency);
        int expectedMostFrequentWordPosition = 8;
        check(actualMostFrequentWordPosition == expectedMostFrequentWordPosition,
                "shouldFindMostFrequentWordPosition");
    }

    public void shouldFindMostFrequentWord1() {
        WordService victim = new WordService();
        String text = "a well a everybody is heard about the bird bird bird is the word";
        String actualMostFrequentWord = victim.findMostFrequentWord(text);
        String expectedMostFrequentWord = "bird";
        check(actualMostFrequentWord.equals(expectedMostFrequentWord), "shouldFindMostFrequentWord1");
    }

    public void shouldFindMostFrequentWord2() {
        WordService victim = new WordService();
        String text = "a well a everybody is heard about the bird bird bird is the word word word";
        String actualMostFrequentWord = victim.findMostFrequentWord(text);
        String expectedMostFrequentWord = "bird";
        check(actualMostFrequentWord.equals(expectedMostFrequentWord), "shouldFindMostFrequentWord2");
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
