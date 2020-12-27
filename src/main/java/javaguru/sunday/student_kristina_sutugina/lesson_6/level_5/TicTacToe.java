package javaguru.sunday.student_kristina_sutugina.lesson_6.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;
//Task_19
//Task_20
//Task_21
//Task_22
//Task_23
//Task_24
//Task_25
//Task_26
//Task_27
@CodeReview(approved = true)
class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((field[0][j] == playerToCheck) && (field[1][j] == playerToCheck) && (field[2][j] == playerToCheck)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) ||
                        ((field[2][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[0][2] == playerToCheck))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) ||
                        isWinPositionForDiagonals(field, playerToCheck)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    return false;
                } else if (isWinPosition(field, 1)) {
                    return false;
                } else if (isWinPosition(field, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};

    }

    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 coordinates of number: ");
        int firstCoordinate = scanner.nextInt();
        int secondCoordinate = scanner.nextInt();
        return new Move(firstCoordinate, secondCoordinate);
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void play() {
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
