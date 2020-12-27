package javaguru.sunday.student_jelena_lavrenuka.lesson_3;
// Task_1
// Task_2
// Task_3
// Task_4
// Task_5
// Task_6
// Task_11
// Task_12
// Task_13

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {

    public Robot() {
    }
    public String robotName;
    public Robot (String robotName){
        this.robotName = robotName;
    }

    public void sayHello() {
        System.out.println("Hello! ");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.robotName);
    }


}

