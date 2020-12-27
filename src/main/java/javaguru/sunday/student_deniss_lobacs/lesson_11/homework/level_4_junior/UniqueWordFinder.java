package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_4_junior;
// task27
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinder {

    Set<String> find(String text) {
        String[] words;
        Set<String> uniqueWords = new HashSet<>();
        words = text.split("[\\W]+");
        for (int i = 0; i < words.length; i++) {
            uniqueWords.add(words[i]);
        }
        return uniqueWords;
    }

}
