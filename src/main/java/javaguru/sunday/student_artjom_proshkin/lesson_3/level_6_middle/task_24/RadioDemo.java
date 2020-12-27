package javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_24;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class RadioDemo {
    public static void main(String[] args) {
        Radio radio = new Radio("SONY","ICFC1TB");
        radio.powerOn();
        radio.volumeUp();
        radio.changeStation("SWH Rock");
        radio.volumeUp();
        radio.volumeUp();
    }
}
