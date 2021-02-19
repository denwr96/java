package javaguru.sunday.student_artjoms_bocarovs.lesson_10.task_3;

import java.util.ArrayList;

class MyListlmpl implements MyList {

    public static void main(String[] args) {

        MyList myList = new MyListlmpl();
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(0, 1);
        myArrayList.add(1, 2);
        myArrayList.add(2, 3);
        System.out.println(myList.findInputString(myArrayList, 3));

    }
}
