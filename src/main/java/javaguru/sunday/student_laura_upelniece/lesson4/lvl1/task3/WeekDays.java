package main.java.javaguru.sunday.student_laura_upelniece.lesson4.lvl1.task3;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        System.out.print("Enter number between 1 and 7: ");
        Scanner scanner = new Scanner(System.in);
        int weekDayInput = scanner.nextInt();


        switch (weekDayInput) {
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
                System.out.println("Invalid input...try again!");
        }


    }
}
