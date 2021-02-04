package javaguru.sunday.student_konstantin_shestakov.lesson_13.level_3_to_4;

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.concurrent.TimeUnit;

@CodeReview(approved = true)
class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.createField(10, 10);
        field = generator.fillFieldWithRandom(field);
        while(true) {
            ui.printField(field);
            System.out.println();
            sleepForSeconds(2);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        GameOfLife gameOfLife= new GameOfLife();
        gameOfLife.run();
    }

}
