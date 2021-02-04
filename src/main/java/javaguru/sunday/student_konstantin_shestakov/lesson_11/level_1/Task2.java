package javaguru.sunday.student_konstantin_shestakov.lesson_11.level_1;


import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class Task2 {

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(); // примитивные типы данных в коллекциях хранить нельзя
        integerArrayList.add(1);
        System.out.println(integerArrayList.get(0));
    }
}
