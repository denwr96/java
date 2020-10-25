package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_5.task_18;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {

    String dogName;

    Dog(String dogName) {
        this.dogName = dogName;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName);
        }
    }
}

class DogDemo {
    public static void main(String[] args) {
       Dog dog = new Dog("Dogo");
       dog.voice();
    }
}