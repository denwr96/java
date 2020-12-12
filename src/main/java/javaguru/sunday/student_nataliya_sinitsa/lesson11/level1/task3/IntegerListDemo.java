package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task3;

import java.util.LinkedList;

class IntegerListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.addFirst(4);
        integerList.addFirst(3);
        integerList.addFirst(2);
        integerList.addFirst(1);
        integerList.addLast(5);

        System.out.println(integerList.size());

        integerList.remove(4);
        integerList.removeFirstOccurrence(4);

        System.out.println(integerList.isEmpty());

        for (int integer : integerList) {
            System.out.println(integer);
        }
    }

}
