package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_5.level_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task14 {

    public static void main(String[] args) {

        Random random = new Random();

        double randomNumberOne = random.nextDouble();
        double randomNumberTwo = random.nextDouble();
        double randomNumberThree = random.nextDouble();

        double[] arrayOne = {randomNumberOne, randomNumberTwo, randomNumberThree};

        System.out.println((arrayOne[0] + arrayOne[1] + arrayOne[2]) / arrayOne.length);
    }
}
