package javaguru.sunday.student_artjoms_bocarovs.lesson_10.task_3;

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
