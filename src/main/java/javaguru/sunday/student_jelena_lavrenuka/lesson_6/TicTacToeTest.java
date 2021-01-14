package javaguru.sunday.student_jelena_lavrenuka.lesson_6;

// lesson_6 task_19
// lesson_6 task_20
// lesson_6 task_21
// lesson_6 task_22
// lesson_6 task_23
// lesson_6 task_24
// lesson_6 task_25
// lesson_6 task_26

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsTest1();
        test.isWinPositionForHorizontalsTest2();
        test.isWinPositionForHorizontalsTest3();
        test.isWinPositionForHorizontalsTest4();
        test.isWinPositionForHorizontalsTest5();
        test.isWinPositionForHorizontalsTest6();
        test.isWinPositionForVerticalsTest1();
        test.isWinPositionForVerticalsTest2();
        test.isWinPositionForVerticalsTest3();
        test.isWinPositionForVerticalsTest4();
        test.isWinPositionForVerticalsTest5();
        test.isWinPositionForVerticalsTest6();
        test.isWinPositionForDiagonals1();
        test.isWinPositionForDiagonals2();
        test.isWinPositionForDiagonals3();
        test.isWinPositionForDiagonals4();
        test.isWinPositionTest1();
        test.isWinPositionTest2();
        test.isWinPositionTest3();
        test.isDrawPositionTest1();
        test.isDrawPositionTest2();
        test.isDrawPositionTest3();
        test.isDrawPositionTest4();
        test.isDrawPositionTest5();
        test.createFieldTest();
        test.printFieldToConsoleTest();
   }

    public void isWinPositionForHorizontalsTest1() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 1, 1},{1, 0, 1},{-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest1");

    }

    public void isWinPositionForHorizontalsTest2() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, -1},{1, 1, 1},{-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest2");
    }

    public void isWinPositionForHorizontalsTest3() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, -1, -1},{-1, -1, -1},{1, 1, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest3");
    }

    public void isWinPositionForHorizontalsTest4() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 0, 0},{1, 0, 1},{-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest4");
    }

    public void isWinPositionForHorizontalsTest5() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, -1},{0, 0, 0},{-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest5");
    }

    public void isWinPositionForHorizontalsTest6() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, -1, -1},{-1, -1, -1},{0, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForHorizontals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForHorizontalsTest6");
    }

    public void isWinPositionForVerticalsTest1() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, -1}, {1, -1, 0}, {1, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest1");
    }

    public void isWinPositionForVerticalsTest2() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, 1, -1}, {1, 1, 0}, {-1, 1, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest2");
    }

    public void isWinPositionForVerticalsTest3() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, 0, 1}, {-1, -1, 1}, {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest3");
    }

    public void isWinPositionForVerticalsTest4() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 0, -1}, {0, -1, 0}, {0, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest4");
    }

    public void isWinPositionForVerticalsTest5() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 0, -1}, {0, 0, -1}, {1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest5");
    }

    public void isWinPositionForVerticalsTest6() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, -1, 0}, {1, -1, 0}, {-1, 1, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForVerticals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForVerticalsTest6");
    }

    public void isWinPositionForDiagonals1() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, -1}, {-1, 1, 1}, {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForDiagonals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForDiagonals1");
    }

    public void isWinPositionForDiagonals2() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, -1, 1}, {-1, 1, 0}, {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForDiagonals(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionForDiagonals2");
    }

    public void isWinPositionForDiagonals3() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, -1, 1}, {-1, 0, 0}, {1, 0, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForDiagonals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForDiagonals3");
    }

    public void isWinPositionForDiagonals4() {
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, -1, 0}, {-1, 0, 0}, {0, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPositionForDiagonals(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionForDiagonals4");
    }

    public void isWinPositionTest1(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, 0, 0},{1, 0, 1},{-1, 0, -1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPosition(field, 0);
        testResult(actualResult, expectedResult, "isWinPositionTest1");
    }

    public void isWinPositionTest2(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, -1}, {-1, 1, 1}, {1, 0, 1}};
        boolean expectedResult = true;
        boolean actualResult = victim.isWinPosition(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionTest2");
    }

    public void isWinPositionTest3(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};
        boolean expectedResult = false;
        boolean actualResult = victim.isWinPosition(field, 1);
        testResult(actualResult, expectedResult, "isWinPositionTest3");
    }

    public void isDrawPositionTest1(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{-1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        boolean expectedResult = false;
        boolean actualResult = victim.isDrawPosition(field);
        testResult(actualResult, expectedResult, "isDrawPositionTest1");
    }

    public void isDrawPositionTest2(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isDrawPosition(field);
        testResult(actualResult, expectedResult, "isDrawPositionTest2");
    }

    public void isDrawPositionTest3(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};
        boolean expectedResult = true;
        boolean actualResult = victim.isDrawPosition(field);
        testResult(actualResult, expectedResult, "isDrawPositionTest3");
    }

    public void isDrawPositionTest4(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, 1}, {1, 1, 1}, {1, 1, 0}};
        boolean expectedResult = false;
        boolean actualResult = victim.isDrawPosition(field);
        testResult(actualResult, expectedResult, "isDrawPositionTest4");
    }

    public void isDrawPositionTest5(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{0, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        boolean expectedResult = false;
        boolean actualResult = victim.isDrawPosition(field);
        testResult(actualResult, expectedResult, "isDrawPositionTest5");
    }

    public void createFieldTest(){
        TicTacToe victim = new TicTacToe();
        int[][] field = victim.createField(3,3);
        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] !=-1) {
                    counter++;
                }
            }
        }
        if (counter >= 1) {
            System.out.println("createFieldTest is failed");
        } else {
            System.out.println("createFieldTest is OK");
        }

    }

    public void printFieldToConsoleTest(){
        TicTacToe victim = new TicTacToe();
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {1, 1, 0}};
        victim.printFieldToConsole(field);
    }

    public void testResult(boolean actualResult, boolean expectedResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is failed");
        }
    }


}
