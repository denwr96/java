package javaguru.sunday.student_andrejs_ivanovs.lesson2;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Следите за форматом. Я вам не много поправил форматирование")
public class Task1 {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);
        System.out.println("Enter number one");
        int firstNumber = Scann.nextInt();
        System.out.println("Enter number two");
        int secondNumber = Scann.nextInt();
        int resultOne = firstNumber + secondNumber;
        int resultTwo = firstNumber - secondNumber;
        int resultThree = firstNumber * secondNumber;
        int resultFour = firstNumber / secondNumber;
        System.out.println("Number one + number two = " + resultOne);
        System.out.println("Number one - number two = " + resultTwo);
        System.out.println("Number one * number two = " + resultThree);
        System.out.println("Number one / number two = " + resultFour);

    }
}
