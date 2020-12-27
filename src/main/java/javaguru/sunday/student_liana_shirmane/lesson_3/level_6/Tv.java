package javaguru.sunday.student_liana_shirmane.lesson_3.level_6;

import javaguru.sunday.teacher.annotations.CodeReview;

//task24
@CodeReview(approved = true)
class Tv {
    int screenSize;
    String brandName;
    boolean power;
    String tvChannel;

    Tv(int screenSize, String brandName, Boolean power, String tvChannel) {
        this.screenSize = screenSize;
        this.brandName = brandName;
        this.power = power;
        this.tvChannel = tvChannel;
    }

    void switchOn() {
        power = true;
        System.out.println("TV is On");
    }

    void switchChannel(String newTvChannel) {
        tvChannel = newTvChannel;
        System.out.println("Channel switched to " + tvChannel);
    }

    void tvInfo() {
        System.out.println("TV " + brandName + " size " + screenSize);
    }
}
