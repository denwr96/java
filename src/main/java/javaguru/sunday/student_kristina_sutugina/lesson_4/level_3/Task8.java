package javaguru.sunday.student_kristina_sutugina.lesson_4.level_3;
//Task_8
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int number = scanner.nextInt();
        System.out.println("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите число 3: ");
        int number3 = scanner.nextInt();

        if (number == number2 && number == number3) {
            System.out.println("All numbers are equal");
        } else if (number != number2 && number != number3 && number2 != number3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
