package main.java.javaguru.sunday.student_kristina_sutugina.lesson_8.level_1;
//Task_3
class Person {

    private String fullName;
    private int age;
    private String address;

   Person() {
       fullName = "Kristina";
       age = 28;
       address = "Rīga";

    }
    void print(){
        System.out.println(fullName+ " "+age+" "+address);
    }
}
