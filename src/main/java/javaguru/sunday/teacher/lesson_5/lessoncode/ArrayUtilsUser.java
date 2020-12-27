package javaguru.sunday.teacher.lesson_5.lessoncode;

public class ArrayUtilsUser {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] array = arrayUtils.createArray(10);
        arrayUtils.fillArrayWithNumbers(array);

        int[] myArray = {0, 0, 0, 0};
        arrayUtils.fillArrayWithNumbers(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
