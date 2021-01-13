package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_3_to_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();

    @Test
    public void checkNextCellsForTrueHasToBeTwo() {
        boolean[][] field = new boolean[5][5];

        field[0][0] = false; field[0][1] = false; field[0][2] = false; field[0][3] = false; field[0][4] = false;
        field[1][0] = false; field[1][1] = false; field[1][2] = false; field[1][3] = false; field[1][4] = false;
        field[2][0] = false; field[2][1] = true; field[2][2] = true; field[2][3] = false; field[2][4] = false;
        field[3][0] = false; field[3][1] = false; field[3][2] = false; field[3][3] = false; field[3][4] = false;
        field[4][0] = false; field[4][1] = false; field[4][2] = false; field[4][3] = false; field[4][4] = false;

        int result = test.checkNextCellsForTrue(field, 1, 1);

        assertEquals(2,result);
    }

    @Test
    public void checkNextCellsForTrueHasToBeEight() {
        boolean[][] field = new boolean[5][5];

        field[0][0] = false; field[0][1] = false; field[0][2] = false; field[0][3] = false; field[0][4] = false;
        field[1][0] = false; field[1][1] = true; field[1][2] = true; field[1][3] = true; field[1][4] = false;
        field[2][0] = false; field[2][1] = true; field[2][2] = false; field[2][3] = true; field[2][4] = false;
        field[3][0] = false; field[3][1] = true; field[3][2] = true; field[3][3] = true; field[3][4] = false;
        field[4][0] = false; field[4][1] = false; field[4][2] = false; field[4][3] = false; field[4][4] = false;

        int result = test.checkNextCellsForTrue(field, 2, 2);

        assertEquals(8,result);
    }

    @Test // Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
    public void cellHasToDieInNextGenIfLessThanTwoCellsAreNextToIt() {
        boolean[][] field = new boolean[5][5];

        field[0][0] = false; field[0][1] = false; field[0][2] = false; field[0][3] = false; field[0][4] = false;
        field[1][0] = false; field[1][1] = false; field[1][2] = false; field[1][3] = false; field[1][4] = false;
        field[2][0] = false; field[2][1] = true; field[2][2] = true; field[2][3] = false; field[2][4] = false;
        field[3][0] = false; field[3][1] = false; field[3][2] = false; field[3][3] = false; field[3][4] = false;
        field[4][0] = false; field[4][1] = false; field[4][2] = false; field[4][3] = false; field[4][4] = false;

        boolean[][] fieldResult = test.calculate(field);

        assertFalse(fieldResult[2][2]);
    }

    @Test // Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
    public void cellHasToDieInNextGenIfMoreThanThreeCellsAreNextToIt() {
        boolean[][] field = new boolean[5][5];

        field[1][1] = false; field[1][2] = true; field[1][3] = true;
        field[2][1] = false; field[2][2] = true; field[2][3] = false;
        field[3][1] = true; field[3][2] = true; field[3][3] = false;

        boolean[][] fieldResult = test.calculate(field);

        assertFalse(fieldResult[2][2]);
    }

    @Test // Любая живая клетка с двумя живыми соседями остаётся живой в следующем поколении.
    public void cellHasToLiveInNextGenIfTwoCellsNextToItAreAlive() {
        boolean[][] field = new boolean[5][5];

        field[1][1] = false; field[1][2] = false; field[1][3] = false;
        field[2][1] = true; field[2][2] = true; field[2][3] = true;
        field[3][1] = false; field[3][2] = false; field[3][3] = false;

        boolean[][] fieldResult = test.calculate(field);

        assertTrue(fieldResult[2][2]);
    }

    @Test // Любая живая клетка с тремя живыми соседями остаётся живой в следующем поколении.
    public void cellHasToLiveInNextGenIfThreeCellsNextToItAreAlive() {
        boolean[][] field = new boolean[5][5];

        field[1][1] = false; field[1][2] = false; field[1][3] = false;
        field[2][1] = true; field[2][2] = true; field[2][3] = true;
        field[3][1] = false; field[3][2] = true; field[3][3] = false;

        boolean[][] fieldResult = test.calculate(field);

        assertTrue(fieldResult[2][2]);
    }

    @Test // Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.
    public void deadCellHasToLiveInNextGenIfThreeCellsNextToItAreAlive() {
        boolean[][] field = new boolean[5][5];

        field[1][1] = false; field[1][2] = false; field[1][3] = false;
        field[2][1] = true; field[2][2] = false; field[2][3] = true;
        field[3][1] = false; field[3][2] = true; field[3][3] = false;

        boolean[][] fieldResult = test.calculate(field);

        assertTrue(fieldResult[2][2]);
    }
}