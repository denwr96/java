package javaguru.sunday.student_violeta_klimova.lesson_3.level_5.task_20;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {

    String dogName;
    int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    void happyBirthday() {
        dogAge = dogAge + 1;
    }

    void voice() {
        System.out.println("DogName: " + dogName + " DogAge: " + dogAge);
    }

}

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Dogo", 55);
        dog.voice();
        dog.happyBirthday();
        dog.voice();
    }
}

