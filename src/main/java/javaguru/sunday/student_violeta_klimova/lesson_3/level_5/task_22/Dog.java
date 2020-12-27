package javaguru.sunday.student_violeta_klimova.lesson_3.level_5.task_22;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {

    String dogName;
    int dogAge;
    String dogColor;

    Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }


    void voice() {
        System.out.println("Dog name: " + dogName + " Dog age: " + dogAge + " Dog color: " + dogColor);
    }

    void changeColor(String newColor) {
        dogColor = newColor;
    }
}

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Dogo", 55, "Black");
        dog.voice();
        dog.changeColor("Red");
        dog.voice();
    }
}

