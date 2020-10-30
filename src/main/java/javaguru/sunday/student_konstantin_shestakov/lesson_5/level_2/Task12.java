package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task12 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumberOne = random.nextInt();
        int randomNumberTwo = random.nextInt();
        int randomNumberThree = random.nextInt();

        int[] arrayOne = {randomNumberOne, randomNumberTwo, randomNumberThree};

        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);
    }
}
