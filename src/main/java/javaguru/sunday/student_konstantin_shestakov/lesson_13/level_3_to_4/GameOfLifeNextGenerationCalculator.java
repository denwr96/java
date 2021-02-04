package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_3_to_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class GameOfLifeNextGenerationCalculator {

    boolean[][] calculate(boolean[][] field) {
        boolean[][] fieldNextGen = new boolean[field.length][field[0].length];

        for (int y = 1; y < field.length - 1; y++) {
            for (int x = 1; x < field[0].length - 1; x++) {

                if(field[y][x] && checkNextCellsForTrue(field, y, x) < 2) { // Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
                    fieldNextGen[y][x] = false;
                }
                if(field[y][x] && checkNextCellsForTrue(field, y, x) > 3) { // Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
                    fieldNextGen[y][x] = false;
                }
                if(field[y][x] && checkNextCellsForTrue(field, y, x) == 2 || field[y][x] && checkNextCellsForTrue(field, y, x) == 3) { // Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
                    fieldNextGen[y][x] = true;
                }
                if(!field[y][x] && checkNextCellsForTrue(field, y, x) == 3) { // Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
                    fieldNextGen[y][x] = true;
                }
            }
        }
        return fieldNextGen;
    }

    int checkNextCellsForTrue(boolean[][] field , int y, int x) {
        int counter = 0;

        if (field[y - 1][x - 1]) {
            counter++;
        }
        if (field[y - 1][x]) {
            counter++;
        }
        if (field[y - 1][x + 1]) {
            counter++;
        }
        if (field[y][x - 1]) {
            counter++;
        }
        if (field[y][x + 1]) {
            counter++;
        }
        if (field[y + 1][x - 1]) {
            counter++;
        }
        if (field[y + 1][x]) {
            counter++;
        }
        if (field[y + 1][x + 1]) {
            counter++;
        }
        return counter;
    }

}
