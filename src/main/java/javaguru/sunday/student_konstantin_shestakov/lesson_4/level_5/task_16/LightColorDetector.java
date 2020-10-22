package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_4.level_5.task_16;

class LightColorDetector {

    public String detect(int waveLength) {

            String color;

            if (waveLength >= 380 && waveLength <= 449) {
                color = "Violet";
            } else if (waveLength >= 450 && waveLength <= 494) {
                color = "Blue";
            } else if (waveLength >= 495 && waveLength <= 569) {
                color = "Green";
            } else if (waveLength >= 570 && waveLength <= 589) {
                color = "Yellow";
            } else if (waveLength >= 590 && waveLength <= 619) {
                color = "Orange";
            } else if (waveLength >= 620 && waveLength <= 750) {
                color = "Red";
            } else {
                color = "Invisible Light";
            }
            return color;


    }
}

