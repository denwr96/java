package main.java.javaguru.sunday.teacher.lesson_8.lessoncode.arrayUtils;

public class ArrayUtilsUser {

    public void doSomethingWithArrayUtils() {
        //
        //
        ArrayUtils arrayUtilsImpl = new ArrayUtilsImplVersion2();
        int[] array = arrayUtilsImpl.createArray(5);
        arrayUtilsImpl.fillWithRandom(array);
    }

    public void doSomethingElseWithArryUtils() {
        //
        int[] customArray = new int[10];
        ArrayUtils arrayUtilsImpl = new ArrayUtilsImplVersion2();
        arrayUtilsImpl.fillWithRandom(customArray);
    }
}
