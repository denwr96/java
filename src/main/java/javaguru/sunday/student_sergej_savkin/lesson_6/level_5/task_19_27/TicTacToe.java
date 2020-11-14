package main.java.javaguru.sunday.student_sergej_savkin.lesson_6.level_5.task_19_27;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

//level_5
//task19
//task20
//task21
//task22
//task23

//level_6
//task24
//task25
//task26
//task27

@CodeReview(approved = true)
class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)){
                return true;
            }
        } return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        for (int j = 0; j < 3; j++) {
            if ((field[0][j] == playerToCheck) && (field[1][j] == playerToCheck) && (field[2][j] == playerToCheck)){
                return true;
            }
        } return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        if((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)
        || (field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)){
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        for (int i = 0; i < 3; i++) {
            if((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)
            || (field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)){
                return true;
            } else if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)
            || (field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(field[i][j] == -1){
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField(){
        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    public Move getNextMove() {
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your coords:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
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
