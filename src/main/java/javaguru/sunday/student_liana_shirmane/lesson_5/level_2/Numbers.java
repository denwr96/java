package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;
//task10
//task11
//task12
//task13
//task14
//task15

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = false)
@CodeReviewComment(comment = "Читать код не реально. Все в кучу. Разбейте на логические методы." +
        "Все еще false, потому, что ничего не поменялось")
class Numbers {

    public static void main(String[] args) {

        int[] numbers = {13, 17, 98};
        System.out.println("First number is " + numbers[0]);
        System.out.println("Second number is " + numbers[1]);
        System.out.println("Third number is " + numbers[2]);

        int[] numbersFromUser = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbersFromUser.length; i++) {
            System.out.println("Please enter number");
            numbersFromUser[i] = scanner.nextInt();
        }
        System.out.println("First number from user is " + numbersFromUser[0]);
        System.out.println("Second number from user is " + numbersFromUser[1]);
        System.out.println("Third number from user is " + numbersFromUser[2]);

        int[] randomNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println("First random number is " + randomNumbers[0]);
        System.out.println("Second random number is " + randomNumbers[1]);
        System.out.println("Third random number is " + randomNumbers[2]);

        int[] randomNumbersSum = new int[3];
        Random randomSum = new Random();
        for (int i = 0; i < randomNumbersSum.length; i++) {
            randomNumbersSum[i] = randomSum.nextInt(100);
        }
        int Sum = randomNumbersSum[0] + randomNumbersSum[1] + randomNumbersSum[2];
        System.out.println("Sum of three random numbers is " + Sum);

        int[] randomNumbersAverage = new int[3];
        Random randomAverage = new Random();
        for (int i = 0; i < randomNumbersAverage.length; i++) {
            randomNumbersAverage[i] = randomAverage.nextInt(100);
        }
        int Average = (randomNumbersAverage[0] + randomNumbersAverage[1] + randomNumbersAverage[2])/randomNumbersAverage.length;
        System.out.println("Average of three random numbers is " + Average);

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

