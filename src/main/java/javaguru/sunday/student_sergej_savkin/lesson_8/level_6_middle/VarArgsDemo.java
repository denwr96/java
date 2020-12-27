package javaguru.sunday.student_sergej_savkin.lesson_8.level_6_middle;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VarArgsDemo {

    public static void main(String[] args) {
        VarArgsDemo varArgsDemo = new VarArgsDemo();
        System.out.println(varArgsDemo.calculateNumberSum(1, 2, 3));
    }

    public int calculateNumberSum(int... numbers) {
        int sumOfNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        return sumOfNumbers;
    }
}
