package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_5_middle.task21;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(String dogName , int dogAge , String dogColor) {

        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;

    }
    public void doVoice() {

        System.out.println(name + " " + age + " " + color);
    }

    public void happyBirhtday() {

        System.out.println("Happy birhday!!!");
        age = age+1;

    }
}
