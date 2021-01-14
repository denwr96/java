package javaguru.sunday.student_sergej_savkin.lesson_11.level_2_intern.task_6_38;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.*;

//task27

@CodeReview(approved = true)
class UniqueWordFinder {

    Set<String> find(String text) {
        String[] stringArray = text.split("[.,?! ]");
        LinkedHashSet<String> uniqueWordsFound = new LinkedHashSet<>();
        Collections.addAll(uniqueWordsFound, stringArray);
        return uniqueWordsFound;
    }


}
