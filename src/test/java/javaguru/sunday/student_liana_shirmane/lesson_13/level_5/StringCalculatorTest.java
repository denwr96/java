package javaguru.sunday.student_liana_shirmane.lesson_13.level_5;
//task26
//task27
//task28
//task29
//task30
//task31

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    public void shouldReturnZero() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void shouldReturnSumOfNumbers() {
        assertEquals(4, StringCalculator.add("1,3"));
    }

    @Test
    public void shouldReturnSumOfFewNumbers() {
        assertEquals(8, StringCalculator.add("3,3,2"));
    }

    @Test
    public void shouldReturnSumOfFewNumbersWithDifSeparators() {
        assertEquals(6, StringCalculator.add("2\n2,2"));
    }

    @Test
    public void shouldAcceptDelimiterLine(){
        assertEquals(3, StringCalculator.add("//[;]\n1;2"));
    }
}