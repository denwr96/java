package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// Task_18
// Task_19
// Task_20
// Task_21
// Task_22
@CodeReview(approved = true)
class Dog {
    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void voice() { System.out.println(name + ' ' + name + ' ' + name); }

    void voice2() { System.out.println(name + ' ' + age); }

    void happyBirthday() { System.out.println(age + 1); }

    void voice3() { System.out.println(name + ' ' + age + ' ' + color); }

    void voice4() { System.out.println(name + ' ' + name + ' ' + name); }

    void changeColor(String newColor) { System.out.println(this.color = newColor); }
}

