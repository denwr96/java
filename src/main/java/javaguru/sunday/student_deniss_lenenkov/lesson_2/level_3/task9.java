package javaguru.sunday.student_deniss_lenenkov.lesson_2.level_3;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Можно обойтись без лишних констант. Мы можем просто напрямую прописать эти инты в ваши строки System.out.println(number + x + 1 + = + p1)")
public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert one number:");
        int number = scanner.nextInt();

         byte a = 1;
         byte b = 2;
         byte c = 3;
         byte d = 4;
         byte e = 5;
         byte f = 6;
         byte g = 7;
         byte h = 8;
         byte j = 9;
         byte z = 10;

         int p1 = number * a;
        System.out.println(number + "x" + a + "=" + p1);

        int p2 = number * b;
        System.out.println(number + "x" + b + "=" + p2);

        int p3 = number * c;
        System.out.println(number + "x" + c + "=" + p3);

        int p4 = number * d;
        System.out.println(number + "x" + d + "=" + p4);

        int p5 = number * e;
        System.out.println(number + "x" + e + "=" + p5);

        int p6 = number * f;
        System.out.println(number + "x" + f + "=" + p6);

        int p7 = number * g;
        System.out.println(number + "x" + g + "=" + p7);

        int p8 = number * h;
        System.out.println(number + "x" + h + "=" + p8);

        int p9 = number * j;
        System.out.println(number + "x" + j + "=" + p9);

        int p10 = number * z;
        System.out.println(number + "x" + z + "=" + p10);





    }
}
