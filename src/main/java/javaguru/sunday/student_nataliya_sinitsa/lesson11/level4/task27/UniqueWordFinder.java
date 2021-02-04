package javaguru.sunday.student_nataliya_sinitsa.lesson11.level4.task27;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        String[] wordsFromText = text.toLowerCase().split("\\s");
        Set<String> setOfUniqueWords = new HashSet<>();
        Collections.addAll(setOfUniqueWords, wordsFromText);
        return setOfUniqueWords;
    }

}

