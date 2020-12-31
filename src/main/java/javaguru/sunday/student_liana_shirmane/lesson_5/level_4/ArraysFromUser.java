package javaguru.sunday.student_liana_shirmane.lesson_5.level_4;
//task25


import java.util.Scanner;

public class ArraysFromUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array length");
        int arrayLength = scanner.nextInt();
        int[] numbersFromUser = new int[arrayLength];
        for (int i = 0; i < numbersFromUser.length; i++) {
            System.out.println("Please enter number");
            numbersFromUser[i] = scanner.nextInt();
        }
        for (int j : numbersFromUser) {
            System.out.println(j);
        }
    }
}