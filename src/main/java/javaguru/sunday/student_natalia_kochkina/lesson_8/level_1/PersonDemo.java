package main.java.javaguru.sunday.student_natalia_kochkina.lesson_8.level_1;

//Task_3

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
