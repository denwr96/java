package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level1.task2;

// для демонстрация работы кода без созданного вручную дефолтного конструктора CatDefault() {} в классе CatDefaultDemo

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
