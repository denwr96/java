package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_3.level_7_senior.super_task_2;

import java.util.Arrays;

class BowlingGame {

    String player;
    int score;
    int[] arrayScore = new int[21]; // 21 бросок; 1-9 фрейм по 2; 10 фрейм 2 или 3

    BowlingGame(String player, int score) {
        this.player = player;
        this.score = score;
    }

    void roll() {

        //Фрейм 1-9

        for (int i = 0; i < arrayScore.length - 3; i++) { // 3 последних элемента массива зарезервированны под последний 10 фрейм
            if (i % 2 == 0){
                arrayScore[i] = (int) Math.round(Math.random() * 10); // 1ый бросок (чётное значение массива)
            }
            if (i % 2 != 0) {
                arrayScore[i] = (int) Math.round(Math.random() * (10 - arrayScore[i - 1])); // 2ой бросок (нечётное значение массива), не более оставшихся кеглей
            }
        }

//        System.out.println(Arrays.toString(arrayScore)); // вывод промежуточного значения без модификаторов

            for (int i = 0; i < arrayScore.length - 3; i++) {
            System.out.println(player + ", Frame " + ((i + 2) / 2) + ", Roll " + (i + 1) + " = " + arrayScore[i]);
        }

        for (int i = 0; i < arrayScore.length - 3; i++) {
            if (i % 2 == 0 && arrayScore[i] == 10 && arrayScore[i + 2] != 10) { // условие для страйка
                arrayScore[i] = arrayScore[i] + arrayScore[i + 2] + arrayScore[i + 3];
                System.out.println(player + ", " + "X - roll " + (i + 1));
            }
            if (i % 2 == 0 && arrayScore[i] == 10 && arrayScore[i + 2] == 10) { // доп. условие для 2ух страйков подряд
                arrayScore[i] = arrayScore[i] + arrayScore[i + 2] + arrayScore[i + 4];
                System.out.println(player + ", " + "X - roll " + i);
            }
            if (i % 2 != 0 && (arrayScore[i - 1] + arrayScore[i] == 10) && arrayScore[i - 1] != 10) { // условие для спэр
                arrayScore[i] = arrayScore[i] + arrayScore[i + 1];
                System.out.println(player + ", " + "/ - roll " + (i + 1));
            }

        }

//        System.out.println(Arrays.toString(arrayScore)); // вывод промежуточного значения 1-9 фреймов

        //Фрейм 10 (последний, бонусы отсутвуют, за исключением возможности бросать доп. шары)

        arrayScore[arrayScore.length - 3] = (int) Math.round(Math.random() * 10);

        if (arrayScore[arrayScore.length - 3] == 10) {  // условие для стрйака
            System.out.println(player + " " + "X (frame 10)");
            arrayScore[arrayScore.length - 2] = (int) Math.round(Math.random() * 10);

            if (arrayScore[arrayScore.length - 2] == 10) {  // условие для стрйака
                System.out.println(player + " " + "X (frame 10)");
                arrayScore[arrayScore.length - 1] = (int) Math.round(Math.random() * 10);
            }
        } else {
            arrayScore[arrayScore.length - 2] = (int) Math.round(Math.random() * (10 - arrayScore[arrayScore.length - 3]));
            if (arrayScore[arrayScore.length - 3] + arrayScore[arrayScore.length - 2] == 10) { // условие для спэр
                System.out.println(player + " " + "/ (frame 10)");
                arrayScore[arrayScore.length - 1] = (int) Math.round(Math.random() * 10);
            }
        }

        System.out.println(player + ", " + "Roll 19 (Frame 10) = " + arrayScore[arrayScore.length - 3]);
        System.out.println(player + ", " + "Roll 20 (Frame 10) = " + arrayScore[arrayScore.length - 2]);
        System.out.println(player + ", " + "Roll 21 (Frame 10) = " + arrayScore[arrayScore.length - 1] + "\n");

    }

    int score() {
        System.out.println(player + ", Score: " + Arrays.toString(arrayScore) + "\n");

        for (int i = 0; i < arrayScore.length; i++) {
            System.out.println(player + ", Roll " + (i + 1) + ", score = " + arrayScore[i]);
        }
        score = arrayScore[0] + arrayScore[1] + arrayScore[2] + arrayScore[3] + arrayScore[4] + arrayScore[5] + arrayScore[6] + arrayScore[7] + arrayScore[8] + arrayScore[9] + arrayScore[10] + arrayScore[11] + arrayScore[12] + arrayScore[13] + arrayScore[14] + arrayScore[15] + arrayScore[16] + arrayScore[17] + arrayScore[18] + arrayScore[19] + arrayScore[20];
        System.out.println("-----------------------------");
        System.out.println(player + " total score = " + score + "\n");
        return score;
    }

}
