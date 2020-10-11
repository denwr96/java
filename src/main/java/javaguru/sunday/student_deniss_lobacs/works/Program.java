package main.java.javaguru.sunday.student_deniss_lobacs.works;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Program obj = new Program();
        Scanner scn = new Scanner(System.in);
        int result, n;

        System.out.print("Enter you number: ");
        n = scn.nextInt();

        result = obj.myFunction(n);

        System.out.println("Square: " + result);

    }

    public int myFunction(int a) {

        return a * a;

    }

}

