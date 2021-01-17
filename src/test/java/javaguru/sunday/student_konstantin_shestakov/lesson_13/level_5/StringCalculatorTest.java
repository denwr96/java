package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class StringCalculatorTest {

    @Test
    public void addMethodTestShouldBeInt10() {
        StringCalculator victim = new StringCalculator();
        int result = victim.add("1\\n23,4");
        assertEquals(10, result);
    }

    @Test
    public void addMethodTestShouldBeInt0() {
        StringCalculator victim = new StringCalculator();
        int result = victim.add("");
        assertEquals(0, result);
    }

    @Test
    public void addMethodTestShouldBeInt6() {
        StringCalculator victim = new StringCalculator();
        int result = victim.add("1,2,3");
        assertEquals(6, result);
    }

    @Test
    public void addV2MethodTestShouldBeInt10() {
        StringCalculator victim = new StringCalculator();
        int result = victim.addV2("//[;][&]\\n1;2&34");
        assertEquals(10, result);
    }

    @Test
    public void addV2MethodTestShouldBeInt15() {
        StringCalculator victim = new StringCalculator();
        int result = victim.addV2("//[;][&][,]\\n1;2&34,5");
        assertEquals(42, result);
    }

}