package javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_12;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayWithRandomNumbers {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Random myRandom = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myRandom.nextInt(100);
        }
        System.out.println("First number is " + myArray[0]);
        System.out.println("Second number is " + myArray[1]);
        System.out.println("Third number is " + myArray[2]);
    }
}
