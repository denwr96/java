package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl3.task8;
import java.util.Scanner;

public class ThreeEquals {
    public static void main(String[] args) {
        System.out.println("CHECK IF THREE OF YOUR NUMBERS ARE EQUAL ON NOT!");

        //Scanner takes three input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int firstInput = scanner.nextInt();
        System.out.print("Second number: ");
        int secondInput = scanner.nextInt();
        System.out.print("Third number: ");
        int thirdInput = scanner.nextInt();


        //Checks if numbers are equal, different or neither, prints message
        if (firstInput == secondInput && thirdInput == secondInput) {
            System.out.println("All numbers are equal");
        } else if (firstInput != secondInput && firstInput != thirdInput && secondInput != thirdInput) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }




    }
}
