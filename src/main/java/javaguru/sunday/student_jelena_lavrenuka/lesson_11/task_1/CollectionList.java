package main.java.javaguru.sunday.student_jelena_lavrenuka.lesson_11.task_1;

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class CollectionList {
    List<String> myJokeCollection = new ArrayList<>(); // используется, если чаще вводим (пополняем) список
    List<String> phoneBook = new LinkedList<>(); // используется. если чаще надо получать данные из списка
}
