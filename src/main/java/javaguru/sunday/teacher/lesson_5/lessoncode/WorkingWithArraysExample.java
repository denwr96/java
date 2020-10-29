package main.java.javaguru.sunday.teacher.lesson_5.lessoncode;

public class WorkingWithArraysExample {

    public static void main(String[] args) {
        Human[] arrayOfHumans = new Human[3];

        arrayOfHumans[0] = new Human("Name1", 25);
        arrayOfHumans[1] = new Human("Name2", 30);
        arrayOfHumans[2] = new Human("Name3", 21);

        for (int i = 0; i < arrayOfHumans.length; i++ ) { //i++ => i = i + 1
            Human currentHuman = arrayOfHumans[i];
            System.out.println("Index " + i);
            System.out.println("Name: " + currentHuman.getName());
            System.out.println("Age: " + currentHuman.getAge());
        }
//        for (int i = arrayOfHumans.length - 1; i >= 0; i-- ) { //i++ => i = i + 1
//            Human currentHuman = arrayOfHumans[i];
//            System.out.println("Index " + i);
//            System.out.println("Name: " + currentHuman.getName());
//            System.out.println("Age: " + currentHuman.getAge());
//        }

    }
}
