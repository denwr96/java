package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_6.level_5_and_6;

// Task 19
// Task 20
// Task 21
// Task 22
// Task 23
// Task 24

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();
        ticTacToeTest.isWinPositionForHorizontalsTest();
        ticTacToeTest.isWinPositionForVerticalsTest();
        ticTacToeTest.isWinPositionForDiagonalsTest();
        ticTacToeTest.isWinPositionTest();
        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.createFieldTest();
    }

    TicTacToe ticTacToe = new TicTacToe();

    void isWinPositionForHorizontalsTest() {
        int[][] field = { {0, 0, 0}, {-1, 0, 1}, {1, -1, 1} };
        ticTacToe.printFieldToConsole(field);
        checkResults(ticTacToe.isWinPositionForHorizontals(field,0), "Horizontal win test 1");
        int[][] field2 = { {-1, 0, 1}, {0, 0, 0}, {1, -1, 1} };
        ticTacToe.printFieldToConsole(field2);
        checkResults(ticTacToe.isWinPositionForHorizontals(field2,0), "Horizontal win test 2");
        int[][] field3 = { {-1, 0, 1}, {1, 1, -1}, {0, 0, 0} };
        ticTacToe.printFieldToConsole(field3);
        checkResults(ticTacToe.isWinPositionForHorizontals(field3,0), "Horizontal win test 3");
    }

    void isWinPositionForVerticalsTest() {
        int[][] field = { {0, -1, 1}, {0, 0, 1}, {0, -1, 1} };
        ticTacToe.printFieldToConsole(field);
        checkResults(ticTacToe.isWinPositionForVerticals(field,0), "Vertical win test");
    }

    void isWinPositionForDiagonalsTest() {
        int[][] field = { {0, -1, 1}, {1, 0, 1}, {0, -1, 0} };
        ticTacToe.printFieldToConsole(field);
        checkResults(ticTacToe.isWinPositionForDiagonals(field,0), "Diagonal win test");
    }

    void isWinPositionTest() {
        int[][] field = { {0, -1, 1}, {0, 0, 1}, {1, -1, 0} };
        ticTacToe.printFieldToConsole(field);
        checkResults(ticTacToe.isWinPosition(field,0), "Win test");
    }

    void isDrawPositionTest() {
        int[][] field = { {1, 0, 0}, {0, 0, 1}, {1, 1, 0} };
        ticTacToe.printFieldToConsole(field);
        checkResults(ticTacToe.isDrawPosition(field), "Draw test");
    }

    void createFieldTest() {
        int[][] field = ticTacToe.createField(3,3);
        int[][] expectedField = { {-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1} };
        System.out.println("Expected result:");
        ticTacToe.printFieldToConsole(field);
        System.out.println("Result:");
        ticTacToe.printFieldToConsole(field);
        checkResults(Arrays.deepEquals(field, expectedField), "Create field test");
    }

    public boolean checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK\n");
            return condition;
        } else {
            System.out.println(testName + " = FAIL\n");
            return !condition;
        }
    }
}
