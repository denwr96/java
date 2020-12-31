package javaguru.sunday.student_liana_shirmane.lesson_5.level_2;
//task12
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int[] randomNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        System.out.println("First random number is " + randomNumbers[0]);
        System.out.println("Second random number is " + randomNumbers[1]);
        System.out.println("Third random number is " + randomNumbers[2]);
    }
}
