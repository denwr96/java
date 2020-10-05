package main.java.javaguru.sunday.student_deniss_lobacs.lesson2.homework.level_3_junior.task9;

import java.util.Scanner;

public class Multi {
    static Scanner scn=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter number: ");
        int yourNumber=scn.nextInt();

        for(int i=1;i<=10;i++) {

            System.out.println(yourNumber*i);

        }

    }
}
