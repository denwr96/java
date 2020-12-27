package javaguru.sunday.student_kristina_sutugina.lesson_6.level_3;
//Task_9
//Task_10
//Task_11
//Task_12
//Task_13
//Task_14
//нет codeReview
import java.util.Arrays;

class ArrayUtil {

    public boolean findNumber(int[] array, int number) {
        boolean containsNumber = false;
        for (int element : array) {
            if (element == number) {
                containsNumber = true;
            } else {
                containsNumber = false;
            }
        }
        return containsNumber;
    }

    public int countNumberQuantity(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }

    void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
            System.out.println(arr[i]);
        }
    }

    public int[] reverse(int[] arr) {
        int[] revArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[j] = arr[i];
            j++;
        }
        return revArr;
    }

    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}



