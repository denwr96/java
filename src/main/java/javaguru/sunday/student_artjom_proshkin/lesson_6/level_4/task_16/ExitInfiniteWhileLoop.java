package javaguru.sunday.student_artjom_proshkin.lesson_6.level_4.task_16;


import java.util.Scanner;

class ExitInfiniteWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Guess number ( 0 to 5 ) to exit:");
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Good Bye");
                break;
            }
        }
    }
}
