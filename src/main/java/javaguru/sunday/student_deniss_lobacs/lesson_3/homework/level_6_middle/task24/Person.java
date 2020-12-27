package javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task24;

import javaguru.sunday.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Person {

    String name;
    String surname;
    int age;

    public Person(String myName , String mySurname , int myAge) {

        this.name = myName;
        this.surname = mySurname;
        this.age = myAge;
    }

    public void displayInfo() {
        System.out.println(name + " " + surname + " " + age + " years old..");
    }

    public int happyBirhtday() {

        age = age +1;
        return age;
    }
}
