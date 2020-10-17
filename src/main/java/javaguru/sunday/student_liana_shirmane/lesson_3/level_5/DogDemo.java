package main.java.javaguru.sunday.student_liana_shirmane.lesson_3.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Demi", 5, "white");
        myDog.makeVoice();
        myDog.makeVoiceTwo();
        myDog.happyBirthday();
        myDog.makeVoiceThree();
        myDog.makeVoiceFour();
        myDog.changeColor("black");
        myDog.makeVoiceFour();
    }
}
