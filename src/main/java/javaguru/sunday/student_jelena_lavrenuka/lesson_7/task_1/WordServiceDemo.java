package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_1;

import main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_7.task_1.WordService;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class WordServiceDemo {
    public static void main(String[] args) {
        WordService victim = new WordService();
        String textFromUser = victim.getText();
        String[] text = victim.splitText(textFromUser);
        victim.findMostFrequentWord(text);
    }
}
