package javaguru.sunday.student_jelena_lavrenuka.lesson_3;

import javaguru.sunday.teacher.annotations.CodeReview;

// Task_18
// Task_19
// Task_20
// Task_21
// Task_22
@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", 5, "Black");
        myDog.voice();
        myDog.voice2();
        myDog.happyBirthday();
        myDog.voice3();
        myDog.voice4();
        myDog.changeColor("White");
        myDog.voice4();
        myDog.changeColor("Red");
    }
}
