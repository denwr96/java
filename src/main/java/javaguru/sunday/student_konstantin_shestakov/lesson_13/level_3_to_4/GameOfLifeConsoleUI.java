package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_3_to_4;

class GameOfLifeConsoleUI {

    void printField(boolean[][] field) {
        for (int y = 1; y < field.length - 1; y++) {
            System.out.println();
            for (int x = 1; x < field[0].length - 1; x++) {
                if (field[y][x]) {
                    System.out.print("[O]");
                }
                else {
                    System.out.print("[ ]");
                }
            }
        }
    }

    void printWholeField(boolean[][] field) {
        for (int y = 0; y < field.length; y++) {
            System.out.println();
            for (int x = 0; x < field[0].length; x++) {
                if (field[y][x]) {
                    System.out.print("[O]");
                }
                else {
                    System.out.print("[ ]");
                }
            }
        }
    }

}
