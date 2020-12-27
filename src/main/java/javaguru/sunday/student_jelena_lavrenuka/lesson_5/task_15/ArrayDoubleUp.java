package javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_15;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayDoubleUp {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }

        System.out.println("First number is " + myArray[0]);
        System.out.println("Second number is " + myArray[1]);
        System.out.println("Third number is " + myArray[2]);

        myArray[0] = myArray[0] + 2;
        myArray[1] = myArray[1] + 2;
        myArray[2] = myArray[2] + 2;

        System.out.println("");

        System.out.println("Updated first number is " + myArray[0]);
        System.out.println("Updated second number is " + myArray[1]);
        System.out.println("Updated third number is " + myArray[2]);

    }
}

