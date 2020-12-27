package javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_1_intern;

// task4

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ArrayListExample {
    public static void main(String[] args) {

        List<String> arrList = new ArrayList<>();
        arrList.add("One");
        arrList.add("Two");
        arrList.add("Three");
        arrList.add("Three");
        arrList.add("Ten");
        System.out.println("arrList = " + arrList);

        Set<String> cities = new HashSet<>();
        cities.add("Riga");
        cities.add("Ogre");
        cities.add("Riga");
        System.out.println("cities = " + cities);
    }
}
