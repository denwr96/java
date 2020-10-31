package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_4;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Чем больше не правильного формата, тем больнее смотреть. Для этой цели, лучшы бы подошел switch")
public class Weeks {

    public static void main(String[] args) {

        System.out.println(" Enter number from 1 to 7 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println(" Monday ");
        } else if (number == 2) {
            System.out.println(" Tuesday ");
        } else if (number == 3) {
            System.out.println(" Wednesday ");
        } else if (number == 4) {
            System.out.println(" Thursday ");
        } else if (number == 5) {
            System.out.println(" Friday ");
        } else if (number == 6) {
            System.out.println(" Saturday ");
        } else if (number == 7) {
            System.out.println(" Sunday ");
        } else {
            System.out.println(" Your number is too big ");
        }
    }
}
