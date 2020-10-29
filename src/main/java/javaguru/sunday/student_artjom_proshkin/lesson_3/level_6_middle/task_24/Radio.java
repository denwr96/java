package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_6_middle.task_24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Radio {
    String brandName;
    String modelName;
    int volume;
    String radioStation;
    boolean power;

    Radio (String brandName, String modelName){
        this.brandName = brandName;
        this.modelName = modelName;
        volume = 5;
        radioStation = "EHR";
    }
    void powerOn(){
        power = true;
        System.out.println(radioStation +" "+ volume);
    }
    void changeStation(String newRadioStation){
        radioStation = newRadioStation;
        System.out.println(newRadioStation +" "+ getVolume());
    }
    void volumeUp(){
        volume = volume + 1;
        System.out.println(radioStation +" "+ getVolume());

    }
    int getVolume(){
        return volume;
    }
}
