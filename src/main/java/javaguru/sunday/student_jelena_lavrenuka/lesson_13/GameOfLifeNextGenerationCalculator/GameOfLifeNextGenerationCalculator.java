package javaguru.sunday.student_jelena_lavrenuka.lesson_13.GameOfLifeNextGenerationCalculator;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

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
@CodeReview(approved = true)
@CodeReviewComment(comment = "Вы молодец. Можно наверное было попробовать разбить на понятные методы...а то очень сложно читать.")
class GameOfLifeNextGenerationCalculator {
    boolean[][] nextGeneration = new boolean[10][10];

    public boolean[][] calculate(boolean[][] currentGeneration) {

        for (int i = 1; i < currentGeneration.length - 1; i++) {
            for (int j = 1; j < currentGeneration[i].length - 1; j++) {
                int aliveNeighbours = 0;
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if (currentGeneration[i + k][j + l]) {
                            aliveNeighbours++;
                        }
                    }
                }
                if ((currentGeneration[i][j]) && (aliveNeighbours < 2)) {
                    nextGeneration[i][j] = false;
                } else if ((currentGeneration[i][j]) && (aliveNeighbours > 3)) {
                    nextGeneration[i][j] = false;
                } else if (((currentGeneration[i][j]) && (aliveNeighbours == 3)) || ((currentGeneration[i][j]) && (aliveNeighbours == 2))) {
                    nextGeneration[i][j] = true;
                } else if ((!currentGeneration[i][j]) && (aliveNeighbours == 3)) {
                    nextGeneration[i][j] = true;
                }
            }
        }
        return nextGeneration;
    }
}


