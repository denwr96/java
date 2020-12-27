package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task15 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumberOne = random.nextInt();
        int randomNumberTwo = random.nextInt();
        int randomNumberThree = random.nextInt();

        int[] arrayOne = {randomNumberOne, randomNumberTwo, randomNumberThree};

        System.out.println("ArrayOne 1 = " + arrayOne[0] + " | ArrayOne 2 = " + arrayOne[1] + " | ArrayOne 3 = " + arrayOne[2]);

        arrayOne[0] = arrayOne[0] + 2;
        arrayOne[1] = arrayOne[1] + 2;
        arrayOne[2] = arrayOne[2] + 2;
        System.out.println(" + 2 =");
        System.out.println("ArrayOne 1 = " + arrayOne[0] + " | ArrayOne 2 = " + arrayOne[1] + " | ArrayOne 3 = " + arrayOne[2]);

    }
}
