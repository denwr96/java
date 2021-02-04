package javaguru.sunday.student_jelena_lavrenuka.lesson_15.FraudDetector_task_9;

import javaguru.sunday.teacher.annotations.CodeReview;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FraudDetectorTest {
private FraudDetector victim;
    @Before
    public void setUp() {
        victim = new FraudDetector();
    }

    @Test
    public void isFraud1() {
        assertTrue(victim.isFraud(new Trader("Pokemon", "Riga")));
    }

    @Test
    public void isFraud2() {
        assertTrue(victim.isFraud(new Trader("Peter", "Sidney")));
    }

    @Test
    public void isFraud3() {
        assertFalse(victim.isFraud(new Trader("Janis", "Riga")));
    }
}