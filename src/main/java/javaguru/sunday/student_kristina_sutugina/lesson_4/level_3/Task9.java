package javaguru.sunday.student_kristina_sutugina.lesson_4.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
//Task_9

@CodeReview(approved = true)
class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int number = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int number3 = scanner.nextInt();

        if (number < number2 && number2 < number3) {
            System.out.println("increasing");
        } else if (number > number2 && number2 > number3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
