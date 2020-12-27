package javaguru.sunday.student_mihails_gutmans.lesson4.level1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Please enter number");

        Scanner enterNumber = new Scanner(System.in);
        int consoleNumber = enterNumber.nextInt();


        if(consoleNumber%2==0) {
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
}
