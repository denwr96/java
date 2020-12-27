package javaguru.sunday.student_konstantin_shestakov.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");

        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        int userInput3 = scanner.nextInt();

        int[] arrayOne = {userInput1, userInput2, userInput3};

        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);
    }
}
