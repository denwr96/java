package javaguru.sunday.student_konstantin_shestakov.lesson_8.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task 30
@CodeReview(approved = true)
class Varargs {

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        varargs.sumAll(1, 2, 3, 10);
    }

    public int sumAll(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            System.out.println("+ " + numbers[i] + " = " + sum);
        }
        return sum;
    }
}
