package main.java.javaguru.sunday.student_deniss_lobacs.lesson_11.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

// task3

public class IntegerListDemo {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>(5);

        arrList.add(15);
        arrList.add(22);
        arrList.add(30);
        arrList.add(0,25);
        arrList.add(4,40);

        System.out.println(arrList.size());
        System.out.println(arrList);

        arrList.remove(0);
        arrList.remove("22");

        System.out.println(arrList.isEmpty());

        for (Integer number : arrList) {
            System.out.println("Number = " + number);
        }


    }
}
