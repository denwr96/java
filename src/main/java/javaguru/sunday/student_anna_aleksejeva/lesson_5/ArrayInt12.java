package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_5;

import java.util.Random;
public class ArrayInt12 {
    public static void main(String[] args) {
    int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(" First number " + array[0]);
        System.out.println(" Second number " + array[1]);
        System.out.println(" Third number " + array[2]);
    }
}
