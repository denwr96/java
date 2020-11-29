package main.java.javaguru.sunday.student_mihails_gutmans.lesson4.level1;

import java.util.Scanner;

public class WhatNumber {
    public static void main(String[] args) {
        System.out.println("Please enter number");

        Scanner enterNumber = new Scanner(System.in);
        int consoleNumber = enterNumber.nextInt();

        if (consoleNumber>0){
            System.out.println("Number is positive");
        }else if (consoleNumber<0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is zero");
        }
    }
}
