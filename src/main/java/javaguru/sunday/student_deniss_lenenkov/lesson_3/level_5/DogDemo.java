package javaguru.sunday.student_deniss_lenenkov.lesson_3.level_5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Sharik",5,"Black");
        dog.voice();

        dog.happyBirthday();


        dog.voice();
        dog.changeColor("White");











    }
}
