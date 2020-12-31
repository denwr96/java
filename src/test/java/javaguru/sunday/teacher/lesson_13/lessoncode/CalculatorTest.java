package java.javaguru.sunday.teacher.lesson_13.lessoncode;

import javaguru.sunday.teacher.lesson_13.lessoncode.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() {
        victim = new Calculator();
    }

    @Test
    public void testSumTwoNumbers1() {
        int result = victim.sum(5, 2);
        assertEquals(7, result);
    }

    @Test
    public void testSumTwoNumbers2() {
        int result = victim.sum(5, 2);
        assertEquals(7, result);
    }
    @Test

    public void testSumTwoNumbers3() {
        int result = victim.sum(5, 2);
        assertEquals(7, result);
    }
    @Test
    public void testSumTwoNumbers4() {
        int result = victim.sum(5, 2);
        assertEquals(7, result);
    }

}