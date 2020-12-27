package javaguru.sunday.student_konstantin_shestakov.lesson_10.level_1.task_3;

// Task 3

import javaguru.sunday.teacher.annotations.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class MyListImpl implements MyList {

    public static void main(String[] args) {
        MyList myList = new MyListImpl();
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        System.out.println(myList.findInputString(myArrayList, 3));
    }
}
