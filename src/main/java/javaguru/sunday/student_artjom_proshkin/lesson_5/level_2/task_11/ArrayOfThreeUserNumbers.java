package javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_11;

import java.util.Scanner;


class ArrayOfThreeUserNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Please enter 3 numbers: ");
        int[] arrayTwo = new int[3];
        arrayTwo[0] = scanner.nextInt();
        arrayTwo[1] = scanner.nextInt();
        arrayTwo[2] = scanner.nextInt();
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.println("i = " + i + "; Number = " + arrayTwo[i]);
        }
    }
}
