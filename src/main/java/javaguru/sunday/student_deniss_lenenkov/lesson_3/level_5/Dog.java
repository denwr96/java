package main.java.javaguru.sunday.student_deniss_lenenkov.lesson_3.level_5;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    public String name;
    public int age;
    public String color;




    public Dog(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("Gav Gav Gav");
        System.out.println(age);
        System.out.println(color);

    }
    public void happyBirthday() {
        age = age + 1;
    }
    public void changeColor(String newColor){
       this.color = newColor;
        System.out.println(newColor);
    }


}
