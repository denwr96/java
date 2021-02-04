package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl2.task7;
import java.util.Scanner;

public class EqualsOrNot {
    public static void main(String[] args) {

        System.out.println("DOES THESE NUMBERS ARE EQUAL?");
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int inputOne = scanner.nextInt();
        System.out.print("Second number: ");
        int inputTwo = scanner.nextInt();

        Integer numberOne = inputOne;
        Integer numberTwo = inputTwo;

       if (numberOne.equals(numberTwo)) {
           System.out.println("Numbers are equal");
       } else {
           System.out.println("Numbers are different");
        }




    }
}
