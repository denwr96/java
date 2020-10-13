package main.java.javaguru.sunday.student_anna_aleksejeva;
import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" plus");
        int a = scanner.nextInt();

        System.out.println("plus");
        int b = scanner.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c = a + b;
        System.out.println("a + b = " + c);

        System.out.println("minus");
        int q = scanner.nextInt();
        System.out.println("minus");
        int w = scanner.nextInt();
        System.out.println("q = " + q);
        System.out.println("w = " + w);
        int e = q - w;
        System.out.println("q - w = " + e);

        System.out.println("multiply");
        int r = scanner.nextInt();
        System.out.println("multiply");
        int t = scanner.nextInt();
        System.out.println("r = " + r);
        System.out.println("t =" + t);
        int y = r * t;
        System.out.println("r * t = " +y);

        System.out.println("divide");
        int u = scanner.nextInt();
        System.out.println("divide");
        int i = scanner.nextInt();
        System.out.println("u = " + u);
        System.out.println("i = " + i);
        int o = u / i;
        System.out.println("u / i = " + o);

    }
}