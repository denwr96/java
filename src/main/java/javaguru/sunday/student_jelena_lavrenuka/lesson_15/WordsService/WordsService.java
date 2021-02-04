package javaguru.sunday.student_jelena_lavrenuka.lesson_15.WordsService;

import javaguru.sunday.teacher.annotations.CodeReview;

// lesson_15 task_3
// lesson_15 task_4
@CodeReview(approved = true)
class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}
