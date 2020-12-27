package javaguru.sunday.student_kristina_sutugina.lesson_3.level_5;

//Task_18
//Task_19
//Task_20
//Task_21
//Task_22

import javaguru.sunday.teacher.annotations.CodeReview;

/**Бизнес требования:
        - У собаки должна быть кличка.
        - Кличку собаке дают в момент создания и потом ее изменить нельзя.
        - Собака должна уметь выполнять команду голос (voice()),
        при выполнении этой команды на консоль должно выводиться
        кличка собаки три раза.

        Создать отдельный класс DogDemo,
        объявить в нём main() метод и продемонстрировать
        использование класса собака (Dog).*/
@CodeReview(approved = true)
 class Dog {
    private String name;
    private int age;
    private String colour;


    Dog(String name, int age) {
        this.name = name;
        this.age = age;
      //  this.colour = colour;
    }

    Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    void changeColor(String newColor) {


        this.colour = newColor;
    }

    void happyBirthday() {

        this.age = age + 1;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.name);
        }
    }

    void voice2() {

        System.out.println(this.name + " " + this.age);
    }

    void voice3() {

        System.out.println(this.name + " " + this.age + " " + this.colour);
    }
}
