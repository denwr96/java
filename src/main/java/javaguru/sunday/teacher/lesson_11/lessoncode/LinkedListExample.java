package main.java.javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Car> myCarCollection = new LinkedList<>();
        myCarCollection.add(new Car("Black"));
        myCarCollection.add(new Car("White"));
        myCarCollection.add(new Car("Black"));
        myCarCollection.add(new Car("Red"));
        for (Car car : myCarCollection) {
            System.out.println(car);
        }

        Car redCar = new Car("Red");

        if (myCarCollection.contains(redCar)) {
            System.out.println("Contains!");
        }
        getCar(myCarCollection, redCar);


        LinkedList<String> myFirstArrayList = new LinkedList<>();

        myFirstArrayList.add("One");
        myFirstArrayList.add("Two");
        myFirstArrayList.add("Three");
        myFirstArrayList.add("Three");
        myFirstArrayList.add("Ten");

        printArray(myFirstArrayList);

        myFirstArrayList.remove(4);
        printArray(myFirstArrayList);

        myFirstArrayList.remove("Three");
        printArray(myFirstArrayList);
        if (myFirstArrayList.contains("One")) {
            System.out.println("My collection contains one");
        }

        isMyCollectionEmpty(myFirstArrayList);

        myFirstArrayList.clear();
        isMyCollectionEmpty(myFirstArrayList);

    }

    private static Car getCar(LinkedList<Car> myCarCollection, Car redCar) {
        for (Car car : myCarCollection) {
            if (car.equals(redCar)) {
                return car;
            }
        }
        return null;
    }

    private static void isMyCollectionEmpty(LinkedList<String> myFirstArrayList) {
        if (myFirstArrayList.isEmpty()) {
            System.out.println("Collection is empty!");
        }
    }

    private static void printArray(LinkedList<String> myFirstArrayList) {
        System.out.println("");
        for (String myString : myFirstArrayList) {
            System.out.println(myString);
        }
    }
}
