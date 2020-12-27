package javaguru.sunday.student_kristina_sutugina.lesson_5.level_4;
//нет codeReview
import java.util.Arrays;
import java.util.Scanner;

class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array's length: ");
        int lengthFromUSer = scanner.nextInt();
        int[] array = new int[lengthFromUSer];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Fill the array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
