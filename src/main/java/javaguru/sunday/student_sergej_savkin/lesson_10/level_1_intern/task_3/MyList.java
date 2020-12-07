package main.java.javaguru.sunday.student_sergej_savkin.lesson_10.level_1_intern.task_3;

import java.util.ArrayList;

interface MyList {

    public void addToList(int numberToAdd);
    //adds element to List

    public int size();
    //returns the size of List

    public void removeAll();
    //removes all elements from List

    public int calculateSum(ArrayList<MyList> myList);

}
