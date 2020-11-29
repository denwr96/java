package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson8.level1.task3;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

/* ссылочные типы данных вроде объектов String и Address принимают значение null, int принимает значение 0
пример приведен в классе PersonDemo*/
@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private Address address;

    public void getInfoAboutPerson() {
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(address);
    }

}
