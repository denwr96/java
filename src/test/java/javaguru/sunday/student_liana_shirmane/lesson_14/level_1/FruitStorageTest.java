package javaguru.sunday.student_liana_shirmane.lesson_14.level_1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    private FruitStorage victim;

    @Before
    public void setUp() {
        victim = new FruitStorage();
    }

    @Test
    public void shouldReturnGreenFruits() {
        {
            List<Apple> expectedResult = new ArrayList<>();
            expectedResult.add(new Apple("green", 200));
            expectedResult.add(new Apple("green", 90));
            expectedResult.add(new Apple("green", 50));
            List<Apple> apples = victim.getAllApples();
            List<Apple> actualResult = victim.findGreenApples(apples);
            assertEquals(expectedResult, actualResult);
        }
    }

    //private void assertEquals(List<Apple> expectedResult, List<Apple> actualResult) {
   // }
}