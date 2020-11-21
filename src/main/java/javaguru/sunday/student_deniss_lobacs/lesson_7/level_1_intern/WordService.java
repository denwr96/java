package main.java.javaguru.sunday.student_deniss_lobacs.lesson_7.level_1_intern;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.nio.MappedByteBuffer;
import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Все хорошо, но есть проблема" +
        "PS: если вы не можете придумать как разбить эту задачу на подзадачи,\n" +
        "пожалуйста попросите помощи! Умение попросить помощи, когда это нужно\n" +
        "навес золота в ИТ." +
        "" +
        "Задачу надо было разбить на методы =) Тут есть три подзадачи, на которые можно разделить код.")
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
