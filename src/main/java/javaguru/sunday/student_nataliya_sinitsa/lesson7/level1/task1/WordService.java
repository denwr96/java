package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson7.level1.task1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

// Task 1 --> Task 8
@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо, только метод words плохо назван. Он должен называться в соответствии с тем" +
        "что он делает.")
class WordService {

    public String findMostFrequentWord(String text) {
        WordService wordService = new WordService();
        String[] words = wordService.words(text);
        int[] wordFrequencyArray = wordService.wordFrequencyArray(words);
        int mostFrequentWordPosition = wordService.mostFrequentWordPosition(wordFrequencyArray);
        return words[mostFrequentWordPosition];
    }

    public String[] words(String text) {
        return text.split("\\s");
    }

    public int[] wordFrequencyArray(String[] words) {
        int[] wordFrequencyArray = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int wordFrequency = 0;
            for (String word : words) {
                if (words[i].equals(word)) {
                    wordFrequency = wordFrequency + 1;
                    wordFrequencyArray[i] = wordFrequency;
                }
            }
        }
        return wordFrequencyArray;
    }

    public int mostFrequentWordPosition(int[] wordFrequencyArray) {
        int mostFrequentWordPosition = 0;
        int maxFrequency = 1;
        for (int i = 1; i < wordFrequencyArray.length; i++) {
            if (wordFrequencyArray[i] > maxFrequency) {
                mostFrequentWordPosition = i;
                maxFrequency = wordFrequencyArray[i];
            }
        }
        return mostFrequentWordPosition;
    }

}