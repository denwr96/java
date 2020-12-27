package javaguru.sunday.teacher.lesson_8.lessoncode.arrayUtils;

import java.util.Random;

public class ArrayUtilsImpl implements ArrayUtils {

    @Override
    public int[] createArray(int size) {
        return new int[size];
    }

    @Override
    public void fillWithRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
