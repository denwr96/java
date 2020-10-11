package main.java.javaguru.sunday.student_andrejs_ivanovs.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);
        System.out.println("Enter number one");
        int FirstNumber = Scann.nextInt();
        System.out.println("Enter number two");
        int SecondNumber = Scann.nextInt();
int ResultOne = FirstNumber + SecondNumber;
int ResultTwo = FirstNumber - SecondNumber;
int ResultThree = FirstNumber *  SecondNumber;
int ResultFour =  FirstNumber / SecondNumber;
System.out.println("Number one + number two = "+ResultOne);
        System.out.println("Number one - number two = "+ResultTwo);
        System.out.println("Number one * number two = "+ResultThree);
        System.out.println("Number one / number two = "+ResultFour);

    }
}
