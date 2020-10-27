package main.java.javaguru.sunday.student_natalia_kochkina.lesson_5.level_2;

//Task_12
//Task_13
//Task_14
//Task_15

import java.util.Random;

public class Array3 {

    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;

        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10);
            randomNumbers[i] = randomNumber;
            sum = sum + randomNumbers[i];
            System.out.println(randomNumbers[i]);
        }
        System.out.println("Сумма = " + sum);

        double middleNumber = (double) sum / randomNumbers.length;
        System.out.println("Среднее значение = " + middleNumber);

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = randomNumbers[i] + 2;
            System.out.println("Новое значение = " + randomNumbers[i]);
        }
    }
}
