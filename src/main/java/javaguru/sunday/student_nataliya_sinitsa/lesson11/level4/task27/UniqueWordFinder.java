package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level4.task27;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        String[] wordsFromText = text.toLowerCase().split("\\s");
        Set<String> setOfUniqueWords = new HashSet<>();
        Collections.addAll(setOfUniqueWords, wordsFromText);
        return setOfUniqueWords;
    }

}
