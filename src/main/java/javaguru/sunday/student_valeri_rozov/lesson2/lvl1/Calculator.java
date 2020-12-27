package javaguru.sunday.student_valeri_rozov.lesson2.lvl1;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Плохие названия переменных")
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int y = scanner.nextInt();

        int sum = x + y;
        int sub = x - y;
        int multi = x * y;
        int div = x / y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    }
}
