package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level1.task2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

// демонстрация работы кода без созданного вручную дефолтного конструктора
@CodeReview(approved = true)
class CatDefaultDemo {

    public static void main(String[] args) {
        CatDefault Smoky = new CatDefault();
        Smoky.giveNameToCat("Smoky");
        Smoky.giveFoodToCat();
    }

}