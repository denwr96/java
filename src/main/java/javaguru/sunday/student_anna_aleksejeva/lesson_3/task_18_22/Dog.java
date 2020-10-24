package main.java.javaguru.sunday.student_anna_aleksejeva.lesson_3.task_18_22;
/// Task_18
/// Task_19
/// Task_20
/// Task21
/// Task22


class Dog {

    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void voice1() {
        System.out.println(name + ' ' + name + ' ');
    }

    void voice2() {
        System.out.println(name + ' ' + age);
    }

    void Birthday() {
        System.out.println(age + 1);
    }

    void voice3() {
        System.out.println(name + ' ' + age + ' ' + color);
    }

    void voice4() {
        System.out.println(name + ' ' + name + ' ' + name);
    }
        void changeColor(String newColor) {
            System.out.println( this.color = newColor);
        }
        }
