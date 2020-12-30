package javaguru.sunday.student_artjom_proshkin.lesson_6.level_3;
//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14

class ArrayUtil {

    boolean hasNumber(int[] myArray, int number) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                return true;
            }
        }
        return false;
    }

    int hasNumberCounter(int[] myArray, int number) {
        int counter = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                counter++;
            }
        }
        return counter;
    }

    void replaceFirstMatchNumber(int[] myArray, int numberToReplace, int newNumber) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
                break;
            }
        }
    }

    void replaceAllMatchNumbers(int[] myArray, int numberToReplace, int newNumber) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == numberToReplace) {
                myArray[i] = newNumber;
            }
        }
    }

    void reverseArray(int[] myArray) {
        int temporary;
        for (int i = 0; i < myArray.length / 2; i++) {
            temporary = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = myArray[i];
            myArray[i] = temporary;
        }
    }

    void bubbleSortArray(int[] myArray) {
        boolean sorted = false;
        int temporary;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i + 1]) {
                    temporary = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temporary;
                    sorted = false;
                }
            }
        }
    }
}