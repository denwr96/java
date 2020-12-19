package main.java.javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import java.util.*;

//task27

class UniqueWordFinder {

    Set<String> find(String text) {
        String[] stringArray = text.split("[.,?! ]");
        LinkedHashSet<String> uniqueWordsFound = new LinkedHashSet<>();
        Collections.addAll(uniqueWordsFound, stringArray);
        return uniqueWordsFound;
    }


}
