package javaguru.sunday.student_anna_aleksejeva.lesson_5;

import com.sun.source.util.SourcePositions;
import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
public class ArrayInt14 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum = sum + array[i];
        }
        int average = sum / array.length;
        System.out.println( average );
    }
}
