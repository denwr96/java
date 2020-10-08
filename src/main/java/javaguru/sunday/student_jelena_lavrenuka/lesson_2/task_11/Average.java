package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_2.task_11;

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Input three numbers: ");
        int Number1 = Scanner.nextInt();
        int Number2 = Scanner.nextInt();
        int Number3 = Scanner.nextInt();

        byte three = 3;

        double average = (Number1 + Number2 + Number3) / three;
        System.out.println("Average = " + average);
    }
}
