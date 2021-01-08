package javaguru.sunday.student_jelena_lavrenuka.lesson_13.GameOfLifeNextGenerationCalculator;

// lesson_13 task_10
// lesson_13 task_11
// lesson_13 task_12
// lesson_13 task_13
// lesson_13 task_14
// lesson_13 task_15
// lesson_13 task_16
// lesson_13 task_17
// lesson_13 task_18
// lesson_13 task_19
// lesson_13 task_20
// lesson_13 task_21
// lesson_13 task_22
// lesson_13 task_23
// lesson_13 task_24
// lesson_13 task_25

import java.util.Random;

class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int fieldWidth, int fieldHeight){
        Random random = new Random();
        boolean[][] field = new boolean [fieldWidth][fieldHeight];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}
