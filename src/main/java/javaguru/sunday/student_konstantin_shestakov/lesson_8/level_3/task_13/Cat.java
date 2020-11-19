package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_8.level_3.task_13;

public class Cat extends Animal {

    public Cat(String breed) {
        super(breed);
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }
}
