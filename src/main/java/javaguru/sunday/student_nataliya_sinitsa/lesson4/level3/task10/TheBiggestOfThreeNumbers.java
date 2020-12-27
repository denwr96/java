package javaguru.sunday.student_nataliya_sinitsa.lesson4.level3.task10;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class TheBiggestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter your second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter your third number");
        int thirdNumber = scanner.nextInt();

        /* т.к. важно вывести на экран именно численное значение,
        то можно описать все сценарии в виде трех вариантов:
        1. когда первое число больше или равно второму и третьему
        2. когда второе число больше или равно первому и третьему
        3. когда третье число больше или равно первому и второму (т.е. все остальные случаи,
        которые не подходят под 1 и 2 определение) */

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("The biggest number is " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("The biggest number is " + secondNumber);
        } else {
            System.out.println("The biggest number is " + thirdNumber);
        }

    }

}
