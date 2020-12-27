package javaguru.sunday.student_artjom_proshkin.lesson_6.level_5;

//Task_19,Task_20,Task_21,Task_22,Task_23
//Task_24,Task_25,Task_26,Task_27

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Хорошо. Что-то можно было упростить." +
        "К примеру, некоторые циклы могут быть заменены на расширенный for " +
        "Метод isDrawPosition может быть упрощен до return БУЛЕВО_ВЫРАЖЕНИЕ")
class TicTacToe {

    boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[i][0] == field[i][1]) && (field[i][1] == field[i][2]) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < field.length; j++) {
            if ((field[0][j] == field[1][j]) && (field[1][j] == field[2][j]) && (field[2][j] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if ((field[0][0] == field[1][1]) && (field[1][1] == field[2][2]) && (field[2][2] == playerToCheck)
                || (field[0][2] == field[1][1]) && (field[1][1] == field[2][0]) && (field[2][0] == playerToCheck)) {
            return true;
        }
        return false;
    }

    boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        }
        return false;
    }

    boolean fieldIsFull(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == -1)
                    return false;
            }
        }
        return true;
    }

    boolean isDrawPosition(int[][] field) {
        if (fieldIsFull(field) && (!isWinPosition(field, 1)) && (!isWinPosition(field, 0))) {
            return true;
        }
        return false;
    }

    int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    Move getNextMove() {

        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinate (0,1 or 2)");
        x = scanner.nextInt();
        System.out.println("Enter Y coordinate (0,1 or 2)");
        y = scanner.nextInt();

        Move move = new Move(x, y);

        return move;

    }

    void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }


}
