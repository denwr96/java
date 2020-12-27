package javaguru.sunday.student_jelena_lavrenuka.lesson_12.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number");
        try{
            int number = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error!");
            System.out.println("Not integer number entered");
            System.out.println("");
        }finally{
            System.out.println("Please enter integer number");
        }
    }
}
