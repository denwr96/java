package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@CodeReview(approved = true)
class Task26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Создание целочисленного массива, введите кол-во элементов: ");

        int userInputArrayLength = scanner.nextInt();
        int[] arrayOne = new int[userInputArrayLength];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(arrayOne));
    }
}
