package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl3.task10;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        System.out.println("FIND THE LARGEST NUMBER!");

        //Scanner takes three input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int first = scanner.nextInt();
        System.out.print("Second number: ");
        int second = scanner.nextInt();
        System.out.print("Third number: ");
        int third = scanner.nextInt();



        //Checks for largest numbers, prints message
        if (first > second && first > third) {
            System.out.println(first + " is the largest!");
        } else if (second > first && second > third) {
            System.out.println(second + " is the largest!");
        } else if (third > first && third > second) {
            System.out.println(third + " is the largest!");
        } else {
            System.out.println("Numbers are the same");
        }
    }
}
