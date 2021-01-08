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

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {
    private GameOfLifeNextGenerationCalculator victim;

    @Before
    public void setUp() {
        victim = new GameOfLifeNextGenerationCalculator();
    }

    @Test
    public void testCalculateRule1V1() {
        boolean[][] currentGeneration = {{false, false, false},
                {true, false, false},
                {false, true, false},
        };
        boolean[][] result = victim.calculate(currentGeneration);
        assertFalse(result[0][1]);
    }
    @Test
    public void testCalculateRule1V2() {
        boolean[][] currentGeneration = {{false, false, false},
                {true, false, false},
                {false, true, false},
        };
        boolean[][] result = victim.calculate(currentGeneration);
        assertFalse(result[1][2]);
    }

    @Test
    public void testCalculateRule2V1() {
        boolean[][] currentGeneration = {{true, true, false},
                {true, true, false},
                {true, false, false},
        };
        boolean[][] result = victim.calculate(currentGeneration);
        assertFalse(result[1][1]);
    }

    @Test
    public void testCalculateRule3V1() {
        boolean[][] currentGeneration = {{true, true, false},
                {false, true, false},
                {false, false, false},
        };
        boolean[][] result = victim.calculate(currentGeneration);
        assertTrue(result[1][1]);
    }

    @Test
    public void testCalculateRule4V1() {
        boolean[][] currentGeneration = {{true, true, false},
                {true, false, false},
                {false, false, false},
        };
        boolean[][] result = victim.calculate(currentGeneration);
        assertTrue(result[1][1]);
    }
}
