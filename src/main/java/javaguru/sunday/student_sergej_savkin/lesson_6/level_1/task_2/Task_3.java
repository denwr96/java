package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_1.task_2;

import java.util.Scanner;

class Task_3 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();

        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        System.out.println(dayOfTheWeekDetector.detectDayName(firstNumber));
    }
}
