package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class Task25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создание целочисленного массива, введите кол-во элементов: ");

        int userInputArrayLength = scanner.nextInt();

        int[] arrayOne = new int[userInputArrayLength];

        System.out.println("Введите значения 1 - " + arrayOne.length + " элементов массива: ");

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = scanner.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(arrayOne));
    }
}
