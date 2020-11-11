package main.java.javaguru.sunday.teacher.lesson_7.lessoncode.demo;

public class Arrays {

    public static void main(String[] args) {

        int[][] myArrays = new int[3][3];
        int[][] myArraysV2 = {{1,2,3},
                              {4,5,6},
                              {7,8,9}};

        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays.length; j++) {
                myArrays[i][j] = i + j;
            }
        }


        for (int i = 0; i < myArrays.length; i++) {
            for (int j = 0; j < myArrays.length; j++) {
                System.out.println(myArraysV2[i][j]);
            }
        }
    }
}
