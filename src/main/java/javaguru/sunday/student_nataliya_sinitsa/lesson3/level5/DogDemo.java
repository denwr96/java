package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson3.level5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task 18 --> Task 22
@CodeReview(approved = true)
class DogDemo {

    public static void main(String[] args) {

        Dog smartDog = new Dog("Good boy", 5, "white");
        smartDog.voice();
        smartDog.happyBirthday();
        smartDog.changeColor("almost white");
        smartDog.voice();

    }

}
