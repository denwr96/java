package main.java.javaguru.sunday.student_nataliya_sinitsa.lesson11.level1.task2;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ? Что может хранить java.util.List: примитивные типы данных или ссылки на объекты, или то и другое?

// ! и то и другое
@CodeReview(approved = true)
class ListExample {

    List<String> cities = new ArrayList<>() {{
        add("New York");
        add("Rio");
        add("Tokyo");
    }};

    List<Integer> numbers = new ArrayList<>() {{
        add(1);
        add(2);
        add(3);
    }};

    List<String> products = new LinkedList<>() {{
        add("apple");
        add("banana");
        add("coconut");
    }};

    List<Integer> phoneNumbers = new LinkedList<>() {{
        add(11223344);
        add(22334455);
        add(33445566);
    }};

}
