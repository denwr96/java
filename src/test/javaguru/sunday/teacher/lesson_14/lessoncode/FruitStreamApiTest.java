package javaguru.sunday.teacher.lesson_14.lessoncode;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class FruitStreamApiTest {

    @Test
    public void findAllFruitUniqNames() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        Set<String> allFruitUniqNames = fruitStreamApi.findAllFruitUniqNames();
        System.out.println(allFruitUniqNames);
    }

    @Test
    public void findAllFruitUniqWeight() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        Set<Integer> allFruitUniqWeight = fruitStreamApi.findAllFruitUniqWeight();
        System.out.println(allFruitUniqWeight);
    }

    @Test
    public void test() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        Map<Integer, List<Fruit>> allFruitsByWeight = fruitStreamApi.getAllFruitsByWeight();
        System.out.println(allFruitsByWeight);
    }

    @Test
    public void test2() {
        FruitStreamApi fruitStreamApi = new FruitStreamApi();

        List<String> allFruitColors = fruitStreamApi.getAllFruitColors();
        System.out.println(allFruitColors);
    }
}