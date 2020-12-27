package javaguru.sunday.student_laura_upelniece.lesson3.lvl5;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name; //TASK 18
    int age;     //Task 19
    String color; //TASK 21


    public Dog(String dogName, int dogAge, String dogColor) {  //Will create Dog object with dogs name as param TASK 18; Add dogAge param TASK 19; Add color param TASK 21

        this.name = dogName;
        System.out.println("Name: " + dogName);

        this.age = dogAge;
        System.out.println("Age: " + dogAge);

        this.color = dogColor;
        System.out.println("Color: " + dogColor);

    }

    //public void voice() { System.out.println(this.name + " " + this.name + " " + this.name); }  //Prints dog name three times TASK 18

    //public void voice() { System.out.println(this.name + " " + this.age); }                     //Prints dog name and age TASK 19

    public void happyBirthday() { this.age = age + 1; }                                           //Adds 1 to dogs age TASK 20

    public void voice() { System.out.println(this.name + " " + this.age + " " + this.color); }    //Prints dogs name, age and color TASK 21

    public void changeColor(String newColor) {                                                    //Assigns a new color to Dog object TASK 22
        System.out.println("Change " + this.color + " to " + newColor);
        this.color = newColor; }



}
