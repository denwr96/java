package javaguru.sunday.student_kristina_sutugina.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

//Task_13
//Task_14
//Task_15
@CodeReview(approved = false)
@CodeReviewComment(comment = "Разделяй и властвуй - не надо пытаться запихать всю логику в один цикл, метод, класс. Нужно пытаться сохранять атомарность отдельно заполнили массив, отдельно показали на консоль" +
        "и отдельно посчитали сумму и среднее")
class Task_13 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        int sum = 0;
        int average = 0;
        int count = 2;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100);
            System.out.println(randomNumbers[i]);
            sum = randomNumbers[0] + randomNumbers[1] + randomNumbers[2];
            average = sum / randomNumbers.length;
        }
        randomNumbers[0] = randomNumbers[0] + count;
        randomNumbers[1] = randomNumbers[1] + count;
        randomNumbers[2] = randomNumbers[2] + count;
        System.out.println("Increased by 2 number: " + randomNumbers[0]);
        System.out.println("Increased by 2 number: " + randomNumbers[1]);
        System.out.println("Increased by 2 number: " + randomNumbers[2]);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}