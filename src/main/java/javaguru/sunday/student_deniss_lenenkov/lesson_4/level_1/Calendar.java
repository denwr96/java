package javaguru.sunday.student_deniss_lenenkov.lesson_4.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Тут лучше бы подошел switch")
public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("Monday");
        }else if (number == 2){
            System.out.println("Tuesday");
        }else if ( number == 3){
            System.out.println("Wednesday");
        }else if (number == 4){
            System.out.println("Thursday");
        }else if (number == 5){
            System.out.println("Friday");
        }else if (number == 6){
            System.out.println("Saturday");
        }else if (number == 7){
            System.out.println("Sunday");
        }
    }
}
