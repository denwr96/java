package main.java.javaguru.sunday.student_sergej_savkin.lesson_4.level_1_intern.task_3;

import java.util.Scanner;

class DayNumber {
    public static void main(String[] args) {
        int dayNumber;

        System.out.println("Please enter number of week day:");

        Scanner scanner = new Scanner(System.in);
        dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day number");
        }
    }
}
