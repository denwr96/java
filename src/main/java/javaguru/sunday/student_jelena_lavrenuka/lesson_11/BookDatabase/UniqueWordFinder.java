package javaguru.sunday.student_jelena_lavrenuka.lesson_11.BookDatabase;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@CodeReview(approved = true)
class UniqueWordFinder {
    Set<String> find(String text) {
        String delimeter = "[ ~!@#$%^&*()_+`1234567890-={}:;'|<>,./?]";
        String[] spiltText = text.split(delimeter);
        Set<String> uniqueWordList = new HashSet<>();
        Collections.addAll(uniqueWordList, spiltText);
        return uniqueWordList;
    }
}
