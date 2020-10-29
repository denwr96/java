package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class UserArrayRandom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int[] number = new int[scanner.nextInt()];


        Random random = new Random();
        for (int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println("Number one: " + number[0]);
        System.out.println("Number two: " + number[1]);
        System.out.println("Number three: " + number[2]);

    }
}
