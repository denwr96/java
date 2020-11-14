package main.java.javaguru.sunday.student_liana_shirmane.lesson_6.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

//task19
//task20
//task21
//task22

@CodeReview(approved = true)
public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.winFirstPlayerFirstHorizontalLine();
        test.winFirstPlayerFirstVerticalRow();
        test.winFirstPlayerDiagonals();
        test.winFirstPlayerPosition();
        test.isDraw();
    }

    void winFirstPlayerFirstHorizontalLine() {
        int[][] array = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        TicTacToe test = new TicTacToe();
        boolean actualResult = test.isWinPositionForHorizontals(array, 0);
        check(actualResult, "First player win first horizontal line");
    }

    void winFirstPlayerFirstVerticalRow() {
        int[][] array = {{0, -1, -1}, {0, -1, -1}, {0, -1, -1}};
        TicTacToe test = new TicTacToe();
        boolean actualResult = test.isWinPositionForVerticals(array, 0);
        check(actualResult, "First player win first vertical row");
    }

    void winFirstPlayerDiagonals() {
        int[][] array = {{0, -1, -1}, {-1, 0, -1}, {-1, -1, 0}};
        TicTacToe test = new TicTacToe();
        boolean actualResult = test.isWinPositionForDiagonals(array, 0);
        check(actualResult, "First player win diagonals");
    }

    void winFirstPlayerPosition(){
        int[][] array = {{-1, 0, -1}, {-1, 0, 0}, {0, 0, -1}};
        TicTacToe test = new TicTacToe();
        boolean actualResult = test.isWinPosition(array, 0);
        check(actualResult, "First player win");
    }

    void isDraw(){
        int[][] array = {{1, 0, 1}, {1, 0, 0}, {0, 1, 1}};
        TicTacToe test = new TicTacToe();
        boolean actualResult = test.isDrawPosition(array);
        check(actualResult, "Nobody win");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected: " + expectedResult + " but Actual: " + actualResult);
        }
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }
}
