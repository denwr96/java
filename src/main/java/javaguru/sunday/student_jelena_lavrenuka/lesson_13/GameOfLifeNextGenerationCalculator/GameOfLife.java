package javaguru.sunday.student_jelena_lavrenuka.lesson_13.GameOfLifeNextGenerationCalculator;

// lesson_13 task_10
// lesson_13 task_11
// lesson_13 task_12
// lesson_13 task_13
// lesson_13 task_14
// lesson_13 task_15
// lesson_13 task_16
// lesson_13 task_17
// lesson_13 task_18
// lesson_13 task_19
// lesson_13 task_20
// lesson_13 task_21
// lesson_13 task_22
// lesson_13 task_23
// lesson_13 task_24
// lesson_13 task_25

import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(10, 10);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
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

}
