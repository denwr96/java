package javaguru.sunday.teacher.lesson_14.lessoncode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStoreTest {

    FruitStore fruitStore;

    @Before
    public void setUp() throws Exception {
        fruitStore = new FruitStore();
    }

    @Test
    public void getAllApples() {
        List<Fruit> allApples = fruitStore.getAllApples();
        assertEquals(2, allApples.size());
    }

    @Test
    public void getAllPears() {
        List<Fruit> allPears = fruitStore.getAllPears();
        assertEquals(2, allPears.size());
    }

    @Test
    public void getAllTomatos() {
        List<Fruit> allPears = fruitStore.findAllFruitsByTitle("tomato");
        assertEquals(1, allPears.size());
    }
}