package javaguru.sunday.student_kristina_sutugina.lesson_5.level_2;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_12 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i] = (int) (Math.random() * 100));
        }
    }
}
