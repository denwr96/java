package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_5.task_19_27;

import java.util.Arrays;

//level_5
//task19
//task20
//task21
//task22
//task23

//level_6
//task24

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest ticTacToeTest = new TicTacToeTest();

        ticTacToeTest.isWinPositionForHorizontalsTestFirstPlayerFirstLine();
        ticTacToeTest.isWinPositionForHorizontalsTestFirstPlayerSecondLine();
        ticTacToeTest.isWinPositionForHorizontalsTestFirstPlayerThirdLine();
        ticTacToeTest.isWinPositionForHorizontalsTestSecondPlayerFirstLine();
        ticTacToeTest.isWinPositionForHorizontalsTestSecondPlayerSecondLine();
        ticTacToeTest.isWinPositionForHorizontalsTestSecondPlayerThirdLine();
        ticTacToeTest.isWinPositionForHorizontalsTestShouldFail();

        ticTacToeTest.isWinPositionForVerticalsTestFirstPlayerFirstRow();
        ticTacToeTest.isWinPositionForVerticalsTestFirstPlayerSecondRow();
        ticTacToeTest.isWinPositionForVerticalsTestSecondPlayerFirstRow();
        ticTacToeTest.isWinPositionForVerticalsTestSecondPlayerSecondRow();
        ticTacToeTest.isWinPositionForVerticalsTestShouldFail();

        ticTacToeTest.isWinPositionForDiagonalsTestOneForFirstPlayer();
        ticTacToeTest.isWinPositionForDiagonalsTestTwoForFirstPlayer();
        ticTacToeTest.isWinPositionForDiagonalsTestOneForSecondPlayer();
        ticTacToeTest.isWinPositionForDiagonalsTestTwoForSecondPlayer();
        ticTacToeTest.isWinPositionForDiagonalsTestShouldFail();

        ticTacToeTest.isWinPositionForFirstPlayerHorizontalTest();
        ticTacToeTest.isWinPositionForFirstPlayerDiagonalTest();
        ticTacToeTest.isWinPositionForSecondPlayerHorizontalTest();
        ticTacToeTest.isWinPositionForSecondPlayerDiagonalTest();
        ticTacToeTest.isWinPositionShouldFailTest();

        ticTacToeTest.isDrawPositionTest();
        ticTacToeTest.isDrawPositionTestShouldFail();

        ticTacToeTest.createFieldTest();

    }

    public void isWinPositionForHorizontalsTestFirstPlayerFirstLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{0, 0, 0}, {-1, -1, -1}, {-1, -1, -1}};
        check(test.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalsTestFirstPlayerFirstLine");
    }

    public void isWinPositionForHorizontalsTestFirstPlayerSecondLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        check(test.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalsTestFirstPlayerSecondLine");
    }

    public void isWinPositionForHorizontalsTestFirstPlayerThirdLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {-1, -1, -1}, {0, 0, 0}};
        check(test.isWinPositionForHorizontals(myArray, 0), "isWinPositionForHorizontalsTestFirstPlayerThirdLine");
    }

    public void isWinPositionForHorizontalsTestSecondPlayerFirstLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, 1, 1}, {-1, -1, -1}, {-1, -1, -1}};
        check(test.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalsTestSecondPlayerFirstLine");
    }

    public void isWinPositionForHorizontalsTestSecondPlayerSecondLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {1, 1, 1}, {-1, -1, -1}};
        check(test.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalsTestSecondPlayerSecondLine");
    }

    public void isWinPositionForHorizontalsTestSecondPlayerThirdLine(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, 1}};
        check(test.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalsTestSecondPlayerThirdLine");
    }

    public void isWinPositionForHorizontalsTestShouldFail(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {-1, -1, -1}, {1, 1, -1}};
        check(!test.isWinPositionForHorizontals(myArray, 1), "isWinPositionForHorizontalsTestShouldFail");
    }

    public void isWinPositionForVerticalsTestFirstPlayerFirstRow(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{0, -1, -1}, {0, -1, -1}, {0, -1, -1}};
        check(test.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalsTestFirstPlayerFirstRow");
    }

    public void isWinPositionForVerticalsTestFirstPlayerSecondRow(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}};
        check(test.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalsTestFirstPlayerSecondRow");
    }

    public void isWinPositionForVerticalsTestSecondPlayerFirstRow(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, -1, -1}, {1, -1, -1}, {1, -1, -1}};
        check(test.isWinPositionForVerticals(myArray, 1), "isWinPositionForVerticalsTestSecondPlayerFirstRow");
    }

    public void isWinPositionForVerticalsTestSecondPlayerSecondRow(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, 1, -1}, {-1, 1, -1}, {-1, 1, -1}};
        check(test.isWinPositionForVerticals(myArray, 1), "isWinPositionForVerticalsTestSecondPlayerSecondRow");
    }

    public void isWinPositionForVerticalsTestShouldFail(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, 0, -1}, {-1, 1, -1}, {-1, 0, -1}};
        check(!test.isWinPositionForVerticals(myArray, 0), "isWinPositionForVerticalsTestShouldFail");
    }

    public void isWinPositionForDiagonalsTestOneForFirstPlayer(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{0, -1, -1}, {-1, 0, -1}, {-1, -1, 0}};
        check(test.isWinPositionForDiagonals(myArray, 0), "isWinPositionForDiagonalsTestOneForFirstPlayer");
    }

    public void isWinPositionForDiagonalsTestTwoForFirstPlayer(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, 0}, {-1, 0, -1}, {0, -1, -1}};
        check(test.isWinPositionForDiagonals(myArray, 0), "isWinPositionForDiagonalsTestTwoForFirstPlayer");
    }

    public void isWinPositionForDiagonalsTestOneForSecondPlayer(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, -1, -1}, {-1, 1, -1}, {-1, -1, 1}};
        check(test.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsTestOneForSecondPlayer");
    }

    public void isWinPositionForDiagonalsTestTwoForSecondPlayer(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, 1}, {-1, 1, -1}, {1, -1, -1}};
        check(test.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsTestTwoForSecondPlayer");
    }

    public void isWinPositionForDiagonalsTestShouldFail(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, 1}, {-1, 1, -1}, {-1, -1, -1}};
        check(!test.isWinPositionForDiagonals(myArray, 1), "isWinPositionForDiagonalsTestShouldFail");
    }

    public void isWinPositionForFirstPlayerHorizontalTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, -1}, {0, 0, 0}, {-1, -1, -1}};
        check(test.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerHorizontalTest");
    }

    public void isWinPositionForFirstPlayerDiagonalTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{0, -1, -1}, {1, 0, 0}, {-1, -1, 0}};
        check(test.isWinPosition(myArray, 0), "isWinPositionForFirstPlayerDiagonalTest");
    }

    public void isWinPositionForSecondPlayerHorizontalTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{-1, -1, 0}, {1, 1, 1}, {0, -1, -1}};
        check(test.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerHorizontalTest");
    }

    public void isWinPositionForSecondPlayerDiagonalTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, -1, 0}, {1, 1, 0}, {0, -1, 1}};
        check(test.isWinPosition(myArray, 1), "isWinPositionForSecondPlayerDiagonalTest");
    }

    public void isWinPositionShouldFailTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, -1, 0}, {1, 0, 0}, {0, -1, 1}};
        check(!test.isWinPosition(myArray, 1), "isWinPositionShouldFailTest");
    }

    public void isDrawPositionTest(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        check(test.isDrawPosition(myArray), "isDrawPositionTest");
    }

    public void isDrawPositionTestShouldFail(){
        TicTacToe test = new TicTacToe();
        int[][] myArray = {{1, -1, 0}, {1, 0, 0}, {0, 1, 1}};
        check(!test.isDrawPosition(myArray), "isDrawPositionTestShouldFail");
    }

    public void createFieldTest(){
        TicTacToe test = new TicTacToe();
        int[][] receivedArray;
        receivedArray = test.createField();
        int[][] expectedArray = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        check(Arrays.deepEquals(expectedArray, receivedArray), "createFieldTest");
    }

    public void check(int[][] expectedResult, int[][] actualResult, String testName){
        if(expectedResult == actualResult) {
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

    public void check(boolean condition, String testName){
        if(condition){
            System.out.println(testName + " OK!");
        } else {
            System.out.println(testName + " failed!");
        }
    }

}
