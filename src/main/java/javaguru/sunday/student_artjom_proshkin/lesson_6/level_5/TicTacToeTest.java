package main.java.javaguru.sunday.student_artjom_proshkin.lesson_6.level_5;

//Task_19,Task_20,Task_21,Task_22,Task_23,
//Task_24,Task_26,

import java.util.Arrays;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.horizontalWinTest();
        test.verticalWinTest();
        test.diagonalWinTest();
        test.isWinPosition0WinTest();
        test.isWinPosition1WinTest();
        test.fieldIsFullTest();
        test.isDrawTest();
        test.createFieldTest();
        test.fieldPrintTest();

    }

    void horizontalWinTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, 1, -1}, {-1, 1, -1}, {0, 0, 0}};
        checkResult(victim.isWinPositionForHorizontals(field, 0), "horizontalWinTest");
    }

    void verticalWinTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, -1, 1}, {-1, -1, 1}, {-1, -1, 1}};
        checkResult(victim.isWinPositionForVerticals(field, 1), "verticalWinTest");
    }

    void diagonalWinTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 1, -1}, {-1, 0, 1}, {0, -1, 0}};
        checkResult(victim.isWinPositionForDiagonals(field, 0), "diagonalWinTest");
    }

    void isWinPosition0WinTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 1, 1}, {0, 1, 0}, {1, 0, 1}};
        checkResult(victim.isWinPosition(field, 1), "isWinPosition0WinTest");

    }

    void isWinPosition1WinTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 1, 1}, {1, 0, 1}, {0, -1, 1}};
        checkResult(victim.isWinPosition(field, 1), "isWinPosition1WinTest");

    }

    void fieldIsFullTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 1, 1}, {1, 1, 0}, {0, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.fieldIsFull(field);
        checkResult(expectedResult,actualResult,"fieldIsFullTest");
    }

    void isDrawTest() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 1, 0}, {1, 0, 1}, {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isDrawPosition(field);
        checkResult(expectedResult,actualResult,"isDrawTest");
    }

    void createFieldTest(){
        TicTacToe victim = new TicTacToe();
        int[][] expectedField = {{-1, -1, -1},{-1, -1, -1},{-1, -1, -1}};
        int[][] actualField = victim.createField();
        checkResult(Arrays.deepEquals(expectedField,actualField),"createFieldTest");
    }

    void fieldPrintTest (){
        TicTacToe victim = new TicTacToe();
        int [][] testField = victim.createField();
        victim.printFieldToConsole(testField);

    }

    void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " PASSED !");
        } else
            System.out.println(testName + " FAILED !");
    }
    void checkResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " PASSED !");
        } else {
            System.out.println(testName + " FAILED !");
            System.out.println("Expected = " + expectedResult + "; Actual = " + actualResult + "; " + testName);
        }
    }



}
