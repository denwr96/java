package javaguru.sunday.student_natalia_kochkina.lesson_8.level_1;

import javaguru.sunday.teacher.annotations.CodeReview;

//Task_3
@CodeReview(approved = true)
public class PersonDemo {

    public static void main(String[] args) {

        Person person = new Person();
        String name = person.getFullName();
        int age = person.getAge();
        Address address = person.getAddress();
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
