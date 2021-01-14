package javaguru.sunday.student_jelena_lavrenuka.lesson_15.WordsService;

// lesson_15 task_3
// lesson_15 task_4

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
