package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl3;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не очень нравяться названия переменных. Пишите уже лучше number ")
//Pochemu immeno? Num ploxo ili fakt nazvanija 'number'? Kak nazvatj horosho?
public class Average {
    public static  void main(String[] args) {

        //Makes scanner and prints input message
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three input numbers: ");

        //Takes three input numbers
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();


        //Calculates result and assign it to variable
        double result = (num1 + num2 + num3) / 3;

        //Prints result
        System.out.println("Average of numbers: " + result);

    }
}
