package main.java.javaguru.sunday.student_konstantin_shestakov.lesson_10.level_1.task_3;

// Task 3

import java.util.ArrayList;

interface MyList {

    default boolean findInputString(ArrayList<Integer> arrayList, int inputNumber) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == inputNumber) {
                System.out.println("Input number = " + inputNumber + ", list array element = " + (i + 1));
                return true;
            }
        }
        return false;
    }
}
