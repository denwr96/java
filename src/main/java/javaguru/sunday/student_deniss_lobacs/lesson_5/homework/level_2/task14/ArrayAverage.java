package javaguru.sunday.student_deniss_lobacs.lesson_5.homework.level_2.task14;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Random;
@CodeReview(approved = true)
@CodeReviewComment(comment = "Про сложность алгоритмов я вам еще не рассказывал, но если чисто логически подумать" +
        "У вас есть операвция сложения и деления. Можно было посчитать сумму - (n) операций и поделить (1 операция)" +
        "Вы сделали n + n операций, чтобы сделать расчет.")
public class ArrayAverage  {
    public static void main(String[] args) {
        Random random = new Random();
        double[] myArray = new double[3];

        myArray[0] = random.nextInt(10);
        myArray[1] = random.nextInt(10);
        myArray[2] = random.nextInt(10);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);

        double result = 0;
        for (int i = 0; i < myArray.length; i++) {
            result = result + myArray[i] / myArray.length;
        }
        System.out.println( "Average = " + result );
    }
}