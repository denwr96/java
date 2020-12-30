package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;
//task15

import java.util.Random;

public class RandomNumbersPlusTwo {

    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        int[] randomNumbersPlusTwo = new int[3];
        Random randomPlusTwo = new Random();
        for (int i = 0; i < randomNumbersPlusTwo.length; i++) {
            randomNumbers[i] = randomPlusTwo.nextInt(100);
        }
        System.out.println("First random number is " + randomNumbers[0]);
        System.out.println("Second random number is " + randomNumbers[1]);
        System.out.println("Third random number is " + randomNumbers[2]);

        randomNumbers[0] = randomNumbers[0] + 2;
        randomNumbers[1] = randomNumbers[1] + 2;
        randomNumbers[2] = randomNumbers[2] + 2;

        System.out.println("First random number plus two is " + randomNumbers[0]);
        System.out.println("Second random number plus two is " + randomNumbers[1]);
        System.out.println("Third random number plus two is " + randomNumbers[2]);

    }
}

