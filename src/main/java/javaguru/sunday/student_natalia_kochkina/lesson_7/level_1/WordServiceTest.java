package main.java.javaguru.sunday.student_natalia_kochkina.lesson_7.level_1;

//Task_1
//Task_2
//Task_3

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldReturnArrayOfWords();
        wordServiceTest.shouldReturnNumberOfRepeats();
        wordServiceTest.shouldReturnMostRepeatedWord();
        wordServiceTest.shouldFindTheMostRepeatedWordTest();
        wordServiceTest.shouldFindTheMostRepeatedWordTest2();
    }

    public void shouldReturnArrayOfWords() {
        WordService wordService = new WordService();
        String[] arrayOfStrings = wordService.splitTheArray("здесь должен, быть! какой-то текст здесь.");
        String[] expectedArray = {"здесь", "должен", "быть","какой-то", "текст", "здесь"};
        if (Arrays.equals(arrayOfStrings, expectedArray)) {
            System.out.println("ShouldReturnArrayOfWordsTest OK");
        } else {
            System.out.println("ShouldReturnArrayOfWordsTest FAILED");
        }
    }

    public void shouldReturnNumberOfRepeats() {
        WordService wordService = new WordService();
        String[] arrayOfStrings = {"почему", "здесь", "должен", "быть","какой-то", "текст", "здесь"};
        int[] numbersOfRepeat = wordService.numberOfRepeats(arrayOfStrings);
        int[] expectedArray = {1, 2, 1, 1, 1, 1, 2};
        if (Arrays.equals(numbersOfRepeat, expectedArray)) {
            System.out.println("ShouldReturnNumberOfRepeatsTest OK");
        } else {
            System.out.println("ShouldReturnNumberOfRepeatsTest FAILED");
        }
    }

    public void shouldReturnMostRepeatedWord() {
        WordService wordService = new WordService();
        String[] arrayOfWords = {"должен", "здесь", "быть","какой-то", "текст", "здесь", "текст"};
        int[] numberOfRepeats = {1, 2, 1, 1, 2, 2, 2};
        String mostRepeatedWord = wordService.theMostRepeatedWord(arrayOfWords, numberOfRepeats);
        if (mostRepeatedWord.equals("здесь")) {
            System.out.println("ShouldReturnMostRepeatedWordTest OK");
        } else {
            System.out.println("ShouldReturnMostRepeatedWordTest FAILED");
        }
    }

    public void shouldFindTheMostRepeatedWordTest() {
        WordService wordService = new WordService();
        String text = "PS: если вы не можете придумать как разбить эту задачу на подзадачи,\n" +
                "пожалуйста попросите помощи! Умение попросить помощи, когда это нужно\n" +
                "навес золота в ИТ.";
        String theMostRepeatedWord = wordService.findTheMostRepeatedWord(text);
        if (theMostRepeatedWord.equals("помощи")) {
            System.out.println("ShouldFindTheMostRepeatedWordTest OK");
        } else {
            System.out.println("ShouldFindTheMostRepeatedWordTest FAILED");
        }

    }

    public void shouldFindTheMostRepeatedWordTest2() {
        WordService wordService = new WordService();
        String text = "1, 2, 3, 4, 5";
        String theMostRepeatedWord = wordService.findTheMostRepeatedWord(text);
        if (theMostRepeatedWord.equals("1")) {
            System.out.println("ShouldFindTheMostRepeatedWordTest2 OK");
        } else {
            System.out.println("ShouldFindTheMostRepeatedWordTest2 FAILED");
        }

    }
}
