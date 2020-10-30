package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_7.super_task_4;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTestAll {

    public static void main(String[] args) {

        String color;
        int waveLength = 380;
        int counterStepValue = 45;

        String blackColorText = "\u001B[0m";
        String violetColorText = "\u001B[35m";
        String blueColorText = "\u001B[34m";
        String greenColorText = "\u001B[32m";
        String yellowColorText = "\u001B[33m";
        String redColorText = "\u001B[31m";
        String blackColorBackground = "\033[40m";
        String whiteColorText = "\u001B[37m";
        String whiteColorBackground = "\033[47m";

        for (int loop = 7; loop > 0; waveLength = waveLength + counterStepValue) {
            loop--;

            if (waveLength >= 380 && waveLength <= 449) {
                counterStepValue = 70;
                color = "Violet";
                System.out.println(violetColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else if (waveLength >= 450 && waveLength <= 494) {
                counterStepValue = 45;
                color = "Blue";
                System.out.println(blueColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else if (waveLength >= 495 && waveLength <= 569) {
                counterStepValue = 75;
                color = "Green";
                System.out.println(greenColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else if (waveLength >= 570 && waveLength <= 589) {
                counterStepValue = 20;
                color = "Yellow";
                System.out.println(yellowColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else if (waveLength >= 590 && waveLength <= 619) {
                counterStepValue = 30;
                color = "Orange";
                System.out.println(yellowColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else if (waveLength >= 620 && waveLength <= 750) {
                counterStepValue = 131;
                color = "Red";
                System.out.println(redColorText + "Wave lenght = " + waveLength + ", color = " + color + blackColorText);
            }
            else {
                color = "Invisible Light";
                System.out.println(whiteColorText + blackColorBackground +"Wave lenght = " + waveLength + ", color = " + color + blackColorText + whiteColorBackground);
            }
        }
    }
}

