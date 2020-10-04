package main.java.javaguru.sunday.student_laura_upelniece.lesson2.lvl2;

import java.util.Scanner;

public class HelloUsername {

    //Prints greeting to username
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Hello " + username);
    }
}
