package main.java.javaguru.sunday.student_sergej_savkin.lesson_7.level_1_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
//Task1
//Task2
//Task3

@CodeReview(approved = true)
class WordService {

    public String findMostFrequentWord(String text) {
        return findMostCommonWord(convertStringToWordArray(text), findWordsRepeatTimes(convertStringToWordArray(text)));
    }

    public String[] convertStringToWordArray(String text) {
        return text.split("[.,?! ]");
    }

    public int[] findWordsRepeatTimes(String[] arrayOfWords) {
        int[] wordRepeatTimes = new int[arrayOfWords.length];
        for (int i = 0; i < arrayOfWords.length; i++) {
            for (String arrayOfWord : arrayOfWords) {
                if (arrayOfWords[i].equals(arrayOfWord)) {
                    wordRepeatTimes[i] = wordRepeatTimes[i] + 1;
                }
            }
        }
        return wordRepeatTimes;
    }

    public String findMostCommonWord(String[] arrayOfWords, int[] wordRepeatTimes){
        int maxRepeatTime = 0;
        for (int i = 0; i < wordRepeatTimes.length; i++) {
            if (wordRepeatTimes[maxRepeatTime] < wordRepeatTimes[i]) {
                maxRepeatTime = i;
            }
        }
        return arrayOfWords[maxRepeatTime];
    }

}
