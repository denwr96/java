package main.java.javaguru.sunday.student_deniss_lobacs.lesson_3.homework.level_6_middle.task24;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class PersonDemo {
    public static void main(String[] args) {

        Person person = new Person("Denis" , "Lobach" , 23);

        person.displayInfo();
        person.happyBirhtday();
        person.displayInfo();

    }
}
