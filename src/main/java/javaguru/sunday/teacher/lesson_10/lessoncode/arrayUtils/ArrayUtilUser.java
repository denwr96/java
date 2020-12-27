package javaguru.sunday.teacher.lesson_10.lessoncode.arrayUtils;

public class ArrayUtilUser {

    private ArrayUtil arrayUtil;

    public ArrayUtilUser(ArrayUtil arrayUtil) {
        this.arrayUtil = arrayUtil;
    }

    public void createArrayAndFillWithRandomNumbers() {
        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
    }
}
