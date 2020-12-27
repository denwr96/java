package javaguru.sunday.student_mihails_gutmans.lesson4.level1;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        System.out.println("Please enter number from 1 till 7");

        Scanner enterNumber = new Scanner(System.in);
        int consoleNumber = enterNumber.nextInt();

        switch (consoleNumber){
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunda");
                break;
            default: System.out.println("Not correct number . Please enter number from 1 till 7");
        }
    }
}
