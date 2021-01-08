package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_2_to_6.level_4;


// Task 27 (level 4)

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        String[] textArray = text.split("\\s+");

        Set<String> uniqueWords = new HashSet<>();

        for (String s : textArray) {
            uniqueWords.add(s);
        }
        return uniqueWords;
    }
}
