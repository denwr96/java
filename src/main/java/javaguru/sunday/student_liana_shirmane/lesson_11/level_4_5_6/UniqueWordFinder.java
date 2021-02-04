package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task27

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
@CodeReview(approved = true)
public class UniqueWordFinder {
    Set<String> find(String text) {
        String words = text.replaceAll("[-+.^:,'’!?]", "");
        String[] uniqueWordsArray = words.split("[^a-zA-Z]+");
        Set<String> uniqueWordFinder = new LinkedHashSet<>();
        Collections.addAll(uniqueWordFinder, uniqueWordsArray);
        return uniqueWordFinder;
    }
}