package javaguru.sunday.student_nataliya_sinitsa.lesson8.level2.task7;

import javaguru.sunday.teacher.annotations.CodeReview;
import javaguru.sunday.teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Переменные названы с большой буквы. Такого быть не должно =)")
class ChildDemo {

    public static void main(String[] args) {

        Father vyacheslav = new Father("Petrov", "hazel", "brown");
        vyacheslav.name = "Vyacheslav";
        vyacheslav.occupation = "dentist";
        vyacheslav.age = 48;
        vyacheslav.getInfoAboutPerson();

        Child alexey = new Child("Alexey", "Petrov", "Riga Secondary School No. 60",
                "hazel", "brown", 10);
        alexey.getInfoAboutPerson();
    }
}
