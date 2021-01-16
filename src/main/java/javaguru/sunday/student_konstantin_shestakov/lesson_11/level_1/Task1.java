package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.*;
@CodeReview(approved = true)
class Task1 {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("String array list Element");
        stringArrayList.add("String array list Element");
        stringArrayList.add("String array list Element 2");

        for (String stringArrayListElement : stringArrayList) {
            System.out.println(stringArrayListElement);
        }

        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("String linked list Element");
        stringLinkedList.add("String linked list Element");
        stringLinkedList.add("String linked list Element 2");

        for (String stringLinkedListElement : stringLinkedList) {
            System.out.println(stringLinkedListElement);
        }

    }
}
