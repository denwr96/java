package javaguru.sunday.student_liana_shirmane.lesson_11.level_4_5_6;
//task27

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueWordFinder {
    Set<String> find(String text) {
        String words = text.replaceAll("[-+.^:,'’!?]", "");
        String[] uniqueWordsArray = words.split("[^a-zA-Z]+");
        Set<String> uniqueWordFinder = new LinkedHashSet<>();
        Collections.addAll(uniqueWordFinder, uniqueWordsArray);
        return uniqueWordFinder;
    }
}