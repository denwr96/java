package javaguru.sunday.student_natalia_kochkina.lesson_3.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_1
//Task_2
//Task_5
//Task_11
//Task_12
//Task_13
@CodeReview(approved = true)
public class Robot {

    public String name;

    public Robot(String robotName) {
        this.name = robotName;

    }

    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
