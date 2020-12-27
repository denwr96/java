package javaguru.sunday.student_sergej_savkin.lesson_11.level_1_intern.task_1;

import java.util.LinkedList;
import java.util.List;

class LinkedListUtilDemo {
    public static void main(String[] args) {
        List<Integer> nummbers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            nummbers.add(0, i);
        }

        long stop = System.currentTimeMillis();

        long result = stop - start;

        System.out.println("Elements added " + nummbers.size());
        System.out.println("Time " + result + " ms");
    }
}
