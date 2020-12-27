package javaguru.sunday.student_nataliya_sinitsa.lesson8.level1.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

// демонстрация работы кода без созданного вручную дефолтного конструктора
@CodeReview(approved = true)
class CatDefaultDemo {

    public static void main(String[] args) {
        CatDefault smoky = new CatDefault();
        smoky.giveNameToCat("Smoky");
        smoky.giveFoodToCat();
    }

}
