package javaguru.sunday.student_nataliya_sinitsa.lesson6.level5.task19;

// Task 19 - Task 26

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();

        test.playerOneHasWonHorizontal();
        test.playerTwoHasWonHorizontal();
        test.noOneHasWonHorizontal1();
        test.noOneHasWonHorizontal2();

        test.playerOneHasWonVertical();
        test.playerTwoHasWonVertical();
        test.noOneHasWonVertical1();
        test.noOneHasWonVertical2();

        test.playerOneHasWonDiagonal();
        test.playerTwoHasWonDiagonal();
        test.noOneHasWonDiagonal1();
        test.noOneHasWonDiagonal2();

        test.playerOneHasWon1();
        test.playerTwoHasWon1();
        test.playerOneHasWon2();
        test.playerTwoHasWon2();
        test.playerOneHasWon3();
        test.playerTwoHasWon3();
        test.noOneHasWon1();
        test.noOneHasWon2();

        test.drawPositionShouldBeTrue();
        test.drawPositionShouldBeFalse();

        test.shouldCreateEmptyField();

        test.shouldPrintField();        // пробная распечатка с одинаковыми числами
        System.out.println();
        test.shouldPrintField2();       // пробная распечатка с разными числами

    }

    public void playerOneHasWonHorizontal() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneHorizontalWin = {  {0, 0, 0},
                                                    {-1, 1, -1},
                                                    {1, -1, -1}};
        check(victim.isWinPositionForHorizontals((arrayForPlayerOneHorizontalWin), 0),
                "playerOneHasWonHorizontal");
    }

    public void playerTwoHasWonHorizontal() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoHorizontalWin = {  {0, -1, 0},
                                                    {-1, 0, -1},
                                                    {1, 1, 1}};
        check(victim.isWinPositionForHorizontals((arrayForPlayerTwoHorizontalWin), 1),
                "playerTwoHasWonHorizontal");
    }

    public void noOneHasWonHorizontal1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneHorizontalWin = {  {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForHorizontals((arrayForNoOneHorizontalWin), 0),
                "noOneHasWonHorizontal1");
    }

    public void noOneHasWonHorizontal2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneHorizontalWin = {  {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForHorizontals((arrayForNoOneHorizontalWin), 1),
                "noOneHasWonHorizontal2");
    }

    public void playerOneHasWonVertical() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneVerticalWin = {    {-1, 0, 1},
                                                    {-1, 0, -1},
                                                    {1, 0, -1}};
        check(victim.isWinPositionForVerticals((arrayForPlayerOneVerticalWin), 0),
                "playerOneHasWonVertical");
    }

    public void playerTwoHasWonVertical() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoVerticalWin = {    {1, 0, -1},
                                                    {1, 0, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPositionForVerticals((arrayForPlayerTwoVerticalWin), 1),
                "playerTwoHasWonVertical");
    }

    public void noOneHasWonVertical1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneVerticalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForVerticals((arrayForNoOneVerticalWin), 0),
                "noOneHasWonVertical1");
    }

    public void noOneHasWonVertical2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneVerticalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForVerticals((arrayForNoOneVerticalWin), 1),
                "noOneHasWonVertical2");
    }

    public void playerOneHasWonDiagonal() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneDiagonalWin = {    {0, 0, -1},
                                                    {1, 0, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPositionForDiagonals((arrayForPlayerOneDiagonalWin), 0),
                "playerOneHasWonDiagonal");
    }

    public void playerTwoHasWonDiagonal() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoDiagonalWin = {    {0, 0, 1},
                                                    {-1, 1, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPositionForDiagonals((arrayForPlayerTwoDiagonalWin), 1),
                "playerTwoHasWonDiagonal");
    }

    public void noOneHasWonDiagonal1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneDiagonalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForDiagonals((arrayForNoOneDiagonalWin), 0),
                "noOneHasWonDiagonal1");
    }

    public void noOneHasWonDiagonal2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneDiagonalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPositionForVerticals((arrayForNoOneDiagonalWin), 1),
                "noOneHasWonDiagonal2");
    }

    public void playerOneHasWon1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneHorizontalWin = {  {0, 0, 0},
                                                    {-1, 1, -1},
                                                    {1, -1, -1}};
        check(victim.isWinPosition((arrayForPlayerOneHorizontalWin), 0),
                "playerOneHasWon1");
    }

    public void playerTwoHasWon1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoHorizontalWin = {  {0, -1, 0},
                                                    {-1, 0, -1},
                                                    {1, 1, 1}};
        check(victim.isWinPosition((arrayForPlayerTwoHorizontalWin), 1),
                "playerTwoHasWon1");
    }

    public void playerOneHasWon2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneVerticalWin = {    {-1, 0, 1},
                                                    {-1, 0, -1},
                                                    {1, 0, -1}};
        check(victim.isWinPosition((arrayForPlayerOneVerticalWin), 0),
                "playerOneHasWon2");
    }

    public void playerTwoHasWon2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoVerticalWin = {    {1, 0, -1},
                                                    {1, 0, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPosition((arrayForPlayerTwoVerticalWin), 1),
                "playerTwoHasWon2");
    }

    public void playerOneHasWon3() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerOneDiagonalWin = {    {0, 0, -1},
                                                    {1, 0, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPosition((arrayForPlayerOneDiagonalWin), 0),
                "playerOneHasWon3");
    }

    public void playerTwoHasWon3() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForPlayerTwoDiagonalWin = {    {0, 0, 1},
                                                    {-1, 1, -1},
                                                    {1, -1, 0}};
        check(victim.isWinPosition((arrayForPlayerTwoDiagonalWin), 1),
                "playerTwoHasWon3");
    }

    public void noOneHasWon1() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneVerticalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPosition((arrayForNoOneVerticalWin), 0),
                "noOneHasWon1");
    }

    public void noOneHasWon2() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForNoOneVerticalWin = {    {0, -1, 1},
                                                {-1, 0, -1},
                                                {-1, -1, -1}};
        check(!victim.isWinPosition((arrayForNoOneVerticalWin), 1),
                "noOneHasWon2");
    }

    public void drawPositionShouldBeTrue() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForDraw = {    {0, 0, 1},
                                    {1, 1, -1},
                                    {1, 0, 0}};
        check(victim.isDrawPosition(arrayForDraw), "drawPositionShouldBeTrue");
    }

    public void drawPositionShouldBeFalse() {
        TicTacToe victim = new TicTacToe();
        int[][] arrayForDraw = {    {0, 0, -1},
                                    {1, 1, -1},
                                    {1, 0, 0}};
        check(!victim.isDrawPosition(arrayForDraw), "drawPositionShouldBeFalse");
    }

    public void shouldCreateEmptyField() {
        TicTacToe victim = new TicTacToe();
        int[][] expectedField = { {-1, -1, -1},
                                  {-1, -1, -1},
                                  {-1, -1, -1}};
        check(Arrays.deepEquals(victim.createField(), expectedField), "shouldCreateEmptyField");
    }

    // пробная распечатка с одинаковыми числами

    public void shouldPrintField() {
        TicTacToe victim = new TicTacToe();
        int[][] testField = victim.createField();
        victim.printFieldToConsole(testField);
    }

    // пробная распечатка с разными числами

    public void shouldPrintField2() {
        TicTacToe victim = new TicTacToe();
        int[][] testField = {   {1, -1, -1},
                                {-1, 1, 0},
                                {0, -1, -1}};
        victim.printFieldToConsole(testField);
    }

    public void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
