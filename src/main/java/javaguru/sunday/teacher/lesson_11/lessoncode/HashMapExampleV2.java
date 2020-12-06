package main.java.javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.HashMap;
import java.util.Map;

public class HashMapExampleV2 {

    public static void main(String[] args) {
        //(bucket) index = key.hashCode() & (n - 1)
        Map<Integer, String> myFirstMap = new HashMap<>();

        myFirstMap.put(1, "String number One");
        //Node
        //key = 1
        //hash = hashCode(1-key)
        //value = "String number One"
        //Node = link to the next Node

        myFirstMap.put(2, "String number Two");
        myFirstMap.put(3, "String number Three");
        myFirstMap.put(4, "String number Four");

        String resultString = myFirstMap.get(4);
        System.out.println(resultString);
    }
}
