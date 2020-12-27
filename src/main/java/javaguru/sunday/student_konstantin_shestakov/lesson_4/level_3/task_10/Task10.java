package javaguru.sunday.student_konstantin_shestakov.lesson_4.level_3.task_10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();


        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " - is largest number out of 3 inputed");
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " - is largest number out of 3 inputed");
        }
        else {
            System.out.println(thirdNumber + " - is largest number out of 3 inputed");
        }
    }
}
