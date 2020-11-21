package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_13;

public class Dog extends Animal {

    Dog(String breed) {
        super(breed);
    }

    @Override
    void voice() {
        System.out.println("Woof");
    }
}
