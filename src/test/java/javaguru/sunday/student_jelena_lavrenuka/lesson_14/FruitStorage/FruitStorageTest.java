package javaguru.sunday.student_jelena_lavrenuka.lesson_14.FruitStorage;

// lesson_14 task_1
// lesson_14 task_2
// lesson_14 task_3
// lesson_14 task_4
// lesson_14 task_5
// lesson_14 task_6
// lesson_14 task_7
// lesson_14 task_8
// lesson_14 task_9
// lesson_14 task_10
// lesson_14 task_11
// lesson_14 task_12
// lesson_14 task_13
// lesson_14 task_14
// lesson_14 task_15
// lesson_14 task_16
// lesson_14 task_17

import javaguru.sunday.teacher.annotations.CodeReview;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class FruitStorageTest {

    private FruitStorage victim;

    @Before
    public void setUp() {
        victim = new FruitStorage();
    }

    @Test
    public void testFindAllGreenApples() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        List<Apple> apples = victim.getAllApples();
        List<Apple> actualResult = victim.findAllGreenApples(apples);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApplesByColor1() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        List<Apple> actualResult = victim.findApplesByColor(apples, "green");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApplesByColor2() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        List<Apple> actualResult = victim.findApplesByColor(apples, "red");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApplesByWeight() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        List<Apple> actualResult = victim.findApplesByWeight(apples, 165);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples1() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        List<Apple> actualResult = victim.findApples(apples, new AppleGreenColorPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples2() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        List<Apple> actualResult = victim.findApples(apples, new AppleRedColorPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples3() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        List<Apple> actualResult = victim.findApples(apples, new AppleHeavyWeightPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples4() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        List<Apple> actualResult = victim.findApples(apples, new AppleLightWeightPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples5() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        List<Apple> actualResult = victim.findApples(apples, new AppleGreenAndHeavyWeightPredicate());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples6() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        List<Apple> actualResult = victim.findApples(apples, new ApplePredicate() {
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples7() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        List<Apple> actualResult = victim.findApples(apples, new ApplePredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples8() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        List<Apple> actualResult = victim.findApples(apples, new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples9() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        List<Apple> actualResult = victim.findApples(apples, new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples10() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        List<Apple> actualResult = victim.findApples(apples, apple -> apple.getWeight() < 150);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFindApples11() {
        List<Apple> apples = victim.getAllApples();
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        expectedResult.add(new Apple("yellow", 50));
        List<Apple> actualResult = victim.findApples(apples, apple -> apple.getWeight() < 150);
        assertEquals(expectedResult, actualResult);
    }
}