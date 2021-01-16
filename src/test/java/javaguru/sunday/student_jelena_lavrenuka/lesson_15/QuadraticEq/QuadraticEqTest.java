package javaguru.sunday.student_jelena_lavrenuka.lesson_15.QuadraticEq;
// lesson_15 task_4
// lesson_15 task_5
// lesson_15 task_6
// lesson_15 task_7
// lesson_15 task_8
import javaguru.sunday.teacher.annotations.CodeReview;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class QuadraticEqTest {
    private QuadraticEq victim;

    @Before
    public void setUp() {
        victim = new QuadraticEq();
    }

    @Test
    public void testCalc1() {
        String expectedResult = "Equation has no roots";
        String actualResult = victim.calc(1, 2, 3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalc2() {
        String expectedResult = "x1 = -0.8356391758629093, x2 = -0.23843489821116484";
        String actualResult = victim.calc(27, 29, 5);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCalc3() {
        String expectedResult = "x = 0.0";
        String actualResult = victim.calc(-4, 0, 0);
        assertEquals(expectedResult, actualResult);
    }

}