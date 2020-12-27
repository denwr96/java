package javaguru.sunday.student_deniss_lenenkov.lesson_4.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Если я ничего не путаю, то последнее условие else if тоже лишнее, два предыдущих условия исключают любую другую возможную комбинацию.")
public class ThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Enter third number: ");
        int numberThree = scanner.nextInt();

        if (numberOne >= numberTwo && numberOne >= numberThree){
            System.out.println(numberOne);
        }else if (numberTwo >= numberOne && numberTwo >=numberThree){
            System.out.println(numberTwo);
        }else if (numberThree >= numberOne && numberThree >= numberTwo){
            System.out.println(numberThree);
        }




    }
}
