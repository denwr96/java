package javaguru.sunday.student_kristina_sutugina.lesson_3.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Luna", 4);
        myDog.voice();

        myDog.voice2();
        myDog.happyBirthday();
        myDog.voice2();

        Dog myDog2 = new Dog("Luna", 4,"red");
        myDog2.voice3();

        myDog2.voice3();
        myDog2.changeColor("blue");
        myDog2.voice3();
    }
}
