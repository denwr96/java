package javaguru.sunday.student_natalia_kochkina.lesson_5.level_4;

//Task_27

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
public class NewRandomArray2 {

    public static void main(String[] args) {
        int[] newArray = new int[3];
        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
            System.out.println(newArray[i]);
        }
        int maxNumber = newArray[0];

        for (int i = 0; i < newArray.length; i++) {
            if (maxNumber < newArray[i]) {
                maxNumber = newArray[i];
            }
        }
        System.out.println("Max number = " + maxNumber);
    }
}
