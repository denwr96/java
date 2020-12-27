package javaguru.sunday.student_nataliya_sinitsa.lesson8.level1.task2;

import javaguru.sunday.teacher.annotations.CodeReview;

// для демонстрация работы кода без созданного вручную дефолтного конструктора CatDefault() {} в классе CatDefaultDemo
@CodeReview(approved = true)
class CatDefault {

    String catName;
    boolean catIsHungry;

    public void giveNameToCat(String name) {
        catName = name;
        System.out.println("Meow. My name is " + catName);
    }

    public void giveFoodToCat() {
        catIsHungry = false;
        System.out.println("Meow. I'm not hungry");
    }

}
