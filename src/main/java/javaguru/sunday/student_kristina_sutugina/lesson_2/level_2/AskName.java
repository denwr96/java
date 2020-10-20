package main.java.javaguru.sunday.student_kristina_sutugina.lesson_2.level_2;
//Task_8
import java.util.Scanner;

 class AskName {
    public static void main(String[] args) {
        System.out.println("Please, enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + " !");

    }
}
