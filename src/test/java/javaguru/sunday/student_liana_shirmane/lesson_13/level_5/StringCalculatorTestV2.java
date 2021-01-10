package javaguru.sunday.student_liana_shirmane.lesson_13.level_5;
//task26
//task27
//task28
//task29
//task30
//task31

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTestV2 {
    private StringCalculatorV2 calculator = new StringCalculatorV2();

    @Test
    public void shouldReturnZero() {
        assertEquals(0, StringCalculatorV2.add(""));
    }

    @Test
    public void shouldReturnNumber() {
        assertEquals(1, StringCalculatorV2.add("1"));
    }

    @Test
    public void shouldReturnSumOfNumbers() {
        assertEquals(4, StringCalculatorV2.add("1,3"));
    }

    @Test
    public void shouldReturnSumOfFewNumbers() {
        assertEquals(8, StringCalculatorV2.add("3,3,2"));
    }

    @Test
    public void shouldReturnSumOfFewNumbersWithDifSeparators() {
        assertEquals(6, StringCalculatorV2.add("2\n2,2"));
    }

    @Test
    public void shouldAcceptDelimiterLine(){
        assertEquals(3, StringCalculatorV2.add("//[;]\n1;2"));
    }
}