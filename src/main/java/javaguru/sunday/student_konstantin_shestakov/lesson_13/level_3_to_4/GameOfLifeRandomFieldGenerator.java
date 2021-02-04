package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_3_to_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class GameOfLifeRandomFieldGenerator {

    public boolean[][] createField(int height, int width) {
        return new boolean[height + 2][width + 2];
    }

    public boolean[][] fillFieldWithRandom(boolean[][] field) {
        Random random = new Random();

        for (int y = 1; y < field.length - 1; y++) {
            for (int x = 1; x < field[0].length - 1 ; x++) {
                field[y][x] = random.nextBoolean();
            }
        }
        return field;
    }

}
