package main.java.javaguru.sunday.student_deniss_lobacs.lesson_7.level_1_intern;

import java.util.Arrays;

public class WordService {

    public String findMostFrequentWord (String text){

        String[] words = text.split("\\s+");
        Arrays.sort(words);
        int count = 1, tempCount = 0;
        String mostFrequentWord = " ";
        String temp;
        for (int i = 0; i < words.length; i++) {
            temp = words[i];
            tempCount = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (temp.equals(words[j])) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                mostFrequentWord = temp;
                count = tempCount;
                System.out.println(mostFrequentWord);
            }
        }
        return mostFrequentWord;

    }

}
