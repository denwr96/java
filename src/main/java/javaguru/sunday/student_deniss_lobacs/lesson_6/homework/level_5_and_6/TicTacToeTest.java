package main.java.javaguru.sunday.student_deniss_lobacs.lesson_6.homework.level_5_and_6;

import java.util.Arrays;

public class TicTacToeTest {
    private TicTacToe victim = new TicTacToe();

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        System.out.println("\nТесты для определения является ли данная позиция победной по горизонталям для указанного игрока.\n");
        test.isWinPositionForHorizontalFirstPlayerTest1();
        test.isWinPositionForHorizontalFirstPlayerTest2();
        test.isWinPositionForHorizontalFirstPlayerTest3();
        test.isWinPositionForHorizontalFirstPlayerFailed();
        test.isWinPositionForHorizontalSecondPlayerTest1();
        test.isWinPositionForHorizontalSecondPlayerTest2();
        test.isWinPositionForHorizontalSecondPlayerTest3();
        test.isWinPositionForHorizontalSecondPlayerFailed();

        System.out.println("\nТесты для определения является ли данная позиция победной по вертикали для указанного игрока.\n");
        test.isWinPositionForVerticalFirstPlayerTest1();
        test.isWinPositionForVerticalFirstPlayerTest2();
        test.isWinPositionForVerticalFirstPlayerTest3();
        test.isWinPositionForVerticalFirstPlayerFailed();
        test.isWinPositionForVerticalSecondPlayerTest1();
        test.isWinPositionForVerticalSecondPlayerTest2();
        test.isWinPositionForVerticalSecondPlayerTest3();
        test.isWinPositionForVerticalSecondPlayerFailed();

        System.out.println("\nТесты для определения является ли данная позиция победной по диагоналям для указанного игрока.\n");
        test.isWinPositionForDiagonalsFirstPlayerFirstDiagonalTest();
        test.isWinPositionForDiagonalsFirstPlayerSecondDiagonalTest();
        test.isWinPositionForDiagonalsFirstPlayerDiagonalsFailedTest();
        test.isWinPositionForDiagonalsSecondPlayerFirstDiagonalTest();
        test.isWinPositionForDiagonalsSecondPlayerSecondDiagonalTest();
        test.isWinPositionForDiagonalsSecondPlayerDiagonalsFailedTest();

        System.out.println("\nТесты для определения является ли данная позиция победной для указанного игрока.\n");
        test.isWinPositionForFirstPlayerHorizontallyTest();
        test.isWinPositionForFirstPlayerVerticallyTest();
        test.isWinPositionForFirstPlayerDiagonallyTest();
        test.isWinPositionForFirstPlayerFailedTest();
        test.isWinPositionForSecondPlayerHorizontallyTest();
        test.isWinPositionForSecondPlayerVerticallyTest();
        test.isWinPositionForSecondPlayerDiagonallyTest();
        test.isWinPositionForSecondPlayerFailedTest();

        System.out.println("\nТесты для определения является ли данная позиция ничейной.\n");
        test.isDrawPositionFirstCombinationTest();
        test.isDrawPositionSecondCombinationTest();
        test.isDrawPositionThirdCombinationTest();
        test.isDrawPositionFailedTest();

