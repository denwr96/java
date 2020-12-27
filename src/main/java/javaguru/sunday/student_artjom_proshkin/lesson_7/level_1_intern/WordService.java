package javaguru.sunday.student_artjom_proshkin.lesson_7.level_1_intern;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было regex взять по проще =) Только буквы выбрать")
class WordService {

    String findMostFrequentWord(String text) {
        String[] wordArray = splitTextToWords(text);
        int[] wordCountArray = countWordFrequency(wordArray);
        int maxRepeatWordPosition = findMaxRepeatWordPosition(wordCountArray);
        return wordArray[maxRepeatWordPosition];
    }

    String[] splitTextToWords(String text) {
        return text.split("[.,!? /+:=;0\n123456\\s7\"8|9*#$%^&()_<>-]");

    }

    int[] countWordFrequency(String[] wordArray) {
        int[] wordCountArray = new int[wordArray.length];
        for (int i = 0; i < wordArray.length; i++) {
            int wordCounter = 0;
            for (String word : wordArray) {
                if (wordArray[i].equals(word)) {
                    wordCounter++;
                    wordCountArray[i] = wordCounter;
                }
            }
        }
        return wordCountArray;
    }

    int findMaxRepeatWordPosition(int[] wordCountArray) {
        int maxRepeatWordPosition = 0;
        int min = 1;
        for (int i = 1; i < wordCountArray.length; i++) {
            if (wordCountArray[i] > min) {
                maxRepeatWordPosition = i;
                min = wordCountArray[i];
            }
        }
        return maxRepeatWordPosition;
    }
}
