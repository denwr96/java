package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_1_intern.task_3;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Please enter number from 1 to 7 ");

        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        switch ( dayNumber ){
            case 1 :
                System.out.println("Monday, time to work");
                break;
            case 2 :
                System.out.println("Tuesday, another day to work");
                break;
            case 3 :
                System.out.println("Wednesday, it's a little Friday");
                break;
            case 4 :
                System.out.println("Thursday,almost friday");
                break;
            case 5 :
                System.out.println("Friday, time to party after work");
                break;
            case 6 :
                System.out.println("Saturday, enjoyed a party yesterday?");
                break;
            case 7 :
                System.out.println("Sunday, 9.30, JAVAGURU");
                break;
            default :
                System.out.println("It's a long week you have :)");
        }


    }
}
