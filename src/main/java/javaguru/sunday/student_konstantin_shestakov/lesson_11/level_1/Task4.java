package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class Task4 {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        String stringElement = new String("One");
        stringArrayList.add(stringElement);
        stringArrayList.add(stringElement);
        stringArrayList.add("Two");
        stringArrayList.add("Two");
        System.out.println(stringArrayList.toString());
    }
}
