package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_x;

//Super Task1

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int[] arrayOne;
    int arrayLength;
    int max;
    int min;
    int evenNumber;
    int oddNumber;

    public int[] createArrayUserInputLength() {
        System.out.println("Создание целочисленного массива, введите кол-во элементов: ");
        arrayLength = scanner.nextInt();
        arrayOne = new int[arrayLength];
        return arrayOne;
    }

    public int[] fillArrayUserInputNumbers() {
        System.out.println("Введите значения 1 - " + arrayOne.length + " элементов массива: ");

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = scanner.nextInt();
        }
        return arrayOne;
    }

    public int[] createArrayRandomLength() {
        System.out.println("Длина массива = произвольное число (до 10)");
        arrayLength = random.nextInt(9) + 1;
        arrayOne = new int[arrayLength];
        return arrayOne;
    }

    public int[] fillArrayWithRandomNumbers() {
        System.out.println("Массив будет заполнен случайными целыми числами (до 10)");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(10);
        }
        return arrayOne;
    }

    public int[] arrayFindMax() {
        max = arrayOne[0];
        for (int i : arrayOne) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Наибольшее значение массива = " + max);
        return arrayOne;
    }

    public int[] arrayFindMin() {
        min = arrayOne[0];
        for (int i : arrayOne) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Наименьшее значение массива = " + min);
        return arrayOne;
    }

    public int[] arrayFindEven() {
        System.out.println("Чётные числа массива: ");
        for (int i : arrayOne) {
            if (i % 2 == 0) {
                evenNumber = i;
                System.out.println(evenNumber);
            }
        }
        return arrayOne;
    }

    public int[] arrayFindOdd() {
        System.out.println("Нечётные числа массива: ");
        for (int i : arrayOne) {
            if (i % 2 != 0) {
                oddNumber = i;
                System.out.println(oddNumber);
            }
        }
        return arrayOne;
    }

    public void printArrayToConsole() {
        System.out.println(Arrays.toString(arrayOne));
    }
}