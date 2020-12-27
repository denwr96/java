package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_5_middle.task20;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    String name;
    int age;

    public Dog(String dogName , int dogAge) {

        this.name = dogName;
        this.age = dogAge;

    }
    public void doVoice() {

        System.out.println(name + " " + age + " years old.");
    }

    public int happyBirhtday() {

        System.out.println("Happy birhday!!!");
        age = age+1;
        return age;
    }
}
