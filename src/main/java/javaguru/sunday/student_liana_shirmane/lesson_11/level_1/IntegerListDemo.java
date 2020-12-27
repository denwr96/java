package main.java.javaguru.sunday.student_liana_shirmane.lesson_11.level_1;
//task3

import main.java.javaguru.sunday.teacher.annotations.CodeReview;

import java.util.LinkedList;
@CodeReview(approved = true)
class IntegerListDemo {
    public static void main(String[] args) {
        IntegerListDemo integerListDemo = new IntegerListDemo();
        integerListDemo.operationsInList();
    }

    void operationsInList() {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(1); //добавить элемент в начало
        myList.addLast(5); //добавить элемент в конец
        myList.add(2, 2); //добавить элемент на определенную позицию
        myList.remove(2); //удаление по индексу
        myList.removeFirst(); //удаление первого элемента
        int myListSize = myList.size(); //размер списка
        System.out.println("Size of the list is: " + myListSize);
        myList.isEmpty(); //возращает true если нет элементов


        for (int i = 0; i < myList.size(); i++) { //обойти список и вывести на консоль каждый элемент
            Integer value = myList.get(i);
            System.out.println(value);
        }
        for (Integer i : myList) {  //обойти список и вывести на консоль каждый элемент
            System.out.println(i);
        }

    }
}