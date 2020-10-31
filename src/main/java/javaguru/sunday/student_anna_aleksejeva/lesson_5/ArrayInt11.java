package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_5;

import java.util.Scanner;
public class ArrayInt11 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println(" Three random int numbers ");
        int[] myArray = new int [3];
        myArray[0] = mysc.nextInt();
        myArray[1] = mysc.nextInt();
        myArray[2] = mysc.nextInt();
        System.out.println(" ");
        System.out.println("First number " + myArray[0]);
        System.out.println("Second number " + myArray[1]);
        System.out.println("Third number " + myArray[2]);

    }
}
