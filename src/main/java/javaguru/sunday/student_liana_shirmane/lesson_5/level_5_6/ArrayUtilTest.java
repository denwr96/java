package main.java.javaguru.sunday.student_liana_shirmane.lesson_5.level_5_6;

//task32
//task34
//task37
//task39
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArray();
        test.shouldFindMax();
        test.shouldFindMin();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 8;
        int[] result = arrayUtil.createArray(arrayLength);
        if (result.length == arrayLength) {
            System.out.println("Test passed");
        } else System.out.println("Test failed");

    }

    public void shouldFillArray() {
        int[] arrayFull = new int[5];
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.fillArrayWithRandomNumbers(arrayFull);
        boolean isFull = true;
        for (int i = 0; i < arrayFull.length; i++) {
            if (arrayFull[i] < 0) {
                isFull = false;
            }
        }
        if (isFull == true) {
            System.out.println("Array is full");
        } else {
            System.out.println("Array is not full");
        }
    }

    public void shouldFindMax(){
        int[] arrayPrint = new int[5];
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.fillArrayWithRandomNumbers(arrayPrint);
        arrayUtil.printArrayToConsole(arrayPrint);
        arrayUtil.findMaxNumber(arrayPrint);
    }

    public void shouldFindMin(){
        int[] arrayPrint = new int[5];
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.fillArrayWithRandomNumbers(arrayPrint);
        arrayUtil.printArrayToConsole(arrayPrint);
        arrayUtil.findMinNumber(arrayPrint);
    }
}



