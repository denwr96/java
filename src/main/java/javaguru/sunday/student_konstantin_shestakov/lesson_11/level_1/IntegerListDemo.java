package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;


// Task 3

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>();
        Integer integerThree = 30;
        integerArrayList.add(0, 10);
        integerArrayList.add(20);
        integerArrayList.add(30);
        integerArrayList.remove(0);
        integerArrayList.remove(integerThree);
        integerArrayList.add(40);

        System.out.println("List size = " + integerArrayList.size());
        System.out.println(integerArrayList.toString());

        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }
    }
}
