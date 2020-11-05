package main.java.javaguru.sunday.student_violeta_klimova.lesson_3.level_6.task_24_part_2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Cat {

    private final String name;
    private final int age;
    private final String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    void hungry() {
        System.out.println("-Meeeeow! - means yes!");
    }

    void angry() {
        System.out.println("-SHHHHHHH!!!! - bad idea...");
    }

    void meow() {
        System.out.println("-Meow!");
    }
}

class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("Konstantin", 7, "black");

        System.out.print("-Hello, I have a " + cat.getColor() + " cat.");
        System.out.print(" His name is " + cat.getName() + ".");
        System.out.println(" He is " + cat.getAge() + " years old.");

        System.out.println("-Quick! say hello!");
        cat.meow();

        System.out.println("-Are you hungry?");
        cat.hungry();

        System.out.println("-So...do you eat chips?");
        cat.angry();

        System.out.println("-Ok,ok. Lets find some food...");
        cat.meow();
    }

}