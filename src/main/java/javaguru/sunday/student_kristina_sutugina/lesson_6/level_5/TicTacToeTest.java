package javaguru.sunday.student_kristina_sutugina.lesson_6.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;

//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
@CodeReview(approved = true)
class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest victim = new TicTacToeTest();
        victim.isWinPositionForHorizontalsTest();
        victim.isWinPositionForVerticalsTest();
        victim.isWinPositionForDiagonalsTest();
        victim.isWinPositionTest();
        victim.isDrawPositionTest();
        victim.createFieldTest();

    }

    public void isWinPositionForHorizontalsTest() {
        TicTacToe victim = new TicTacToe();
        int playerToCheck = 1;
        int[][] array = {{1, 0, 1}, {1, 0, 0}, {1, 1, 1}};
        boolean condition = victim.isWinPositionForHorizontals(array, playerToCheck);
        check(true, condition, "isWinPositionForHorizontals");
    }

    public void isWinPositionForVerticalsTest() {
        TicTacToe victim = new TicTacToe();
        int playerToCheck = 0;
        int[][] array = {{0, 0, 1}, {1, 0, 0}, {1, 0, 1}};
        boolean condition = victim.isWinPositionForVerticals(array, playerToCheck);
        check(true, condition, "isWinPositionForVerticals");
    }

    public void isWinPositionForDiagonalsTest() {
        TicTacToe victim = new TicTacToe();
        int playerToCheck = 1;
        int[][] array = {{0, 0, 1}, {1, 1, 0}, {1, 0, 1}};
        boolean condition = victim.isWinPositionForDiagonals(array, playerToCheck);
        check(true, condition, "isWinPositionForDiagonalsTest");
    }

    public void isWinPositionTest() {
        TicTacToe victim = new TicTacToe();
        int playerToCheck = 0;
        int[][] array = {{1, 0, 1}, {0, 0, 0}, {1, 1, 1}};
        boolean condition = victim.isWinPosition(array, playerToCheck);
        check(true, condition, "isWinPositionTest");
    }

    public void isDrawPositionTest() {
        TicTacToe victim = new TicTacToe();
        int[][] array = {{0, 0, 1}, {1, 1, 0}, {0, 1, 1}};
        boolean condition = victim.isDrawPosition(array);
        check(true, condition, "isDrawPositionTest");
    }

    public void createFieldTest() {
        TicTacToe victim = new TicTacToe();
        int[][] array = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        int[][] createdArray = victim.createField();
        if (Arrays.deepEquals(array, createdArray)) {
            System.out.println("createFieldTest test passed!");
        } else {
            System.out.println("createFieldTest test failed!");
        }
    }

    public void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " test passed!");
        } else {
            System.out.println(testName + " test failed!");
        }
    }
}
