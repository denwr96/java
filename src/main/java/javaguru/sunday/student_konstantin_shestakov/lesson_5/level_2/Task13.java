package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_2;

import java.util.Random;

class Task13 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumberOne = random.nextInt();
        int randomNumberTwo = random.nextInt();
        int randomNumberThree = random.nextInt();

        int[] arrayOne = {randomNumberOne, randomNumberTwo, randomNumberThree};

        System.out.println(arrayOne[0] + arrayOne[1] + arrayOne[2]);
    }
}
