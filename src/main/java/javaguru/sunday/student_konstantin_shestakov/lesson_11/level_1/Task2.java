package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task2 {

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(); // примитивные типы данных в коллекциях хранить нельзя
        integerArrayList.add(new Integer(1));
        System.out.println(integerArrayList.get(0));
    }
}
