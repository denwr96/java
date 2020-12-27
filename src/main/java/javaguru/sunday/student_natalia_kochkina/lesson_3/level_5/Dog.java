package javaguru.sunday.student_natalia_kochkina.lesson_3.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_18
//Task_19
//Task_20
//Task_21
//Task_22
@CodeReview(approved = true)
public class Dog {
    String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String getColor() {
        return this.color;
    }

    public void voice() {
        System.out.println("Кличка - " + getName());
        System.out.println("Возраст - " + age);
        System.out.println("Цвет - " + getColor());
    }

    public void happyBirthday() {
        age = age + 1;
    }

    void changeColor(String newColor) {
        color = newColor;
    }

}
