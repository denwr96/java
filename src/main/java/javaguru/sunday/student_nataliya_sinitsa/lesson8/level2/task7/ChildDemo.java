package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level2.task7;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;
import main.java.javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные названы с большой буквы. Такого быть не должно =)")
class ChildDemo {

    public static void main(String[] args) {

        Father Vyacheslav = new Father("Petrov", "hazel", "brown");
        Vyacheslav.name = "Vyacheslav";
        Vyacheslav.occupation = "dentist";
        Vyacheslav.age = 48;
        Vyacheslav.getInfoAboutPerson();

        Child Alexey = new Child("Alexey", "Petrov", "Riga Secondary School No. 60", "hazel", "brown", 10);
        Alexey.getInfoAboutPerson();
    }
}
