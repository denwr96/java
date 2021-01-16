package javaguru.sunday.student_konstantin_shestakov.lesson_14.level_1_to_2;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void findGreenApplesShouldBe3() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findGreenApples(apples);

        assertEquals(3, result.size());
    }

    @Test
    public void findRedApplesShouldBe3() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findRedApples(apples);

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesByColorYellowShouldBe2() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApplesByColor(apples, "yellow");

        assertEquals(2, result.size());
    }

    @Test
    public void findApplesByWeight() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApplesByWeight(apples, 100, 170);

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesByAppleGreenColorPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleGreenColorPredicate());

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesByAppleRedColorPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleRedColorPredicate());

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesByAppleYellowColorPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleYellowColorPredicate());

        assertEquals(2, result.size());
    }

    @Test
    public void findApplesByAppleHeavyWeightPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleHeavyWeightPredicate());

        assertEquals(4, result.size());
    }

    @Test
    public void findApplesByAppleLightWeightPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleLightWeightPredicate());

        assertEquals(4, result.size());
    }

    @Test
    public void findApplesByAppleGreenAndHeavyWeightPredicate() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new AppleGreenAndHeavyWeightPredicate());

        assertEquals(1, result.size());
    }

    @Test
    public void findApplesRedAnonymousClass() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, apple -> "red".equals(apple.getColor()));
        assertEquals(3, result.size());
    }

    @Test
    public void findApplesGreenAnonymousClass() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(3, result.size());
    }

    @Test
    public void findApplesYellowAnonymousClass() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "yellow".equals(apple.getColor());
            }
        });
        assertEquals(2, result.size());
    }

    @Test
    public void findApplesHeavyAnonymousClass() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, result.size());
    }

    @Test
    public void findApplesLightAnonymousClass() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(4, result.size());
    }

    @Test
    public void findApplesRedLambda() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples,
        (Apple apple) -> "red".equals(apple.getColor()));

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesGreenLambda() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples,
                (Apple apple) -> "green".equals(apple.getColor()));

        assertEquals(3, result.size());
    }

    @Test
    public void findApplesYellowLambda() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples,
                (Apple apple) -> "yellow".equals(apple.getColor()));

        assertEquals(2, result.size());
    }

    @Test
    public void findApplesHeavyLambda() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples,
                (Apple apple) -> apple.getWeight() > 150);

        assertEquals(4, result.size());
    }

    @Test
    public void findApplesLightLambda() {
        FruitStorage victim = new FruitStorage();
        List<Apple> apples = victim.getAllApples();

        List<Apple> result = victim.findApples(apples,
                (Apple apple) -> apple.getWeight() > 150);

        assertEquals(4, result.size());
    }
}