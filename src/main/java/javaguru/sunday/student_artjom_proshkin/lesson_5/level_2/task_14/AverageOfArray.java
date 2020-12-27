package javaguru.sunday.student_artjom_proshkin.lesson_5.level_2.task_14;

import java.util.Random;

class AverageOfArray {

    public static void main(String[] args) {

        int[] arrayAverage = new int[3];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arrayAverage.length; i++) {
            arrayAverage[i] = random.nextInt(30);
            sum = sum + arrayAverage[i];
        }
        double average = (double) sum / arrayAverage.length;

        for (int i = 0; i < arrayAverage.length; i++) {
            System.out.println("i = " + i + "; Number = " + arrayAverage[i]);
        }
        System.out.println("Average of i = " + average);
    }
}
