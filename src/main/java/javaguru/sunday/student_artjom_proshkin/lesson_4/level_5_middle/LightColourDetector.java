package main.java.javaguru.sunday.student_artjom_proshkin.lesson_4.level_5_middle;

// Task_16

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class LightColourDetector {
    String detect (int lengthOfWave){
        if (lengthOfWave >= 380 && lengthOfWave <= 449){
            return "Violet";
        } else if (lengthOfWave >= 450 && lengthOfWave <= 494){
            return "Blue";
        } else if (lengthOfWave >= 495 && lengthOfWave <= 569){
            return "Green";
        } else if (lengthOfWave >= 570 && lengthOfWave <= 589){
            return "Yellow";
        } else if (lengthOfWave >= 590 && lengthOfWave <= 619){
            return "Orange";
        } else if (lengthOfWave >= 620 && lengthOfWave <= 750){
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

}
