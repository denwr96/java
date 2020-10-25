package main.java.javaguru.sunday.teacher.lesson_5.lessoncode;

public class ArraysExample {

    public static void main(String[] args) {
        int[] myIntegerArray = new int[4];

        myIntegerArray[0] = 10;
        myIntegerArray[1] = 20;
        myIntegerArray[2] = 30;
        myIntegerArray[3] = 40;

        System.out.println(myIntegerArray[3]);
        System.out.println(myIntegerArray[2]);
        System.out.println(myIntegerArray[1]);
        System.out.println(myIntegerArray[0]);

        myIntegerArray[3] = 100;

        System.out.println(myIntegerArray[3]);
    }
}
