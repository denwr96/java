package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_5;
// task_31
// task_32
// task_33
// task_34 - переделать
// task_37
// task_39

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int arrayLength = 5;
        victim.createArray(5);
        if (arrayLength > 0) {
            System.out.println("Test shouldCreateArray is OK");
        } else {
            System.out.println("Test  shouldCreateArray is failed");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = new int[5];
        victim.fillArrayWithRandomNumbers(myArray);
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 100) {
                System.out.println("Test shouldFillArrayWithRandomNumbers is OK");
            } else {
                System.out.println("Test shouldFillArrayWithRandomNumbers is failed");
            }
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = new int[6];
        myArray[0] = 17;
        myArray[1] = -9;
        myArray[2] = 78;
        myArray[3] = 23;
        myArray[4] = 98;
        myArray[5] = -7;
        int expectedResult = myArray[4];
        int actualResult = victim.findMaxNumber(myArray);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldFindMaxNumber is Ok");
        } else {
            System.out.println("Test shouldFindMaxNumber is failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] myArray = new int[6];
        myArray[0] = 17;
        myArray[1] = -9;
        myArray[2] = 78;
        myArray[3] = 23;
        myArray[4] = 98;
        myArray[5] = -7;
        int expectedResult = myArray[1];
        int actualResult = victim.findMinNumber(myArray);
        if (expectedResult == actualResult) {
            System.out.println("Test shouldFindMaxNumber is Ok");
        } else {
            System.out.println("Test shouldFindMaxNumber is failed");
        }
    }
}

