package main.java.javaguru.sunday.student_mihails_gutmans.lesson3.level_5.task_18;

public class Dog {

    public String name ;
    public int age ;
    public String colour ;

    public void voice() {
        System.out.println(name + name + name);
    }

    public void secondVoice() {
        System.out.println("My name is " + name + " , and age is " + age ); // Task_19 ( sdelal novij metod i novij kosntruktor )
    }

    public Dog (){
        this.name = " Barbos ";
    } // Task_18

    public Dog (int age){
        this.name = " Barbos ";
        this.age = age;
    } // Task_19



    public void setAge (int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    void happyBirthday() {
        this.age=age+1;
        System.out.println("Gav , I have birthday today , my age is " + age); // Task_20
    }

    public void thirdVoice (){
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My colour is " + colour);
    }
    public Dog (int age , String colour){
        this.name = " Barbos ";
        this.age = age;
        this.colour = colour;
    } // Task_21

    public void changeColor(String newColor) {
        this.colour = newColor ;
    }

    public String getThisColor(){
        return this.colour;
    }
}
