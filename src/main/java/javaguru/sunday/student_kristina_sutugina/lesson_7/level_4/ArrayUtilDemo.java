package javaguru.sunday.student_kristina_sutugina.lesson_7.level_4;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArray(arrayUtil.createArray());
        int sum = arrayUtil.calculateSum(array);
        int average = arrayUtil.calculateAverage(sum);
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Original array: ");
        arrayUtil.print(array);
        System.out.println("Sorted array: ");
        arrayUtil.print(arrayUtil.sortArray(array));
        System.out.println("Increased by 2 array: ");
        arrayUtil.print(arrayUtil.increaseElementOfArray(array));
    }
}