        System.out.println("\nТест для определения создания двухмерного массива целых чисел и встваки в каждую ячейку массива значение -1.\n");
        test.isCreatedFieldTest();
        test.isCreatedFieldFailedTest();
    }

    public void isWinPositionForHorizontalFirstPlayerTest1() {
        int[][] myArray = {{0, 0, 0}, {1, 1, 1}, {1, 1, 1}};
        check(victim.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalFirstPlayerTest1");
    }

    public void isWinPositionForHorizontalFirstPlayerTest2() {
        int[][] myArray = {{1, 1, 1}, {0, 0, 0}, {0, 1, 0}};
        check(victim.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalFirstPlayerTest2");
    }

    public void isWinPositionForHorizontalFirstPlayerTest3() {
        int[][] myArray = {{1, 1, 1}, {1, 1, 1}, {0, 0, 0}};
        check(victim.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalFirstPlayerTest3");
    }

    public void isWinPositionForHorizontalFirstPlayerFailed() {
        int[][] myArray = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        check(victim.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalSecondPlayerIsFailedTest");
    }

    public void isWinPositionForHorizontalSecondPlayerTest1() {
        int[][] myArray = {{1, 1, 1}, {1, -1, -1}, {0, 1, 0}};
        check(victim.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalSecondPlayerTest1");
    }

    public void isWinPositionForHorizontalSecondPlayerTest2() {
        int[][] myArray = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        check(victim.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalSecondPlayerTest2");
    }

    public void isWinPositionForHorizontalSecondPlayerTest3() {
        int[][] myArray = {{0, 0, 0}, {0, 0, 0}, {1, 1, 1}};
        check(victim.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalSecondPlayerTest3");
    }

    public void isWinPositionForHorizontalSecondPlayerFailed() {
        int[][] myArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        check(victim.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalSecondPlayerIsFailedTest");
    }

    public void isWinPositionForVerticalFirstPlayerTest1() {
        int[][] myArray = {{0, 1, 1}, {0, 1, 1}, {0, 1, 1}};
        check(victim.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalFirstPlayerTest1");
    }

    public void isWinPositionForVerticalFirstPlayerTest2() {
        int[][] myArray = {{1, 0, 1}, {1, 0, 1}, {1, 0, 1}};
        check(victim.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalFirstPlayerTest2");
    }

    public void isWinPositionForVerticalFirstPlayerTest3() {
        int[][] myArray = {{1, 1, 0}, {1, 1, 0}, {1, 1, 0}};
        check(victim.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalFirstPlayerTest3");
    }

    public void isWinPositionForVerticalFirstPlayerFailed() {
        int[][] myArray = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        check(victim.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalFirstPlayerIsFailedTest");
    }

    public void isWinPositionForVerticalSecondPlayerTest1() {
        int[][] myArray = {{0, 1, 1}, {0, 1, 1}, {0, 1, 1}};
        check(victim.isWinPositionForVerticals(myArray, 1), "isWinPositionForVerticalSecondPlayerTest1");
    }

    public void isWinPositionForVerticalSecondPlayerTest2() {
        int[][] myArray = {{0, 1, 1}, {0, 1, 1}, {0, 1, 1}};
        check(victim.isWinPositionForVerticals(myArray, 1), "isWinPositionForVerticalSecondPlayerTest2");
    }

    public void isWinPositionForVerticalSecondPlayerTest3() {
        int[][] myArray = {{0, 1, 1}, {0, 1, 1}, {0, 1, 1}};
        check(victim.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalSecondPlayerTest3");
    }

    public void isWinPositionForVerticalSecondPlayerFailed() {
        int[][] myArray = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        check(victim.isWinPositionForVerticals(myArray, 1), "isWinPositionForVerticalSecondPlayerIsFailedTest");
    }

    public void isWinPositionForDiagonalsFirstPlayerFirstDiagonalTest() {
        int[][] myArray = {{0, 1, 1}, {1, 0, 1}, {1, 1, 0}};
        check(victim.isWinPositionForDiagonals(myArray, 0), "isWinPositionForDiagonalsFirstPlayerFirstDiagonalTest");
    }

    public void isWinPositionForDiagonalsFirstPlayerSecondDiagonalTest() {
        int[][] myArray = {{0, 1, 0}, {1, 0, 1}, {0, 1, 1}};
        check(victim.isWinPositionForDiagonals(myArray, 0), "isWinPositionForDiagonalsFirstPlayerSecondDiagonalTest");
    }

    public void isWinPositionForDiagonalsFirstPlayerDiagonalsFailedTest() {
        int[][] myArray = {{0, 1, 1}, {1, 1, 1}, {1, 1, 0}};
        check(victim.isWinPositionForDiagonals(myArray, 0), "isWinPositionForDiagonalsFirstPlayerDiagonalsFailedTest");
    }

    public void isWinPositionForDiagonalsSecondPlayerFirstDiagonalTest() {
        int[][] myArray = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        check(victim.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsSecondPlayerFirstDiagonalTest");
    }

    public void isWinPositionForDiagonalsSecondPlayerSecondDiagonalTest() {
        int[][] myArray = {{0, 0, 1}, {0, 1, 0}, {1, 0, 0}};
        check(victim.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsSecondPlayerSecondDiagonalTest");
    }

    public void isWinPositionForDiagonalsSecondPlayerDiagonalsFailedTest() {
        int[][] myArray = {{0, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        check(victim.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsSecondPlayerDiagonalsFailedTest");
    }

    public void isWinPositionForFirstPlayerHorizontallyTest() {
        int[][] myArray = {{0, 0, 0}, {1, 1, 1}, {1, 1, 1}};
        check(victim.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerHorizontallyTest");
    }

    public void isWinPositionForFirstPlayerVerticallyTest() {
        int[][] myArray = {{0, 0, 1}, {0, 0, 1}, {0, 1, 1}};
        check(victim.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerVerticallyTest");
    }

    public void isWinPositionForFirstPlayerDiagonallyTest() {
        int[][] myArray = {{0, 0, 0}, {0, 0, 1}, {0, 1, 0}};
        check(victim.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerDiagonallyTest");
    }

    public void isWinPositionForFirstPlayerFailedTest() {
        int[][] myArray = {{1, 0, 1}, {1, 1, 1}, {0, 1, 0}};
        check(victim.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerFailedTest");
    }

    public void isWinPositionForSecondPlayerHorizontallyTest() {
        int[][] myArray = {{1, 1, 1}, {0, 0, 0}, {0, 0, 0}};
        check(victim.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerHorizontallyTest");
    }

    public void isWinPositionForSecondPlayerVerticallyTest() {
        int[][] myArray = {{0, 0, 1}, {0, 0, 1}, {0, 1, 1}};
        check(victim.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerVerticallyTest");
    }

    public void isWinPositionForSecondPlayerDiagonallyTest() {
        int[][] myArray = {{1, 0, 0}, {0, 1, 1}, {0, 1, 1}};
        check(victim.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerDiagonallyTest");
    }

    public void isWinPositionForSecondPlayerFailedTest() {
        int[][] myArray = {{0, 0, 1}, {1, 1, 0}, {0, 1, 0}};
        check(victim.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerFailedTest");
    }

    public void isDrawPositionFirstCombinationTest() {
        int[][] myArray = {{1, 0, 0}, {0, 1, 1}, {0, 1, 0}};
        check(victim.isDrawPosition(myArray), "isDrawPositionFirstCombinationTest");
    }

    public void isDrawPositionSecondCombinationTest() {
        int[][] myArray = {{1, 1, 0}, {0, 1, 1}, {1, 0, 0}};
        check(victim.isDrawPosition(myArray), "isDrawPositionSecondCombinationTest");
    }

    public void isDrawPositionThirdCombinationTest() {
        int[][] myArray = {{0, 0, 0}, {1, 0, 1}, {0, 1, 1}};
        check(victim.isDrawPosition(myArray), "isDrawPositionThirdCombinationTest");
    }

    public void isDrawPositionFailedTest() {
        int[][] myArray = {{0, 0, 0}, {0, -1, 0}, {0, 0, 0}};
        check(victim.isDrawPosition(myArray), "isDrawPositionFailedTest");
    }

    public void isCreatedFieldTest() {
        int[][] receivedArray;
        receivedArray = victim.createField();
        int[][] expectedArray = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        check(Arrays.deepEquals(expectedArray, receivedArray), "isCreatedFieldTest");
    }

    public void isCreatedFieldFailedTest() {
        int[][] receivedArray;
        receivedArray = victim.createField();
        int[][] expectedArray = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};
        check(Arrays.deepEquals(expectedArray, receivedArray), "isCreatedFieldFailedTest");
    }

    public boolean check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
            return condition = true;
        } else {
            System.out.println(testName + " = FAILED");
            return condition = false;
        }
    }

}

