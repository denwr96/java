package main.java.javaguru.sunday.student_artjom_proshkin.lesson_3.level_5_middle;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task_18
// Task_19
// Task_20
// Task_21
// Task_22
@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog myFirstDog = new Dog("Bobik");
        myFirstDog.voice3();
        myFirstDog.happyBirthday();
        myFirstDog.voice();
        System.out.println("---------------------");

        Dog mySecondDog = new Dog("Polkan", 8);
        mySecondDog.voice();
        mySecondDog.happyBirthday();
        mySecondDog.voice();
        System.out.println("---------------------");

        Dog myThirdDog = new Dog("Rex",6,"Brown");
        myThirdDog.voice();
        myThirdDog.changeColour("Green");
        myThirdDog.voice();
    }
}
