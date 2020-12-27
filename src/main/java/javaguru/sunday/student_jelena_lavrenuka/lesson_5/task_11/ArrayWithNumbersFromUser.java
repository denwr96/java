package javaguru.sunday.student_jelena_lavrenuka.lesson_5.task_11;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class ArrayWithNumbersFromUser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please insert three random integer numbers ");
        int[] myArray = new int [3];
        myArray[0] = myScanner.nextInt();
        myArray[1] = myScanner.nextInt();
        myArray[2] = myScanner.nextInt();
        System.out.println("");
        System.out.println("First number is " + myArray[0]);
        System.out.println("Second number is " + myArray[1]);
        System.out.println("Third number is " + myArray[2]);

    }
}
