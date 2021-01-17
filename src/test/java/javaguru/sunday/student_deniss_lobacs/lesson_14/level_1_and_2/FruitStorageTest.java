package javaguru.sunday.student_deniss_lobacs.lesson_14.level_1_and_2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    private FruitStorage victim;

    @Before
    public void setUp() {
        victim = new FruitStorage();
    }

    @Test
    public void testFindGreenApples_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(3, victim.findAllGreenApples(storage).size());
    }

    @Test
    public void testFindRedApples_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(3, victim.findAllRedApples(storage).size());
    }

    @Test
    public void testFindApplesByColor_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(3, victim.findApplesByColor(storage, "green").size());
    }

    @Test
    public void testFindApplesByWeight_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(4, victim.findApplesByWeight(storage, 100).size());
    }

    @Test
    public void testFindGreenApplesV2_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(3, victim.findApples(storage, new AppleGreenColorPredicate()).size());
    }

    @Test
    public void testFindRedApplesV2_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(3, victim.findApples(storage, new AppleRedColorPredicate()).size());
    }

    @Test
    public void testFindHeavyWeighApples_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(4, victim.findApples(storage, new AppleHeavyWeightPredicate()).size());
    }

    @Test
    public void testFindLightWeightApples_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(4, victim.findApples(storage, new AppleLightWeightPredicate()).size());
    }

    @Test
    public void testFindGreenAndHeavyWeightApples_Success() {
        List<Apple> storage = victim.getAllApples();
        assertEquals(1, victim.findApples(storage, new AppleGreenAndHeavyWeightPredicate()).size());
    }

}